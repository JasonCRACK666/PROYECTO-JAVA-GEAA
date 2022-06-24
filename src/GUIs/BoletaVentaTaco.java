package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objects.Taco;

import java.awt.Color;

import java.awt.Font;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class BoletaVentaTaco extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPrice;
	private JLabel lblExtras;
	private JLabel lblTaco;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoletaVentaTaco frame = new BoletaVentaTaco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void desing() {
		setTitle("Boleta de Venta");
		setBackground(Color.WHITE);
		setBounds(100, 100, 540, 655);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("RAPIFOOD SAC");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 31, 524, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BOLETA DE VENTA");
		lblNewLabel_1.setForeground(new Color(255, 102, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 106, 524, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dirección: ABC 361, Trujillo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(0, 150, 524, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("RUC: 20304050600");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(0, 179, 524, 29);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tel: (044)602000");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(0, 209, 524, 29);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("PRE-CUENTA");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(0, 238, 524, 29);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(115, 278, 305, 15);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Alimento:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(0, 279, 251, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Taco");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setBounds(255, 279, 269, 29);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Tipo:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(0, 304, 251, 29);
		contentPane.add(lblNewLabel_3_2);
		
		lblTaco = new JLabel("");
		lblTaco.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaco.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTaco.setBounds(255, 304, 269, 29);
		contentPane.add(lblTaco);
		
		lblExtras = new JLabel("");
		lblExtras.setHorizontalAlignment(SwingConstants.CENTER);
		lblExtras.setFont(new Font("Arial", Font.PLAIN, 16));
		lblExtras.setBounds(0, 357, 524, 29);
		contentPane.add(lblExtras);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Extras:");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_2_1.setBounds(0, 332, 524, 29);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Precio total:");
		lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_2_2.setBounds(0, 386, 251, 29);
		contentPane.add(lblNewLabel_3_2_2);
		
		lblPrice = new JLabel("");
		lblPrice.setForeground(new Color(51, 153, 51));
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrice.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblPrice.setBounds(255, 386, 269, 29);
		contentPane.add(lblPrice);

		JLabel lblNewLabel_4 = new JLabel("SU PEDIDO HA SIDO UN EXITO! LE LLEGARA EN POCO TIEMPO.");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 472, 504, 37);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MUCHAS GRACIAS POR CONFIAR EN NOSOTROS :)");
		lblNewLabel_5.setForeground(new Color(255, 102, 0));
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(20, 496, 494, 45);
		contentPane.add(lblNewLabel_5);
	}
	
	public void getData(Taco taco) {
		lblPrice.setText("S/"+taco.getPrice());
		lblTaco.setText(taco.getSabor());
		if (taco.getExtras() == "") {
			lblExtras.setText("Sin ningún extra");
		} else {
			lblExtras.setText(taco.getExtras());
		}
	}
	
	/**
	 * Create the frame.
	 */
	public BoletaVentaTaco() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BoletaVentaTaco.class.getResource("/images/logo de la empresa.jpg")));
		desing();
		this.setLocationRelativeTo(null);
	}
}
