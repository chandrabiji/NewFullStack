import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProduct {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			
			//step3:Prepare the statement
			Statement st = con.createStatement();
			
			//step4:Execute the query
			int n = st.executeUpdate("update product set pname='soap' where pdi=1");
			if(n!=0)
			{
				System.out.println("One Product Successfully Updated....");
			}else {
				System.out.println("Product Notable to Updated....");
			}
			
			//step5:Close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
