package com.adarsh;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DataSourceConnection {
	
	private static Context ctx = null;
	private static Connection con=null;
	
	private static DataSource ds = null;
	
	/*public static void main(String[] args) {
		DataSourceConnection d = new DataSourceConnection();
		getConnection2();
	}*/
	
	public static Connection getConnection2() throws NamingException {
		
		if(con!=null){
			return con;
		}
		else {
			try {
				ctx = new InitialContext();
				DataSource ds = (DataSource)ctx.lookup("jdbc/com/env/jdbc/AdarshDB");
				con=ds.getConnection();

			}catch(SQLException e) {
				return con;
				
			}
			return con;
		}
		
	}
	

}
