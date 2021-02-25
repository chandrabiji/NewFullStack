import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetRecords {

	public static void main(String[] args) {
		try {
			//step1:Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			//step3:Prepare the statement
			Statement st = con.createStatement();
			//step4:execute the query
			ResultSet rs = st.executeQuery("select * from product");
			System.out.println("PID"+"\t"+"PNAME"+"\t"+"QTY"+"\t"+"PRICE");
			System.out.println("-----------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getDouble(4));
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
