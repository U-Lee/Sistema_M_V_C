package modelo;

import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Hongo> hongos;
	private Hongo hongo;
	public boolean agregarHongos(Hongo hongo){
		 boolean exito= false;
	        if (hongo != null){
	        	hongos.add(hongo);
	           exito = true;
	        }
	        return exito;
		
	}
	
	public Hongo buscarHongo(String nombreHongo){		
		return hongo;
	}
	
	
	

}
