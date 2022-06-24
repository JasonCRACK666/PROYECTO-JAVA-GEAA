package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import Objects.Taco;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CompraTaco extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> cboSabTaco;
	private JCheckBox chkGuacamole;
	private JCheckBox chkJalapeno;
	private JCheckBox chkMozzarella;
	private JCheckBox chkAlmibar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraTaco frame = new CompraTaco();
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
	public CompraTaco() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompraTaco.class.getResource("/images/logo de la empresa.jpg")));
		setTitle("Datos de Compra - TACOS");
		setBounds(100, 100, 847, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		JLabel lblTacos = new JLabel("");
		ImageIcon img01 = new ImageIcon(this.getClass().getResource("/images/tacos01.jpg"));
		lblTacos.setIcon(img01);
		lblTacos.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTacos.setBounds(21, 27, 461, 297);
		contentPane.add(lblTacos);
		
		JLabel label_1 = new JLabel("Tacos");
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		label_1.setBounds(494, 10, 123, 46);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Taco Al Pastor");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_2.setBounds(494, 69, 135, 23);
		contentPane.add(label_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setText("Taco con chancho marinado, queso, pi\u00F1a, culantro y cebolla blanca");
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textArea.setEditable(false);
		textArea.setBounds(494, 93, 323, 46);
		contentPane.add(textArea);
		
		JLabel label_3 = new JLabel("Taco Campechano");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_3.setBounds(494, 140, 181, 23);
		contentPane.add(label_3);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setText("Taco con carne de res adobada, chorizo, culantro y cebolla blanca");
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textArea_1.setEditable(false);
		textArea_1.setBounds(494, 166, 323, 46);
		contentPane.add(textArea_1);
		
		JLabel label_4 = new JLabel("Taco Ranchero");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_4.setBounds(494, 213, 149, 23);
		contentPane.add(label_4);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setText("Taco con carne de res mechada, queso, cebolla blanca.");
		textArea_2.setLineWrap(true);
		textArea_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textArea_2.setEditable(false);
		textArea_2.setBounds(494, 239, 323, 46);
		contentPane.add(textArea_2);
		
		JLabel label_5 = new JLabel("ELIGE EL SABOR DE TU TACO");
		label_5.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_5.setBounds(21, 337, 242, 29);
		contentPane.add(label_5);
		
		cboSabTaco = new JComboBox<String>();
		cboSabTaco.setModel(new DefaultComboBoxModel<String>(new String[] {"Al Pastor", "Campechano (+ S/.2.00)", "Ranchero (+ S/.4.00)"}));
		cboSabTaco.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cboSabTaco.setBackground(Color.WHITE);
		cboSabTaco.setBounds(269, 337, 222, 29);
		contentPane.add(cboSabTaco);
		
		JLabel label_6 = new JLabel("ESCOGE TUS EXTRAS (+ S/. 3.00 c/u)");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_6.setBounds(21, 371, 315, 29);
		contentPane.add(label_6);
		
		chkGuacamole = new JCheckBox("Guacamole");
		chkGuacamole.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkGuacamole.setBackground(Color.WHITE);
		chkGuacamole.setBounds(21, 398, 113, 35);
		contentPane.add(chkGuacamole);
		
		chkJalapeno = new JCheckBox("Jalape\u00F1o");
		chkJalapeno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkJalapeno.setBackground(Color.WHITE);
		chkJalapeno.setBounds(138, 398, 97, 35);
		contentPane.add(chkJalapeno);
		
		chkMozzarella = new JCheckBox("Mozzarella");
		chkMozzarella.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkMozzarella.setBackground(Color.WHITE);
		chkMozzarella.setBounds(244, 398, 113, 35);
		contentPane.add(chkMozzarella);
		
		chkAlmibar = new JCheckBox("Pi\u00F1a en Alm\u00EDbar");
		chkAlmibar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkAlmibar.setBackground(Color.WHITE);
		chkAlmibar.setBounds(361, 398, 155, 35);
		contentPane.add(chkAlmibar);
		
		JLabel label_7 = new JLabel("* Descuentos del 10% los d\u00EDas S\u00E1bados y Domingos en cualquier sabor de tu taco");
		label_7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		label_7.setBounds(21, 434, 539, 35);
		contentPane.add(label_7);
		
		JButton btnComprarTaco = new JButton("COMPRAR");
		btnComprarTaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprarTaco();
			}
		});
		btnComprarTaco.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnComprarTaco.setBounds(680, 434, 137, 35);
		contentPane.add(btnComprarTaco);
	}

	private void comprarTaco() {
		int indexSabTaco, amountCostExtras;
		double price = 0;
		String sabTaco = "";
		
		indexSabTaco = cboSabTaco.getSelectedIndex();

		Taco taco = new Taco();

		if (chkAlmibar.isSelected()) {
			taco.setExtra("Piña en Almíbar");
		}
		
		if (chkGuacamole.isSelected()) {
			taco.setExtra("Guacamole");
		}
		
		if (chkJalapeno.isSelected()) {
			taco.setExtra("Jalapeño");
		}
		
		if (chkMozzarella.isSelected()) {
			taco.setExtra("Mozzarella");
		}
		
		amountCostExtras = taco.getCountExtras() * 3;
		
		switch (indexSabTaco) {
			case 0:
				sabTaco = "Al Pastor";
				break;
			case 1:
				price = amountCostExtras + 2;
				sabTaco = "Campechano";
				break;
			case 2:
				price = amountCostExtras + 4;
				sabTaco = "Ranchero";
				break;
			default:
				break;
		}
		
		taco.setSabor(sabTaco);
		taco.setPriceTotal(price);
		
		this.setVisible(false);
		BoletaVentaTaco boleta = new BoletaVentaTaco();
		boleta.getData(taco);
		boleta.setVisible(true);
	}
	
}
