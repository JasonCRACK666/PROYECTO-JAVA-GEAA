package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Objects.Hamburguesa;
import java.awt.Toolkit;

public class CompraHamburguesa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidad;
	private JComboBox<String> cboTamanoHam;
	private JCheckBox chkHuevoFrito;
	private JCheckBox chkPapasAlHilo;
	private JCheckBox chkPlatanoFrito;
	private JCheckBox chkQueso;
	private JCheckBox chkTocino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraHamburguesa frame = new CompraHamburguesa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public CompraHamburguesa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompraHamburguesa.class.getResource("/images/logo de la empresa.jpg")));
		setResizable(false);
		setTitle("Datos de Compra - HAMBURGUESA");
		setBackground(Color.WHITE);
		setBounds(100, 100, 944, 561);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel lblImageHamburgueso = new JLabel("");
		lblImageHamburgueso.setBounds(10, 30, 358, 334);
		ImageIcon img01 = new ImageIcon(this.getClass().getResource("/images/amburgueso02.jpg"));
		contentPane.setLayout(null);
		lblImageHamburgueso.setIcon(img01);
		lblImageHamburgueso.setHorizontalAlignment(SwingConstants.CENTER);
		lblImageHamburgueso.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(lblImageHamburgueso);
		
		JLabel label_1 = new JLabel("Hamburguesa Cl\u00E1sica");
		label_1.setBounds(380, 10, 332, 46);
		label_1.setPreferredSize(new Dimension(123, 16));
		label_1.setMinimumSize(new Dimension(123, 16));
		label_1.setMaximumSize(new Dimension(123, 16));
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		contentPane.add(label_1);
		
		JLabel lblDeliciosaHamburguesaA = new JLabel("Deliciosa hamburguesa a la parrilla. Entre sus ingredientes");
		lblDeliciosaHamburguesaA.setBounds(378, 44, 527, 35);
		lblDeliciosaHamburguesaA.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		contentPane.add(lblDeliciosaHamburguesaA);
		
		JLabel label_3 = new JLabel("encontramos :");
		label_3.setBounds(378, 66, 143, 35);
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("- Mayonesa");
		label_4.setBounds(380, 112, 143, 35);
		label_4.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("- Tomate");
		label_5.setBounds(380, 137, 143, 35);
		label_5.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("- Lechuga");
		label_6.setBounds(380, 162, 143, 35);
		label_6.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("ELIGE EL TAMA\u00D1O DE TU HAMBURGUESA");
		label_7.setBounds(380, 210, 358, 29);
		label_7.setFont(new Font("Century Gothic", Font.BOLD, 18));
		contentPane.add(label_7);
		
		cboTamanoHam = new JComboBox<String>();
		cboTamanoHam.setBounds(380, 240, 207, 22);
		cboTamanoHam.setModel(new DefaultComboBoxModel<String>(new String[] {"Mediana", "Grande (+ S/.3.00)"}));
		cboTamanoHam.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cboTamanoHam.setBackground(Color.WHITE);
		contentPane.add(cboTamanoHam);
		
		JLabel label_8 = new JLabel("PERSONALIZA TU HAMBURGUESA");
		label_8.setBounds(380, 275, 358, 29);
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 18));
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("QUITAR");
		label_9.setBounds(380, 303, 76, 35);
		label_9.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		contentPane.add(label_9);
		
		JCheckBox checkBox = new JCheckBox("Mayonesa");
		checkBox.setBounds(454, 303, 113, 35);
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox.setBackground(Color.WHITE);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Lechuga");
		checkBox_1.setBounds(571, 303, 113, 35);
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_1.setBackground(Color.WHITE);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Tomate");
		checkBox_2.setBounds(692, 303, 113, 35);
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_2.setBackground(Color.WHITE);
		contentPane.add(checkBox_2);
		
		JLabel label_10 = new JLabel("AGREGAR (+ S/. 2.00 c/u)");
		label_10.setBounds(10, 374, 231, 35);
		label_10.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		contentPane.add(label_10);
		
		chkHuevoFrito = new JCheckBox("Huevo Frito");
		chkHuevoFrito.setBounds(240, 374, 113, 35);
		chkHuevoFrito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkHuevoFrito.setBackground(Color.WHITE);
		contentPane.add(chkHuevoFrito);
		
		chkPapasAlHilo = new JCheckBox("Papas al Hilo");
		chkPapasAlHilo.setBounds(356, 374, 125, 35);
		chkPapasAlHilo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkPapasAlHilo.setBackground(Color.WHITE);
		contentPane.add(chkPapasAlHilo);
		
		chkPlatanoFrito = new JCheckBox("Pl\u00E1tano Frito");
		chkPlatanoFrito.setBounds(485, 374, 120, 35);
		chkPlatanoFrito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkPlatanoFrito.setBackground(Color.WHITE);
		contentPane.add(chkPlatanoFrito);
		
		chkQueso = new JCheckBox("Queso");
		chkQueso.setBounds(609, 374, 76, 35);
		chkQueso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkQueso.setBackground(Color.WHITE);
		contentPane.add(chkQueso);
		
		chkTocino = new JCheckBox("Tocino");
		chkTocino.setBounds(692, 374, 113, 35);
		chkTocino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkTocino.setBackground(Color.WHITE);
		contentPane.add(chkTocino);
		
		JLabel label_11 = new JLabel("ELIGE TUS SALSAS");
		label_11.setBounds(10, 410, 358, 29);
		label_11.setFont(new Font("Century Gothic", Font.BOLD, 18));
		contentPane.add(label_11);
		
		JRadioButton radioMostaza = new JRadioButton("Mostaza");
		radioMostaza.setBounds(10, 437, 127, 35);
		radioMostaza.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		radioMostaza.setBackground(Color.WHITE);
		contentPane.add(radioMostaza);
		
		JRadioButton radioKetchup = new JRadioButton("Ketchup");
		radioKetchup.setBounds(141, 437, 127, 35);
		radioKetchup.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		radioKetchup.setBackground(Color.WHITE);
		contentPane.add(radioKetchup);
		
		JRadioButton radioAji = new JRadioButton("Aj\u00ED");
		radioAji.setBounds(272, 437, 127, 35);
		radioAji.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		radioAji.setBackground(Color.WHITE);
		contentPane.add(radioAji);
		
		JLabel label_12 = new JLabel("* Descuentos del 10% los d\u00EDas Lunes, Mi\u00E9rcoles y Viernes en cualquier tama\u00F1o de hamburguesa");
		label_12.setBounds(10, 472, 539, 35);
		label_12.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		contentPane.add(label_12);
		
		JButton btnComprarHam = new JButton("COMPRAR");
		btnComprarHam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compraHamburguesa();
			}
		});
		btnComprarHam.setBounds(768, 469, 137, 35);
		btnComprarHam.setFont(new Font("Century Gothic", Font.BOLD, 18));
		contentPane.add(btnComprarHam);
		
		txtCantidad = new JTextField();
		txtCantidad.setBackground(Color.WHITE);
		txtCantidad.setBounds(704, 472, 54, 29);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel.setBounds(610, 475, 84, 22);
		contentPane.add(lblNewLabel);
	}
	
	private void compraHamburguesa() {
		int cantidad, precioVenta, cT;
		String tipoHamburguesa;
		cantidad = Integer.parseInt(txtCantidad.getText());
		tipoHamburguesa = String.valueOf(cboTamanoHam.getSelectedItem());
		
		// create the object hamburger
		Hamburguesa hamburguesa = new Hamburguesa();
		hamburguesa.setAmount(cantidad);
		
		// VERIFICAMOS LOS EXTRAS
		if (chkHuevoFrito.isSelected())
			hamburguesa.setExtra("Huevo frito");
		
		if (chkPapasAlHilo.isSelected())
			hamburguesa.setExtra("Papas al hilo");
		
		if (chkPlatanoFrito.isSelected())
			hamburguesa.setExtra("Platano frito");
		
		if (chkQueso.isSelected())
			hamburguesa.setExtra("Queso");
		
		if (chkTocino.isSelected())
			hamburguesa.setExtra("Tocino");
		
		cT = hamburguesa.getCountExtras();
		
		if (tipoHamburguesa == "Mediana") {
			precioVenta = cantidad * (10 + (cT * 2));
			hamburguesa.setSize("Mediana");
		} else {
			precioVenta = cantidad * (13 + (cT * 2));
			hamburguesa.setSize("Grande");
		}
		
		hamburguesa.setPriceTotal(precioVenta);;

		this.setVisible(false);
		BoletaVentaHamburguesa boletaVenta = new BoletaVentaHamburguesa();
		boletaVenta.getData(hamburguesa);
		boletaVenta.setVisible(true);
	}
}
