package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Información extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Información frame = new Información();
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
	public Información() {
		setTitle("Informacion");
		setBounds(100, 100, 700, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Información.class.getResource("/images/Logo.PNG")));
		lblLogo.setBounds(122, 10, 482, 177);
		contentPane.add(lblLogo);
		
		JLabel lblDirección = new JLabel("Dirección                     : Borgoño 361, Trujillo 13001");
		lblDirección.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblDirección.setBounds(10, 197, 454, 29);
		contentPane.add(lblDirección);
		
		JLabel lblNumero = new JLabel("Número de telefono  : (044)602000");
		lblNumero.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNumero.setBounds(10, 251, 454, 29);
		contentPane.add(lblNumero);
		
		JLabel lblHorario = new JLabel("Horario de atención  : 9:00–21:00");
		lblHorario.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblHorario.setBounds(10, 305, 454, 29);
		contentPane.add(lblHorario);
		
		JLabel lblMapa = new JLabel("");
		lblMapa.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMapa.setIcon(new ImageIcon(Información.class.getResource("/images/Mapa.jpg")));
		lblMapa.setBounds(514, 197, 140, 140);
		contentPane.add(lblMapa);
		
		JTextArea txtComent = new JTextArea();
		txtComent.setBackground(UIManager.getColor("Button.background"));
		txtComent.setEditable(false);
		txtComent.setText("Equipo: Arturo Anticona (Ceo)\r\n              Adrian García   (Software Developer)\r\n              Emerzon Kolki (Software Developer)\r\n              Gladys Giron    (Software Developer)\r\n\r\n\r\n© 2022 Rapifood, Inc.");
		txtComent.setLineWrap(true);
		txtComent.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtComent.setBounds(10, 344, 666, 157);
		contentPane.add(txtComent);
	
		setClosable(true);
		setResizable(true);
	}
}
