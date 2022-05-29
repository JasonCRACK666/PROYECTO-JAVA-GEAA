package GUIs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class CompraTaco extends JFrame {

	private JPanel contentPane;

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
		
		JComboBox cboSaborTaco = new JComboBox();
		cboSaborTaco.setModel(new DefaultComboBoxModel(new String[] {"Al Pastor", "Campechano (+ S/.2.00)", "Ranchero (+ S/.4.00)"}));
		cboSaborTaco.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cboSaborTaco.setBackground(Color.WHITE);
		cboSaborTaco.setBounds(269, 337, 222, 29);
		contentPane.add(cboSaborTaco);
		
		JLabel label_6 = new JLabel("ESCOGE TUS EXTRAS (+ S/. 3.00 c/u)");
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_6.setBounds(21, 371, 315, 29);
		contentPane.add(label_6);
		
		JCheckBox checkBox = new JCheckBox("Guacamole");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(21, 398, 113, 35);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Jalape\u00F1o");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setBounds(138, 398, 97, 35);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Mozzarella");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setBounds(244, 398, 113, 35);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Pi\u00F1a en Alm\u00EDbar");
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setBounds(361, 398, 155, 35);
		contentPane.add(checkBox_3);
		
		JLabel label_7 = new JLabel("* Descuentos del 10% los d\u00EDas S\u00E1bados y Domingos en cualquier sabor de tu taco");
		label_7.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		label_7.setBounds(21, 434, 539, 35);
		contentPane.add(label_7);
		
		JButton btnComprarTaco = new JButton("COMPRAR");
		btnComprarTaco.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnComprarTaco.setBounds(680, 434, 137, 35);
		contentPane.add(btnComprarTaco);
	}

}
