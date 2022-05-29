package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class FormRegistro extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNombreDeUsuario;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormRegistro frame = new FormRegistro();
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
	public FormRegistro() {
		setFrameIcon(new ImageIcon(FormRegistro.class.getResource("/images/logo de la empresa.jpg")));
		setBounds(100, 100, 534, 336);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(74, 102, 152, 19);
		getContentPane().add(lblNewLabel);
		
		lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreDeUsuario.setBounds(74, 148, 164, 26);
		getContentPane().add(lblNombreDeUsuario);
		
		lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(74, 198, 152, 20);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(74, 240, 152, 20);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(248, 101, 234, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 148, 234, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(248, 197, 234, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(248, 245, 234, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_1 = new JLabel("REGISTRARSE");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(165, 28, 214, 20);
		getContentPane().add(lblNewLabel_1);

	}
}
