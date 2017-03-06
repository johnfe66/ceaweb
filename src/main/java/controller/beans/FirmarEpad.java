package controller.beans;

import java.io.File;
import java.io.IOException;

import javax.faces.FacesException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;

import org.primefaces.event.CaptureEvent;


@ManagedBean
@ViewScoped
public class FirmarEpad   {

	 
	private String ImageContentBase64;
	
	
	
	public FirmarEpad() {
		
	}


	public void mostrarFirma(){
				
		System.out.println(ImageContentBase64);
		
	}

	public String getImageContentBase64() {
		return ImageContentBase64;
	}

	

	public void setImageContentBase64(String imageContentBase64) {
		ImageContentBase64 = imageContentBase64;
	}

	

}
