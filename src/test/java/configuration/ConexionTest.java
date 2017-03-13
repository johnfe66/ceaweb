package configuration;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import configuration.Conexion;

public class ConexionTest {

	@Test
	public void test() {
		Connection cnx= null;
		cnx = Conexion.conectar();
		
		
		assertNotNull(cnx);
	}

}
