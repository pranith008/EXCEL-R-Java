package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUsingStatement2 {

	public static void main(String[] args) throws Exception{
		Connection connection = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/mydatabase_db", "root", ""
			);  
		
		
		Statement st=connection.createStatement();
		
		String query="Update emp set sal=1500 where ename='Chris'";
		
		
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " records updated");
		
		st.close();
		connection.close();

	}

}
