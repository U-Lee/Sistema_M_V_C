package vista;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import controlador.RadarAgregarSintoma;

public class JDialogAgregarSintoma extends JDialog {
	public JTextField textFieldSintoma;
	public JTextField textFieldZonaAfectada;
	public JButton btnAceptarSintoma;
	public JButton btnCancelarSintoma;
	public JButton btnAgregarSintoma;
	private JLabel lblDescripcionDelSintoma;
	private JLabel lblZonaAfectada;
	private JLabel lblImagenDelSintoma;
	private RadarAgregarSintoma radarAgregarSintoma;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDialogAgregarSintoma dialog = new JDialogAgregarSintoma();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public JDialogAgregarSintoma() {
		radarAgregarSintoma= new RadarAgregarSintoma();
		setTitle("Agregar Sintoma de Cultivo");
		setBounds(100, 100, 450, 300);
		
		lblDescripcionDelSintoma = new JLabel("S\u00EDntoma:");
		lblZonaAfectada = new JLabel("\u00C1rea Afectada:");
		lblImagenDelSintoma = new JLabel("Imagen del S\u00EDntoma:");
		
		textFieldSintoma = new JTextField();
		textFieldSintoma.setColumns(10);
		
		textFieldZonaAfectada = new JTextField();
		textFieldZonaAfectada.setColumns(10);
		
		btnAgregarSintoma = new JButton("Agregar");
		
		btnAceptarSintoma = new JButton("Aceptar");		
		btnAceptarSintoma.addActionListener(radarAgregarSintoma);
	
		btnCancelarSintoma = new JButton("Cancelar");
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescripcionDelSintoma)
						.addComponent(lblZonaAfectada)
						.addComponent(lblImagenDelSintoma))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textFieldZonaAfectada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldSintoma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAgregarSintoma))
					.addContainerGap(218, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(243, Short.MAX_VALUE)
					.addComponent(btnCancelarSintoma)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAceptarSintoma)
					.addGap(25))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescripcionDelSintoma)
						.addComponent(textFieldSintoma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblZonaAfectada)
						.addComponent(textFieldZonaAfectada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblImagenDelSintoma)
						.addComponent(btnAgregarSintoma))
					.addGap(98)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAceptarSintoma)
						.addComponent(btnCancelarSintoma))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}
