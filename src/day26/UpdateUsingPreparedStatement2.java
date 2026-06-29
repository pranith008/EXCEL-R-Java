package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import day25.MySQLConnection;

public class UpdateUsingPreparedStatement2 {

	public static void main(String[] args) throws Exception{
		// accept eno & increment amount and increment the salary of that employee by that amount
		Connection con=MySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number ");
		int a=sc.nextInt();
		System.out.println("Enter increment salary");
		double b=sc.nextDouble();
		
		String query="Update emp set sal=sal+? where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setDouble(1, b);
		ps.setInt(2, a);
	
		
		int rows=ps.executeUpdate();
		System.out.println(rows+" records are updated");
		
		ps.close();
		con.close();

	}

}
