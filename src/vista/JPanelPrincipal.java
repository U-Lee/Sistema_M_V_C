package vista;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import java.awt.Font;

public class JPanelPrincipal extends JPanel {
	public JPanelActualizar jPanelActualizar;
	public JPanelTipoIdentificacion jPanelTipoIdentificacion;
	public JTabbedPane tabbedPane;

	/**
	 * Create the panel.
	 */
	public JPanelPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		jPanelTipoIdentificacion = new JPanelTipoIdentificacion();
		tabbedPane.addTab("Identificar Hongo", null, jPanelTipoIdentificacion);
		
		jPanelActualizar = new JPanelActualizar();
		jPanelActualizar.btnModificarHongo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		jPanelActualizar.buttonAgregarHongo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tabbedPane.addTab("Actualizar Información", null, jPanelActualizar);
	}

}
