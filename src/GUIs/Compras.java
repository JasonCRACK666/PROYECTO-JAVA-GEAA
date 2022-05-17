package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Compras extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compras frame = new Compras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	void designGUI() {
		setBounds(100, 100, 700, 548);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.light"));
		panel.setBounds(10, 11, 324, 245);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HAMBURGUESA");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 304, 23);
		panel.add(lblNewLabel);
		
		JLabel lblImageComida1 = new JLabel("");
		lblImageComida1.setIcon(new ImageIcon(Compras.class.getResource("/images/hamburguesa.jpg")));
		lblImageComida1.setBounds(18, 36, 290, 160);
		panel.add(lblImageComida1);
		
		JLabel lblNewLabel_2 = new JLabel("PRECIO: S/10.00");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 212, 152, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnComprarHamburguesa = new JButton("COMPRAR");
		btnComprarHamburguesa.setIcon(new ImageIcon(Compras.class.getResource("/icons16px/shopping-cart.png")));
		btnComprarHamburguesa.setFont(new Font("Arial", Font.PLAIN, 14));
		btnComprarHamburguesa.setBounds(172, 204, 136, 30);
		panel.add(btnComprarHamburguesa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.light"));
		panel_1.setBounds(350, 11, 324, 245);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblComida = new JLabel("PIZZA");
		lblComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblComida.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblComida.setBounds(10, 11, 304, 28);
		panel_1.add(lblComida);
		
		JLabel lblImageComida2 = new JLabel("");
		lblImageComida2.setIcon(new ImageIcon(Compras.class.getResource("/images/pizza.png")));
		lblImageComida2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblImageComida2.setBounds(18, 37, 290, 160);
		panel_1.add(lblImageComida2);
		
		JLabel lblNewLabel_2_2 = new JLabel("PRECIO: S/15.00");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(10, 213, 152, 14);
		panel_1.add(lblNewLabel_2_2);
		
		JButton btnComprarPizza = new JButton("COMPRAR");
		btnComprarPizza.setIcon(new ImageIcon(Compras.class.getResource("/icons16px/shopping-cart.png")));
		btnComprarPizza.setFont(new Font("Arial", Font.PLAIN, 14));
		btnComprarPizza.setBounds(172, 204, 136, 30);
		panel_1.add(btnComprarPizza);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Button.light"));
		panel_2.setBounds(10, 270, 324, 235);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblComida_1 = new JLabel("TACOS");
		lblComida_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblComida_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblComida_1.setBounds(10, 11, 304, 27);
		panel_2.add(lblComida_1);
		
		JLabel lblImageComida3 = new JLabel("");
		lblImageComida3.setIcon(new ImageIcon(Compras.class.getResource("/images/tacos-mexicanos.jpg")));
		lblImageComida3.setBounds(18, 36, 290, 151);
		panel_2.add(lblImageComida3);
		
		JLabel lblNewLabel_2_1 = new JLabel("PRECIO: S/2.00");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(10, 203, 152, 14);
		panel_2.add(lblNewLabel_2_1);
		
		JButton btnComprarTacos = new JButton("COMPRAR");
		btnComprarTacos.setIcon(new ImageIcon(Compras.class.getResource("/icons16px/shopping-cart.png")));
		btnComprarTacos.setFont(new Font("Arial", Font.PLAIN, 14));
		btnComprarTacos.setBounds(172, 195, 142, 30);
		panel_2.add(btnComprarTacos);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(UIManager.getColor("Button.light"));
		panel_2_1.setBounds(350, 270, 324, 235);
		getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("PAPAS FRITAS");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 11, 304, 25);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblImageComida4 = new JLabel("");
		lblImageComida4.setIcon(new ImageIcon(Compras.class.getResource("/images/papas-fritas.jpg")));
		lblImageComida4.setBounds(18, 36, 290, 151);
		panel_2_1.add(lblImageComida4);
		
		JLabel lblNewLabel_2_3 = new JLabel("PRECIO: S/6.00");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(10, 203, 152, 14);
		panel_2_1.add(lblNewLabel_2_3);
		
		JButton btnComprarPapas = new JButton("COMPRAR");
		btnComprarPapas.setIcon(new ImageIcon(Compras.class.getResource("/icons16px/shopping-cart.png")));
		btnComprarPapas.setFont(new Font("Arial", Font.PLAIN, 14));
		btnComprarPapas.setBounds(172, 194, 136, 30);
		panel_2_1.add(btnComprarPapas);
	}
	
	/**
	 * Create the frame.
	 */
	public Compras() {
		setClosable(true);
		setResizable(true);
		setTitle("Compras");
		designGUI();
	}
}
