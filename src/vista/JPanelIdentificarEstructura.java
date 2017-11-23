package vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class JPanelIdentificarEstructura extends JPanel {
	private JTextField textFieldNombre;
	private JTextField textFieldColor;

	/**
	 * Create the panel.
	 */
	public JPanelIdentificarEstructura() {
		
		JLabel lblNombre = new JLabel("Nombre");
		
		JLabel lblColor = new JLabel("Color:");
		
		JLabel lblDescribeEstrucruraReproductiva = new JLabel("Describe Estrucrura Reproductiva:");
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		
		textFieldColor = new JTextField();
		textFieldColor.setColumns(10);
		
		JTextPane textPaneDescripcionEstructuraR = new JTextPane();
		
		JButton btnAceptarIdentificacion = new JButton("Aceptar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescribeEstrucruraReproductiva)
						.addComponent(lblNombre)
						.addComponent(lblColor))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPaneDescripcionEstructuraR, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(157, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(329, Short.MAX_VALUE)
					.addComponent(btnAceptarIdentificacion)
					.addGap(32))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblColor)
						.addComponent(textFieldColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescribeEstrucruraReproductiva)
						.addComponent(textPaneDescripcionEstructuraR, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(btnAceptarIdentificacion)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
