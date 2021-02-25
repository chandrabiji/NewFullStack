import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {

	public static void main(String[] args) {
		try {
			//step1:Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			//step3:Prepare the statement
			Statement st = con.createStatement();
			st.addBatch("insert into product values(2,'xyz',70,700)");
			st.addBatch("update product set pname='abc' where pdi=1");
			//step4:Execute the query
			int[] n = st.executeBatch();
			System.out.println("effeted rows : "+n.length);
			//step5:close the statement and connection
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
