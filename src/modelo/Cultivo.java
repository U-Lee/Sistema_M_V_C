package modelo;

import java.awt.Image;
import java.util.ArrayList;

public class Cultivo {
	private String tipoCultivo;
	private String nombreCultivo;
	private Image imagenCultivo;
	private ArrayList<Sintoma> sintomas;
	
	public Cultivo(){
		tipoCultivo = "";
		nombreCultivo = "";
		imagenCultivo = null;
		sintomas = new ArrayList<Sintoma>();
	}
	
	
	public String getTipoCultivo() {
		return tipoCultivo;
	}
	public void setTipoCultivo(String tipoCultivo) {
		this.tipoCultivo = tipoCultivo;
	}
	public String getNombreCultivo() {
		return nombreCultivo;
	}
	public void setNombreCultivo(String nombreCultivo) {
		this.nombreCultivo = nombreCultivo;
	}
	public Image getImagenCultivo() {
		return imagenCultivo;
	}
	public void setImagenCultivo(Image imagenCultivo) {
		this.imagenCultivo = imagenCultivo;
	}

	public boolean agregarSintoma(Sintoma sintoma){
        boolean exito= false;
        if (sintoma != null){
           sintomas.add(sintoma);
           exito = true;
        }
        return exito;
	}
	
	
	/*definir algoritmo de busqueda de sintoma
	public Sintoma buscarSintoma(String nombreSintoma){		
		return sintoma;
	}*/
	
	
	
	
	
}
