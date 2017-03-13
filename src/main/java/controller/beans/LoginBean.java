package controller.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import controller.dao.IUsuarioDAO;
import controller.impl.UsuarioDAOImpl;

@ManagedBean
@RequestScoped
public class LoginBean {
	
	private String clave;
	private String usuario;

	public LoginBean() {
		//TODO
	}
	
	 public void login(ActionEvent event) {
		 
		    IUsuarioDAO dao= new UsuarioDAOImpl();
		    
		    
		    List<Object> listaDatosLogin;
		    
		    boolean logueo=false;
		    
		    
	        RequestContext context = RequestContext.getCurrentInstance();
		    
	        FacesMessage mensaje = null;
	        
	        listaDatosLogin=dao.login(this.usuario, this.clave);
	         
	        String pagina=null;
	        
			if(listaDatosLogin!=null) {
				logueo=true;
	            mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", listaDatosLogin.get(1).toString());
	            pagina="/CEAWEB/view/formacion/matricula.xhtml";
	            
	        } else {
	        	logueo=false;
	            mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error login", "Credenciales Invalidas");
	            pagina="/CEAWEB/view/login.xhtml";
	        }
	         
	        FacesContext.getCurrentInstance().addMessage("hola", mensaje);
	        
	        context.addCallbackParam("logueo", logueo);
	        context.addCallbackParam("pagina", pagina);
	    } 

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
