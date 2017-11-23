package modelo;

import java.awt.Image;
import java.util.ArrayList;

public class Hongo {
	private String nombre;
	private String division;
	private String subdivision;
	private String clase;
	private String subclase;
	private String orden;
	private String familia;
	private String subfamilia;
	private String genero;
	private String color;
	private String reproduccion;
	private ArrayList<Cultivo> hospedantes;
	private String descripcionEReproductiva;
	private Image imgERerproductiva;
	
	
	public Hongo(){
		nombre = "";
		division = "";
		subdivision = "";
		clase = "";
		subclase = "";
		orden = "";
		familia = "";
		subfamilia = "";
		genero = "";
		color = "";
		reproduccion = "";
		imgERerproductiva = null;
		descripcionEReproductiva = "";
		hospedantes = new ArrayList<Cultivo>();	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getSubdivision() {
		return subdivision;
	}
	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getSubclase() {
		return subclase;
	}
	public void setSubclase(String subclase) {
		this.subclase = subclase;
	}
	public String getOrden() {
		return orden;
	}
	public void setOrden(String orden) {
		this.orden = orden;
	}
	public Image getImgERerproductiva() {
		return imgERerproductiva;
	}
	public void setImgERerproductiva(Image imgERerproductiva) {
		this.imgERerproductiva = imgERerproductiva;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getSubfamilia() {
		return subfamilia;
	}
	public void setSubfamilia(String subfamilia) {
		this.subfamilia = subfamilia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getReproduccion() {
		return reproduccion;
	}
	public void setReproduccion(String reproduccion) {
		this.reproduccion = reproduccion;
	}
	
	public String getDescripcionEReproductiva() {
		return descripcionEReproductiva;
	}
	public void setDescripcionEReproductiva(String descripcionEReproductiva) {
		this.descripcionEReproductiva = descripcionEReproductiva;
	}
	
	public boolean agregarHospedante(Cultivo cultivo){
        boolean exito= false;
        if (cultivo != null){
        	hospedantes.add(cultivo);
            exito = true;
        }
        return exito;
	}
	/*falta definir el algoritmo de busqueda 
	public Cultivo buscarHospedante(String nombreHospedante){		
		return cultivo;
	}*/
	
	
}
