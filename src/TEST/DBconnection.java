package TEST;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	Connection con;
	
	public DBconnection(String url,String name ,String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.con = DriverManager.getConnection(url,name,password);
		
		
	}
	public Connection getConnection(){
		 
        return this.con;
	 }

	 public void closeConnection() throws SQLException {
		 
	         if (this.con != null)
	                 this.con.close();
	 }


}