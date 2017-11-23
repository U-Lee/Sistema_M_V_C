package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Catalogo;
import modelo.Cultivo;
import modelo.Hongo;
import vista.JDialogAgregarHongo;

public class RadarAgregarHongo implements ActionListener {
	
	private Hongo hongo;
	private JDialogAgregarHongo jDialogAgregarHongo;
	private Catalogo catalogo; 
	private boolean exito;
	private RadarAgregarCultivo radarAgregarCultivo;
	
	@Override
	public void actionPerformed(ActionEvent e){
		catalogo = new Catalogo();
		hongo = new Hongo();
		jDialogAgregarHongo = new JDialogAgregarHongo();
		exito = false;
		radarAgregarCultivo = new RadarAgregarCultivo();
		
		hongo.setDivision(jDialogAgregarHongo.textFieldDivision.getText());
		hongo.setSubdivision(jDialogAgregarHongo.textFieldSubdivision.getText());
		hongo.setClase(jDialogAgregarHongo.textFieldClase.getText());
		hongo.setSubclase(jDialogAgregarHongo.textFieldsubClase.getText());
		hongo.setOrden(jDialogAgregarHongo.textFieldOrden.getText());
		hongo.setFamilia(jDialogAgregarHongo.textFieldFamilia.getText());
		hongo.setSubfamilia(jDialogAgregarHongo.textFieldSubfamilia.getText());
		hongo.setGenero(jDialogAgregarHongo.textFieldGenero.getText());
		
		hongo.setNombre(jDialogAgregarHongo.textFieldNombre.getText());
		hongo.setColor(jDialogAgregarHongo.textFieldColor.getText());
		
		hongo.setReproduccion(jDialogAgregarHongo.textFieldReproduccion.getText());
		hongo.setDescripcionEReproductiva(jDialogAgregarHongo.textFieldDescripcionEReproductiva.getText());
		
		exito = catalogo.agregarHongos(hongo);
		radarAgregarCultivo.asignaHongo(hongo);
		
		
		
	}
	public void asignaCatalogo(Catalogo catalogo){
		this.catalogo = catalogo;
	}
	
	
	
}
