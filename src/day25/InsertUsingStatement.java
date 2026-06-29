package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws Exception{
		Connection connection = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/mydatabase_db", "root", ""
			);  
		
		String query="Insert into emp values(1,'Alice',800.0)";
		
		Statement st=connection.createStatement();
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " records inserted");
		
		st.close();
		connection.close();

	}

}
