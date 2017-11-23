package modelo;

import java.awt.Image;

public class Sintoma {
	private String nombreSintoma;
	private String zonaAfectada;
	private Image imagenSintoma;
	
	public Sintoma(){
		nombreSintoma = "";
		zonaAfectada = "";
		imagenSintoma = null;
	}
	
	public String getNombreSintoma() {
		return nombreSintoma;
	}
	public void setNombreSintoma(String nombreSintoma) {
		this.nombreSintoma = nombreSintoma;
	}
	public String getZonaAfectada() {
		return zonaAfectada;
	}
	public void setZonaAfectada(String zonaAfectada) {
		this.zonaAfectada = zonaAfectada;
	}
	public Image getImagenSintoma() {
		return imagenSintoma;
	}
	public void setImagenSintoma(Image imagenSintoma) {
		this.imagenSintoma = imagenSintoma;
	}
	
}
