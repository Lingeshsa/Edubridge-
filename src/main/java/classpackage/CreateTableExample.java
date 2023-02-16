package classpackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydatabase", "root", "");
			Statement statement=connection.createStatement();
			String str="create table Lingesh"
					+"(stdId int,"
					+"stname varchar(30),"
					+"marks double,"
					+"mobileno varchar(10))";
			statement.execute(str);
			
		}catch (ClassNotFoundException ex ) {
			System.out.println(ex.getMessage());
		}catch(SQLException ex){
			System.out.println(ex.getMessage());

			
		}
		//connect to database
		
		//statement object
		//execute the statement
		
	}

}
