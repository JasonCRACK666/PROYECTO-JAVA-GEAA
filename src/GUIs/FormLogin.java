package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class FormLogin extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLogin frame = new FormLogin();
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
	public FormLogin() {
		setFrameIcon(new ImageIcon(FormLogin.class.getResource("/images/logo de la empresa.jpg")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 22, 190, 34);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(161, 85, 203, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 148, 203, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 212, 203, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_1 = new JLabel("   Email");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(FormLogin.class.getResource("/icons16px/correo-electronico.png")));
		lblNewLabel_1.setBounds(33, 148, 79, 17);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("  Password");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(FormLogin.class.getResource("/icons16px/lock.png")));
		lblNewLabel_2.setBounds(33, 212, 100, 17);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("  Usuario");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		lblNewLabel_3.setIcon(new ImageIcon(FormLogin.class.getResource("/icons16px/perfil.png")));
		lblNewLabel_3.setBounds(33, 83, 100, 20);
		getContentPane().add(lblNewLabel_3);

	}

}
