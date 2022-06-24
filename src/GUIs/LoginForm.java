package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JTextField tfUsuario;
	private JTextField tfEmail;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField tswPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/images/logo de la empresa.jpg")));
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(51, 204, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(138, 48, 173, 50);
		getContentPane().add(lblNewLabel);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		tfEmail.setBounds(177, 140, 203, 20);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(LoginForm.class.getResource("/icons16px/correo-electronico.png")));
		lblNewLabel_1.setBounds(96, 141, 71, 17);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(LoginForm.class.getResource("/icons16px/lock.png")));
		lblNewLabel_2.setBounds(60, 172, 107, 17);
		getContentPane().add(lblNewLabel_2);
		
		tswPassword = new JPasswordField();
		tswPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		tswPassword.setBounds(177, 171, 203, 20);
		getContentPane().add(tswPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showApp();
			}
		});
		btnLogin.setBackground(new Color(102, 204, 255));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLogin.setBounds(177, 207, 116, 34);
		getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redirectBack();
			}
		});
		btnBack.setBackground(Color.WHITE);
		btnBack.setIcon(new ImageIcon(LoginForm.class.getResource("/icons24px/back.png")));
		btnBack.setBounds(10, 11, 45, 41);
		getContentPane().add(btnBack);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(177, 108, 203, 20);
		getContentPane().add(tfUsuario);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario:");
		lblNewLabel_3.setIcon(new ImageIcon(LoginForm.class.getResource("/icons16px/perfil.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(82, 109, 85, 17);
		getContentPane().add(lblNewLabel_3);

	}
	
	String email, password;
	static public String usuario;
	
	void showApp() {
		usuario = tfUsuario.getText();
		email = tfEmail.getText();
		password = String.valueOf(tswPassword.getPassword());
		if (password.equals("") && email.equals("") && usuario.equals("")){
			JOptionPane.showMessageDialog(this, "Debes de rellenar ambos campos con tus datos");
		} else if (password.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de ingresar su contraseña");
		} else if (email.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de ingresar su correo electrónico");
		} else if (usuario.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de ingresar su usuario");
		} else {
			App window = new App();
			window.frmSistemaDePedido.setVisible(true);
			this.setVisible(false);
		}
	}
	
	void redirectBack() {
		FormularioPrincipal formPrincipal = new FormularioPrincipal();
		formPrincipal.setVisible(true);
		this.setVisible(false);
	}
}
