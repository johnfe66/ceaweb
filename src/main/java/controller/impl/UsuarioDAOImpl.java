package controller.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import configuration.Conexion;
import controller.dao.IUsuarioDAO;
import model.Usuario;

public class UsuarioDAOImpl implements IUsuarioDAO {
	
	private Connection cx;

	public UsuarioDAOImpl() {
		
	}

	@Override
	public void agregar(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificar(Usuario usuari) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> login(String usuarioIn, String claveIn) {
		
		
		List<Object> datosLogin = null;
		
		try {
			cx = Conexion.conectar();
			cx.setAutoCommit(false);
			String query = "SELECT usuario.id, "
					+ "concat(persona.nombre,' ',persona.apellidos) as nombre, "
					+ "empresa.nombre as empresa, "
					+ "cargousuario.cargo as cargo "
					+ "FROM usuario "
					+ "INNER JOIN persona ON usuario.idpersona=persona.id "
					+ "INNER JOIN empresa ON usuario.idempresa=empresa.id "
					+ "INNER JOIN cargousuario ON usuario.idcargousuario=cargousuario.id "
					
					+ "WHERE usuario.usuario=? and usuario.clave=? and usuario.idestado=1;";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, usuarioIn);
			preparedStatement.setString(2, claveIn);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				datosLogin = new ArrayList<>();
				datosLogin.add(resultSet.getInt("id"));
				datosLogin.add(resultSet.getString("nombre"));
				datosLogin.add(resultSet.getString("empresa"));
				datosLogin.add(resultSet.getString("cargo"));
				
								
			}
			resultSet.close();
			preparedStatement.close();
			cx.commit();
			//cx.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return datosLogin;
	}

}
