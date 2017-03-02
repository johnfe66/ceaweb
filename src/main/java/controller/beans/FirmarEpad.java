package controller.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
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
