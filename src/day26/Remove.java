package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import day25.MySQLConnection;

public class Remove extends Thread{
	@Override
	public void run() {
		try {
			Connection con = MySQLConnection.getConnection();
			
			String query1="delete from emp where eno=11";    
			String query2="delete from emp where eno=12";
			String query3="delete from emp where eno=13";
			Statement sDelete=con.createStatement();
			
			sDelete.addBatch(query1);
			sDelete.addBatch(query2);
			sDelete.addBatch(query3);
			
			int rows1[]=sDelete.executeBatch();
			
			System.out.println(rows1.length + " records deleted");
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
