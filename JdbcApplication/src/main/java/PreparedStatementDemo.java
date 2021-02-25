import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		try {
			// step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			//step3:Prepare the statement
			PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, 3);
			ps.setString(2, "pqr");
			ps.setInt(3,40);
			ps.setDouble(4, 400);
			//step4:Execute the query
			int n = ps.executeUpdate();
			if(n!=0)
			{
				System.out.println("One Record Successfully Inserted.....");
			}else {
				System.out.println("Record Notable to Inserted..Please try again....");
			}
			//step5:Close the statement and connection
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
