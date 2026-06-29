package day25;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

		static Connection connection=null;
		static final String databasURL="jdbc:mysql://localhost:3306/";
		static final String databaseName="mydatabase_db";
		static final String databaseUserName="root";
		static final String databasePassword="";
		
		public static Connection getConnection() throws Exception {
			 connection = DriverManager.getConnection(
					 databasURL+databaseName, databaseUserName, databasePassword
			);  
			return connection;
		}


}
