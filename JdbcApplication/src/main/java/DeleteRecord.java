import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			//step3:Prepare the statement
			Statement st = con.createStatement();
			//step4:Execute the query
			int n = st.executeUpdate("delete from product where pdi=2");
			if(n!=0)
			{
				System.out.println("Successfully one record deleted...");
			}else {
				System.out.println("Record Notable to Deleted.Please try again....");
			}
			//step5: close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
