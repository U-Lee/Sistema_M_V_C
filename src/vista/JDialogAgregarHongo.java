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

import controlador.RadarAgregarHongo;
import controlador.RadarBotonSiguienteDialog;

public class JDialogAgregarHongo extends JDialog {

	public final JPanel contentPanel = new JPanel();
	public JTextField textFieldDivision;
	public JTextField textFieldSubdivision;
	public JTextField textFieldClase;
	public JTextField textFieldsubClase;
	public JTextField textFieldOrden;
	public JTextField textFieldFamilia;
	public JTextField textFieldSubfamilia;
	public JTextField textFieldGenero;
	public JTextField textFieldNombre;
	public JTextField textFieldColor;
	public JTextField textFieldReproduccion;
	public JTextField textFieldHospedante;
	public JTextField textFieldDescripcionEReproductiva;
	
	private JLabel lblDivision;
	private JLabel lblSubdivision;
	private JLabel lblClase;
	private JLabel lblSubclase;
	private JLabel lblOrden;
	private JLabel lblFamilia;
	private JLabel lblSubfamilia;
	private JLabel lblGenero;
	private JLabel lblNombre;
	private JLabel lblColor;
	private JLabel lblReproduccin;
	private JLabel lblHospedante;
	private JLabel lblEstructuraReproductiva;
	private JLabel lblImagenDeEstructura;
	private JLabel lblRasgosTaxonomicos;
	
	public JButton btnAgregar;
	private JButton btnCancelar;
	private JButton btnSiguiente;
	private RadarAgregarHongo radarAgregarHongo;
	private RadarBotonSiguienteDialog radarBotonSiguiente;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogAgregarHongo dialog = new JDialogAgregarHongo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogAgregarHongo() {
		setTitle("Agregar Hongo Fitopat\u00F3geno");
		setBounds(100, 100, 450, 623);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		lblDivision = new JLabel("Division:");
		lblSubdivision = new JLabel("subdivisi\u00F3n:");
		lblClase = new JLabel("Clase:");
		lblSubclase = new JLabel("Subclase:");
		lblOrden = new JLabel("Orden:");
		lblFamilia = new JLabel("Familia:");
		lblSubfamilia = new JLabel("Subfamilia:");
		lblGenero = new JLabel("Genero:");
		lblNombre = new JLabel("Nombre:");
		lblColor = new JLabel("Color:");
		lblReproduccin = new JLabel("Reproducci\u00F3n:");	
		lblHospedante = new JLabel("Hospedante:");
		lblEstructuraReproductiva = new JLabel("Descripcion de Estructura Reproductiva:");
		lblImagenDeEstructura = new JLabel("Imagen de Estructura Reproductiva");
		lblRasgosTaxonomicos = new JLabel("Rasgos Taxon\u00F3micos");

		radarAgregarHongo = new RadarAgregarHongo();
		radarBotonSiguiente = new RadarBotonSiguienteDialog();
		
		textFieldDivision = new JTextField();
		textFieldDivision.setColumns(10);
		
		textFieldSubdivision = new JTextField();
		textFieldSubdivision.setColumns(10);
		
		textFieldClase = new JTextField();
		textFieldClase.setColumns(10);
		
		textFieldsubClase = new JTextField();
		textFieldsubClase.setColumns(10);
		
		textFieldOrden = new JTextField();
		textFieldOrden.setColumns(10);
		
		textFieldFamilia = new JTextField();
		textFieldFamilia.setColumns(10);
		
		textFieldSubfamilia = new JTextField();
		textFieldSubfamilia.setColumns(10);
		
		textFieldGenero = new JTextField();
		textFieldGenero.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		
		textFieldColor = new JTextField();
		textFieldColor.setColumns(10);
		
		textFieldReproduccion = new JTextField();
		textFieldReproduccion.setColumns(10);
		
		textFieldHospedante = new JTextField();
		textFieldHospedante.setColumns(10);
		
		textFieldDescripcionEReproductiva = new JTextField();
		textFieldDescripcionEReproductiva.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(radarAgregarHongo);
		
		btnCancelar = new JButton("Cancelar");
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(radarBotonSiguiente);
		
		//btnSiguiente.addActionListener();
		

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDivision)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addGap(10)
											.addComponent(lblSubdivision))
										.addComponent(lblClase)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addGap(10)
											.addComponent(lblSubclase))
										.addComponent(lblOrden)
										.addComponent(lblFamilia)
										.addGroup(gl_contentPanel.createSequentialGroup()
											.addGap(10)
											.addComponent(lblSubfamilia))
										.addComponent(lblGenero)
										.addComponent(lblNombre)
										.addComponent(lblColor)
										.addComponent(lblHospedante)
										.addComponent(lblReproduccin))
									.addGap(43)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldReproduccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldHospedante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldGenero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldSubfamilia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldFamilia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldOrden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldsubClase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldClase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldSubdivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldDivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblEstructuraReproductiva)
										.addComponent(lblImagenDeEstructura))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAgregar)
										.addComponent(textFieldDescripcionEReproductiva, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblRasgosTaxonomicos))
							.addContainerGap(93, Short.MAX_VALUE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnCancelar)
							.addPreferredGap(ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
							.addComponent(btnSiguiente)
							.addGap(21))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lblRasgosTaxonomicos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDivision)
						.addComponent(textFieldDivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubdivision)
						.addComponent(textFieldSubdivision, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblClase)
						.addComponent(textFieldClase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubclase)
						.addComponent(textFieldsubClase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOrden)
						.addComponent(textFieldOrden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFamilia)
						.addComponent(textFieldFamilia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubfamilia)
						.addComponent(textFieldSubfamilia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGenero)
						.addComponent(textFieldGenero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblColor)
						.addComponent(textFieldColor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHospedante)
						.addComponent(textFieldHospedante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReproduccin)
						.addComponent(textFieldReproduccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEstructuraReproductiva, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDescripcionEReproductiva, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblImagenDeEstructura)
						.addComponent(btnAgregar))
					.addGap(54)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnSiguiente))
					.addGap(37))
		);
		contentPanel.setLayout(gl_contentPanel);
	}

}
