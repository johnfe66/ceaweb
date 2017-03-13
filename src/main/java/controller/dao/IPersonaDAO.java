package controller.dao;

import java.util.List;

import model.Persona;

public interface IPersonaDAO {
	
	public void agregar(Persona persona);
	public void modificar(Persona persona);
	public List<Persona> listar();
	public Persona buscarById(int id);

}
