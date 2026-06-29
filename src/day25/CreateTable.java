package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception{
		Connection connection = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/mydatabase_db", "root", ""
			);  
		
//		System.out.println(connection.isClosed());
		
		
		String query="create table emp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(20) not null,\r\n"
				+ "sal numeric(7,2))";
		
		Statement st=connection.createStatement();
		
		st.execute(query);
		
		System.out.println("Table is Created Successfully");
		
		st.close();
		connection.close();
		

	}

}
