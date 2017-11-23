package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import controlador.RadarAgregarCultivo;
import controlador.RadarBotonSintoma;

public class JDialogAgregarCultivo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField textFieldtipoCultivo;
	public JTextField textFieldNombreCultivo;
	public JButton btnAgregarImagenCultivo;
	public JButton btnAgregarSintoma;
	public JButton btnAceptar;
	public JButton btnCancelar;
	
	private JLabel lblNombre;
	private JLabel lblTipo;
	private JLabel lblImagenDeCultivo;
	private JLabel lblSintoma;
	
	private RadarAgregarCultivo radarAgregarCultivo;
	private RadarBotonSintoma radarBotonSintoma;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogAgregarCultivo dialog = new JDialogAgregarCultivo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogAgregarCultivo() {
		setTitle("Agregar Cultivo Hospedante");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		radarAgregarCultivo = new RadarAgregarCultivo();
		radarBotonSintoma = new RadarBotonSintoma();
		
		lblNombre = new JLabel("Nombre:");
		lblTipo = new JLabel("Tipo:");
		lblImagenDeCultivo = new JLabel("Imagen de Cultivo:");
		lblSintoma = new JLabel("Sintoma:");
		
		
		textFieldtipoCultivo = new JTextField();
		textFieldtipoCultivo.setColumns(10);

		textFieldNombreCultivo = new JTextField();
		textFieldNombreCultivo.setColumns(10);
		
		btnAgregarImagenCultivo = new JButton("Agregar");
		
		btnAgregarSintoma = new JButton("Agregar");
		btnAgregarSintoma.addActionListener(radarBotonSintoma);
		
		btnAceptar = new JButton("Aceptar");		
		btnAceptar.addActionListener(radarAgregarCultivo);
		
		btnCancelar = new JButton("Cancelar");
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImagenDeCultivo)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSintoma)
								.addComponent(lblNombre)
								.addComponent(lblTipo))
							.addGap(76)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldtipoCultivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAgregarImagenCultivo)
								.addComponent(btnAgregarSintoma)
								.addComponent(textFieldNombreCultivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(210, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(248, Short.MAX_VALUE)
					.addComponent(btnCancelar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAceptar)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo)
						.addComponent(textFieldtipoCultivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombreCultivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSintoma)
						.addComponent(btnAgregarSintoma))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblImagenDeCultivo)
						.addComponent(btnAgregarImagenCultivo))
					.addGap(88)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAceptar)
						.addComponent(btnCancelar))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}

}
