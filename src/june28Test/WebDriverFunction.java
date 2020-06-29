package june28Test;

import org.openqa.selenium.WebDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class WebDriverFunction {
WebDriver driver;

	public void dbConnection() throws SQLException{
		String connectionUrl =
				"jdbc:sqlserver://yourserver.database.windows.net:1433;"
						+ "database=AdventureWorks;"
						+ "user=yourusername@yourserver;"
						+ "password=yourpassword;"
						+ "encrypt=true;"
						+ "trustServerCertificate=false;"
						+ "loginTimeout=30;";

		Connection connection = DriverManager.getConnection(connectionUrl);
		System.out.println ("my database is connected now" + connection);
	}
	
	public void getCurrentTimef1() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
		Date date = new Date();  
		System.out.println(formatter.format(date)); 
		System.out.println (" my test suite started at this time --> " +formatter.format(date));
		
	}
	public void getCurrentTimef2() {
		       //getting current date and time using Date class
		       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		       Date dateobj = new Date();
		       System.out.println(df.format(dateobj));

		       /*getting current date time using calendar class 
		        * An Alternative of above*/
		       Calendar calobj = Calendar.getInstance();
		       System.out.println(df.format(calobj.getTime()));
		  
	}
}
