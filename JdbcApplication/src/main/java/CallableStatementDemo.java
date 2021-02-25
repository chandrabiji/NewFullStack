import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			//step1:Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:Establish the Connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amist", "root", "root");
			//step3:Prepare the statement
			CallableStatement cs = con.prepareCall("{call proc1(?,?)}");
			cs.setInt(1,2);
			cs.registerOutParameter(2, Types.INTEGER);
			
			//step4:Execute the query
			cs.execute();
			int result = cs.getInt(2);
			System.out.println("Sqrt Value = "+result);
			//step5:Close the statement and Connection
			cs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
