package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) throws Exception{
		Connection connection = MySQLConnection.getConnection();
		
		
		Statement st=connection.createStatement();
		
		String query="Delete from emp  where ename='Elcid'";
		
		
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " records deleted");
		
		st.close();
		connection.close();

	}

}
