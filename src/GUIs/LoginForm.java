package GUIs;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfEmail;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField tswPassword;
	
	private App app;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(51, 204, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(138, 48, 173, 50);
		getContentPane().add(lblNewLabel);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		tfEmail.setBounds(177, 109, 203, 20);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(LoginForm.class.getResource("/icons16px/correo-electronico.png")));
		lblNewLabel_1.setBounds(96, 110, 71, 17);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(LoginForm.class.getResource("/icons16px/lock.png")));
		lblNewLabel_2.setBounds(60, 141, 107, 17);
		getContentPane().add(lblNewLabel_2);
		
		tswPassword = new JPasswordField();
		tswPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		tswPassword.setBounds(177, 140, 203, 20);
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
		btnLogin.setBounds(170, 171, 116, 34);
		getContentPane().add(btnLogin);

	}
	
	void showApp() {
		App window = new App();
		window.frmSistemaDePedido.setVisible(true);
	}
}
