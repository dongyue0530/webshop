package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.Dao;

public class submitOrder {
public static boolean insert( ) {
		
		Dao dao = new Dao();
		Connection connection = dao.getConn();
		//3.创建Statement对象,并执行响应sql语句，获取图书列表
		java.sql.PreparedStatement pre ;
		String sqlStr = "INSERT INTO userorder SELECT * FROM shopcart";
		
		
			
			 try {
				
				pre = connection.prepareStatement(sqlStr);
				
				int i= pre.executeUpdate();
				
				if(i>0) {
					return true;
					
				}else {
					return false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return false;
}
}
