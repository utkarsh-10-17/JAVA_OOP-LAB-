import java.sql.*;

public class testsql {
	public static void main(String args[]) {
		try
		{
			Class.forName("com.mysql,jdbc,Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root" ,"");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from second_year ");
			while(rs.next())
				System.out.println(rs.getInt(1) +" " + rs.getString(2) + " " + rs.getString(3));
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	

}
