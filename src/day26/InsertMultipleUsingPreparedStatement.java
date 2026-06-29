package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import day25.MySQLConnection;

public class InsertMultipleUsingPreparedStatement {

	public static void main(String[] args) throws Exception{
		Connection con=MySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees to be inserted");
		int count=sc.nextInt();
		

		String query="Insert into emp values(?,?,?)";

		PreparedStatement ps=con.prepareStatement(query);
		for (int i=1;i<=count;i++) {
			System.out.println("Enter employee number ");
			int a=sc.nextInt();
			System.out.println("Enter employee name ");
			String b=sc.next();
			System.out.println("Enter employee salary ");
			double c=sc.nextDouble();

			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setDouble(3, c);
			ps.addBatch();
		}
		
		int rows[]=ps.executeBatch();
		System.out.println(rows.length+" records are inserted");
		
		ps.close();
		con.close();

	}

}
