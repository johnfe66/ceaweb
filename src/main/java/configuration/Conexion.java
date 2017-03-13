package configuration;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class Conexion {

	public Conexion() {
		// TODO Auto-generated constructor stub
	}
	
	protected static Connection cx;

	public static Connection conectar() {
		if (cx != null) {
			return cx;
		}
		
		InputStream inputStream = Conexion.class.getClassLoader().getResourceAsStream("configuration/db.properties");
		Properties properties = new Properties();
		try {
			properties.load(inputStream);
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			Class.forName(driver);
			cx = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cx;
	}

	public static void desconectar() {
		if (cx == null)
			return;
		try {
			cx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
