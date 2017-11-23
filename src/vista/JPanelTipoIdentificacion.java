package vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

public class JPanelTipoIdentificacion extends JPanel {
	JButton btnIdentificacionHospedante;
	JButton btnIdentificacionAPartir;

	/**
	 * Create the panel.
	 */
	public JPanelTipoIdentificacion() {
		
		btnIdentificacionHospedante = new JButton("Identificación a partir de Cultivo Hospedante");
		btnIdentificacionAPartir = new JButton("Identificación a partir de Estructura Reproductiva");
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnIdentificacionHospedante, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnIdentificacionAPartir, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(btnIdentificacionHospedante)
					.addGap(41)
					.addComponent(btnIdentificacionAPartir)
					.addContainerGap(147, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
