package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JDialogAgregarCultivo;
import vista.JDialogAgregarSintoma;

public class RadarBotonSiguienteDialog implements ActionListener {
	private JDialogAgregarCultivo jDialogAgregarCultivo;
	

	public void actionPerformed(ActionEvent arg0) {
	
		jDialogAgregarCultivo = new JDialogAgregarCultivo();
		jDialogAgregarCultivo.setVisible(true);

	}

}
