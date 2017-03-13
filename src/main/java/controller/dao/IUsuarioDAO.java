package controller.dao;

import java.util.List;


import model.Usuario;

public interface IUsuarioDAO {
	
	public void agregar(Usuario usuario);
	public void modificar(Usuario usuari);
	public List<Usuario> listar();
	public Usuario buscarById(int id);
	public List<Object> login(String usuarioIn, String claveIn);

}
