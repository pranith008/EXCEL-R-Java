package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import day25.MySQLConnection;

public class UpdateMultipleUsingPreparedStatement {

	public static void main(String[] args) throws Exception{
		Connection con=MySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees to be inserted");
		int count=sc.nextInt();
		

		String query="Insert into emp values(?,?,?)";

		PreparedStatement psI=con.prepareStatement(query);
		for (int i=1;i<=count;i++) {
			System.out.println("Enter employee number ");
			int a=sc.nextInt();
			System.out.println("Enter employee name ");
			String b=sc.next();
			System.out.println("Enter employee salary ");
			double c=sc.nextDouble();

			psI.setInt(1, a);
			psI.setString(2, b);
			psI.setDouble(3, c);
			psI.addBatch();
		}
		
		int rows[]=psI.executeBatch();
		System.out.println(rows.length+" records are inserted");
		
		psI.close();
		
		String query1="delete from emp where eno=11";    
		String query2="delete from emp where eno=12";
		String query3="delete from emp where eno=13";
		Statement sDelete=con.createStatement();
		
		sDelete.addBatch(query1);
		sDelete.addBatch(query2);
		sDelete.addBatch(query3);
		
		int rows1[]=sDelete.executeBatch();
		
		System.out.println(rows1.length + " records deleted");
		sDelete.close();
		con.close();

	}

}
