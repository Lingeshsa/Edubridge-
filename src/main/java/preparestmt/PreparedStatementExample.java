package preparestmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydatabase", "root", "");
		/*
		 * PreparedStatement stmt =
		 * connection.prepareStatement("insert into Class values(?,?,?,?)");
		 * stmt.setInt(1, scanner.nextInt()); stmt.setString(2,scanner.next());
		 * stmt.setDouble(3, scanner.nextDouble()); stmt.setString(4,scanner.next());
		 * int res = res=stmt.executeUpdate(); if(res == 1) {
		 * System.out.println("Upadated");
		 * 
		 * }
		 */
		
		PreparedStatement stmt=connection.prepareStatement("update Class set stdId=?,stname=?,marks=?,mobileno=? ");
		stmt.setInt(1, 1);
		stmt.setString(2,"Hema" );
		stmt.setDouble(3, 1000.9);
		stmt.setString(4, "984276151");
	
		int res=stmt.executeUpdate();
		if(res>=1) {
			System.out.println("Updated");
		}
	}

}
