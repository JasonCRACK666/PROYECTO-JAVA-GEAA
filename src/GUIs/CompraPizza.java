package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Objects.Pizza;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CompraPizza extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> cboSaborPiz;
	private JComboBox<String> cboTamPizza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraPizza frame = new CompraPizza();
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
	public CompraPizza() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompraPizza.class.getResource("/images/logo de la empresa.jpg")));
		setTitle("Datos de Compra - PIZZA");
		setBounds(100, 100, 831, 517);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		JLabel label = new JLabel("Pizzas");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Century Gothic", Font.BOLD, 30));
		label.setBounds(243, 10, 332, 46);
		contentPane.add(label);
		
		JLabel lblPizzaAmericana = new JLabel("");
		ImageIcon img01 = new ImageIcon(this.getClass().getResource("/images/pizzaAmericana.jpg"));
		lblPizzaAmericana.setIcon(img01);
		lblPizzaAmericana.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblPizzaAmericana.setBounds(10, 67, 235, 165);
		contentPane.add(lblPizzaAmericana);
		
		JLabel lblPizzaMozzarella = new JLabel("");
		ImageIcon img02 = new ImageIcon(this.getClass().getResource("/images/pizzaMozzarella.jpg"));
		lblPizzaMozzarella.setIcon(img02);
		lblPizzaMozzarella.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblPizzaMozzarella.setBounds(280, 67, 235, 165);
		contentPane.add(lblPizzaMozzarella);
		
		JLabel lblPizzaPepperoni = new JLabel("");
		ImageIcon img03 = new ImageIcon(this.getClass().getResource("/images/pizzaPepperoni.jpg"));
		lblPizzaPepperoni.setIcon(img03);
		lblPizzaPepperoni.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblPizzaPepperoni.setBounds(550, 67, 235, 165);
		contentPane.add(lblPizzaPepperoni);
		
		JLabel label_4 = new JLabel("Americana");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_4.setBounds(10, 233, 107, 23);
		contentPane.add(label_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setText("\u00A1La Pizza preferida de los chicos! Jam\u00F3n y queso mozzarella.");
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textArea.setEditable(false);
		textArea.setBounds(10, 257, 235, 51);
		contentPane.add(textArea);
		
		JLabel label_5 = new JLabel("Mozzarella");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_5.setBounds(280, 233, 107, 23);
		contentPane.add(label_5);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setText("Para los amantes del queso una deliciosa pizza con nuestro queso mozzarella gratinado.\r\n");
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textArea_1.setEditable(false);
		textArea_1.setBounds(280, 257, 235, 63);
		contentPane.add(textArea_1);
		
		JLabel label_6 = new JLabel("Pepperoni");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_6.setBounds(550, 233, 107, 23);
		contentPane.add(label_6);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setText("Sabor incomparable de pepperoni americano y queso mozzarella.");
		textArea_2.setLineWrap(true);
		textArea_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textArea_2.setEditable(false);
		textArea_2.setBounds(550, 257, 235, 63);
		contentPane.add(textArea_2);
		
		JLabel label_7 = new JLabel("ELIGE EL SABOR DE TU PIZZA");
		label_7.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_7.setBounds(10, 330, 242, 29);
		contentPane.add(label_7);
		
		cboSaborPiz = new JComboBox<String>();
		cboSaborPiz.setModel(new DefaultComboBoxModel<String>(new String[] {"Americana", "Mozzarella", "Pepperoni"}));
		cboSaborPiz.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cboSaborPiz.setBackground(Color.WHITE);
		cboSaborPiz.setBounds(264, 330, 123, 29);
		contentPane.add(cboSaborPiz);
		
		JLabel label_8 = new JLabel("ELIGE EL TAMA\u00D1O DE TU PIZZA");
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_8.setBounds(10, 372, 262, 29);
		contentPane.add(label_8);
		
		cboTamPizza = new JComboBox<String>();
		cboTamPizza.setModel(new DefaultComboBoxModel<String>(new String[] {"Personal", "Mediana (+ S/.20.00)", "Grande (+ S/.30.00)", "Familiar (+ S/.40.00)"}));
		cboTamPizza.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cboTamPizza.setBackground(Color.WHITE);
		cboTamPizza.setBounds(284, 372, 191, 29);
		contentPane.add(cboTamPizza);
		
		JLabel label_9 = new JLabel("* Descuentos del 10% los d\u00EDas Martes y Jueves en cualquier sabor y tama\u00F1o de pizza");
		label_9.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		label_9.setBounds(10, 414, 539, 35);
		contentPane.add(label_9);
		
		JButton btnComprarPizza = new JButton("COMPRAR");
		btnComprarPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprarPizza();
			}
		});
		btnComprarPizza.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnComprarPizza.setBounds(665, 419, 137, 35);
		contentPane.add(btnComprarPizza);
	}
	
	private void comprarPizza() {
		int indexSabPizza, indexTamPizza;
		double price = 0;
		String sabPizza = "", tamPizza = "";
		
		indexSabPizza = cboSaborPiz.getSelectedIndex();
		indexTamPizza = cboTamPizza.getSelectedIndex();
		
		switch (indexSabPizza) {
			case 0:
				sabPizza = "Americana";
				break;
			case 1:
				sabPizza = "Mozzarella";
				break;
			case 2:
				sabPizza = "Pepperoni";
				break;
			default:
				break;
		}
		
		switch (indexTamPizza) {
			case 0:
				price = 0;
				tamPizza = "Personal";
				break;
			case 1:
				price = 20;
				tamPizza = "Mediana";
				break;
			case 2:
				price = 30;
				tamPizza = "Grande";
				break;
			case 3:
				price = 40;
				tamPizza = "Familiar";
				break;
			default:
				break;
		}

		Pizza pizza = new Pizza(price, sabPizza, tamPizza);
		this.setVisible(false);
		BoletaVentaPizza boleta = new BoletaVentaPizza();
		boleta.getData(pizza);
		boleta.setVisible(true);
	}
}
