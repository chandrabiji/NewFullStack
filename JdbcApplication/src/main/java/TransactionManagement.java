import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			con.setAutoCommit(false);
			//step3:Prepare the statement
			Statement st = con.createStatement();
			//step4:Execute the query
			int n = st.executeUpdate("insert into product values(4,'xxx',50,500)");
			con.commit();
			if(n!=0)
			{
				System.out.println("One Record Successfully Inserted.....");
			}else {
				System.out.println("Record Notable to Inserted......");
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
