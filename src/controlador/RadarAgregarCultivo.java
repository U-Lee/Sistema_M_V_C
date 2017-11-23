package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JDialogAgregarCultivo;
import vista.JDialogAgregarSintoma;
import modelo.Cultivo;
import modelo.Hongo;
import modelo.Sintoma;

public class RadarAgregarCultivo implements ActionListener {
	private JDialogAgregarCultivo jDialogAgregarCultivo;
	private Cultivo hospedante; 
	private Hongo hongo;
	private boolean exito;
	private RadarAgregarSintoma radarSintoma;
		


	public void actionPerformed(ActionEvent arg0) {	
		exito = false;
		hospedante = new Cultivo();
		hongo = new Hongo();
		jDialogAgregarCultivo = new JDialogAgregarCultivo();
		radarSintoma = new RadarAgregarSintoma();
		
		radarSintoma.asignaHospedante(hospedante);//vinc
	
		hospedante.setTipoCultivo(jDialogAgregarCultivo.textFieldtipoCultivo.getText());
		hospedante.setNombreCultivo(jDialogAgregarCultivo.textFieldNombreCultivo.getText());
		//falta agregar imagen
		exito = hongo.agregarHospedante(hospedante);
		
	}
	
	public void asignaHongo(Hongo hongo){
		this.hongo = hongo;
	}
	

}
