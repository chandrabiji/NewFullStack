import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateProductTable {

	public static void main(String[] args) {
		try {
			//step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2:Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/7amsession", "root", "root");
			
			//step3:Prepare the statement
			Statement st = con.createStatement();
			
			//step4:Execute the query
			st.execute("CREATE TABLE `7amsession`.`product` (\r\n"
					+ "  `pdi` INT NOT NULL,\r\n"
					+ "  `pname` VARCHAR(45) NULL,\r\n"
					+ "  `qty` INT(5) NULL,\r\n"
					+ "  `price` DOUBLE NULL,\r\n"
					+ "  PRIMARY KEY (`pdi`))");
			System.out.println("Table Created");
			//step5:Close the connection and statement
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
