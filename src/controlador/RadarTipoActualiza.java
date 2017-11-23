package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.BuscaHongo;
import vista.JDialogAgregarHongo;
import vista.JPanelActualizar;

public class RadarTipoActualiza implements ActionListener {
	private JDialogAgregarHongo jDialogAgregarHongo;
	private JPanelActualizar jPanelActualizar;
	private BuscaHongo buscaHongo;
	public void actionPerformed(ActionEvent ae) {
		jPanelActualizar = new JPanelActualizar();
		
		if(jPanelActualizar.buttonAgregarHongo.getText().equalsIgnoreCase("Agrega Hongo")){
			jDialogAgregarHongo = new JDialogAgregarHongo();
			jDialogAgregarHongo.setVisible(true);
		}else{
			if(jPanelActualizar.buttonAgregarHongo.getText().equalsIgnoreCase("Modifica Hongo"))
			buscaHongo = new BuscaHongo();
			buscaHongo.setVisible(true);
		}
		
		
	}

}
