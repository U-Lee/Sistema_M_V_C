package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.JDialogAgregarCultivo;
import vista.JDialogAgregarSintoma;

public class RadarBotonSintoma implements ActionListener {
	public JDialogAgregarSintoma jDialogAgregarSintoma;

	public void actionPerformed(ActionEvent ae) {
		jDialogAgregarSintoma = new JDialogAgregarSintoma();
		jDialogAgregarSintoma.setVisible(true);
		
	}

}
