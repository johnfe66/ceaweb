package model;

public class Empresa {
	
	private int id;
	private String nombre;
	private String nit;
	private String ciudad ;
	private String telefono;
	private String direccion;
	private int IdEstado;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getIdEstado() {
		return IdEstado;
	}


	public void setIdEstado(int idEstado) {
		IdEstado = idEstado;
	}



	public Empresa() {
		// TODO Auto-generated constructor stub
	}

}
