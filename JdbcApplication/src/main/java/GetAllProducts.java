import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GetAllProducts {

	public static void main(String[] args) {
		try {
			// step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			//step3:Prepare the statement
			PreparedStatement ps = con.prepareStatement("select * from product");
			//step4:Execute the query
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t"+rsmd.getColumnName(3)+"\t"+rsmd.getColumnName(4));
			System.out.println("----------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getDouble(4));
			}
			//step5:close the statement and connection
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
