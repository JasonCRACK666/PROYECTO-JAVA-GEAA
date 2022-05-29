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
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class CompraPapasFritas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraPapasFritas frame = new CompraPapasFritas();
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
	public CompraPapasFritas() {
		setTitle("Datos de Compra - PAPAS FRITAS");
		setBounds(100, 100, 806, 388);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		JLabel lblPapasFritas = new JLabel("");
		ImageIcon img01 = new ImageIcon(this.getClass().getResource("/images/papasFritas01.jpg"));
		lblPapasFritas.setIcon(img01);
		lblPapasFritas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblPapasFritas.setBounds(23, 29, 299, 299);
		contentPane.add(lblPapasFritas);
		
		JLabel label_1 = new JLabel("Papas Fritas");
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		label_1.setBounds(334, 10, 197, 46);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Papas Fritas doradas con mezcla de especies");
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		label_2.setBounds(334, 52, 426, 35);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("ELIGE EL TAMA\u00D1O DE TUS PAPAS FRITAS");
		label_3.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_3.setBounds(334, 92, 358, 29);
		contentPane.add(label_3);
		
		JComboBox cboTamPapa = new JComboBox();
		cboTamPapa.setModel(new DefaultComboBoxModel(new String[] {"Papa Regular", "Papa Grande (+ S/.1.00)", "Papa Familiar (+ S/.4.00)", "Papa Super Familiar (+ S/.7.00)"}));
		cboTamPapa.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cboTamPapa.setBackground(Color.WHITE);
		cboTamPapa.setBounds(334, 125, 270, 29);
		contentPane.add(cboTamPapa);
		
		JLabel label_4 = new JLabel("* Descuentos del 10% los d\u00EDas en cualquier tama\u00F1o de papas fritas");
		label_4.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		label_4.setBounds(334, 159, 426, 35);
		contentPane.add(label_4);
		
		JButton btnComprarPapa = new JButton("COMPRAR");
		btnComprarPapa.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnComprarPapa.setBounds(637, 207, 137, 35);
		contentPane.add(btnComprarPapa);
	}

}
