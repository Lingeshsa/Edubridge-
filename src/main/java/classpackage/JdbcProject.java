package classpackage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcProject {


public static Statement getStatement() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydatabase", "root", "");
	Statement statement=connection.createStatement();
	return statement;
}
public static int insertData() throws ClassNotFoundException, SQLException{
	Statement statement=getStatement();
	String str= "insert into Lingesh values(100,'V',98.76,'8672324378') ";
	
	int res=statement.executeUpdate(str);
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int res= insertData();
			if(res==1) {
				System.out.println("Insert successful");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		//connect to database
	
		//statement object
		//execute the statement
	}

}
