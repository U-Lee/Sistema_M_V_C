package vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import controlador.RadarTipoActualiza;

public class JPanelActualizar extends JPanel {
	
	public JButton btnSalir;
	public JButton btnModificarHongo;
	public JButton buttonAgregarHongo;
	public RadarTipoActualiza radarTipoActualiza;
	/**
	 * Create the panel.
	 */
	public JPanelActualizar() {
		radarTipoActualiza = new RadarTipoActualiza();
		
		btnModificarHongo = new JButton("Modifica Hongo");
		btnModificarHongo.addActionListener(radarTipoActualiza);
		
		buttonAgregarHongo = new JButton("Agrega Hongo");
		buttonAgregarHongo.addActionListener(radarTipoActualiza);
		
		btnSalir = new JButton("salir");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(378, Short.MAX_VALUE)
					.addComponent(btnSalir)
					.addGap(21))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(136)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModificarHongo)
						.addComponent(buttonAgregarHongo, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(205, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(buttonAgregarHongo)
					.addGap(61)
					.addComponent(btnModificarHongo)
					.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
					.addComponent(btnSalir)
					.addGap(22))
		);
		setLayout(groupLayout);

	}

}
