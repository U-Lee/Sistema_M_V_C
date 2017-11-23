package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Cultivo;
import modelo.Hongo;
import modelo.Sintoma;
import vista.JDialogAgregarSintoma;

public class RadarAgregarSintoma implements ActionListener {
	private JDialogAgregarSintoma jDialogAgregarSintoma;
	private Sintoma sintoma;
	private Cultivo hospedante;
	private boolean exito;
	
	public void actionPerformed(ActionEvent e){
		exito = false;
		sintoma = new Sintoma();
		hospedante = new Cultivo();
		jDialogAgregarSintoma = new JDialogAgregarSintoma();
		
		sintoma.setNombreSintoma(jDialogAgregarSintoma.textFieldSintoma.getText());
		sintoma.setZonaAfectada(jDialogAgregarSintoma.textFieldZonaAfectada.getText());
		
		exito = hospedante.agregarSintoma(sintoma);						
	}
	public void asignaHospedante(Cultivo hospedante){ //vinculo con
		this.hospedante = hospedante;
	}
	
	
	

}
