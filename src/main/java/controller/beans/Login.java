package controller.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

@ManagedBean
@RequestScoped
public class Login {
	
	private String clave;
	private String usuario;

	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	 public void login(ActionEvent event) {
	        RequestContext context = RequestContext.getCurrentInstance();
		 
	        FacesMessage mensaje = null;
	        boolean logueo = false;
	         
	        String pagina=null;
	        
			if(usuario != null && usuario.equals("admin") && clave != null && clave.equals("admin")) {
	        	logueo = true;
	            mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", usuario);
	            pagina="/CEAWEB/view/formacion/matricula.xhtml";
	        } else {
	        	logueo = false;
	            mensaje = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error login", "Credenciales Invalidas");
	            pagina="/CEAWEB/view/login.xhtml";
	        }
	         
	        FacesContext.getCurrentInstance().addMessage(null, mensaje);
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
