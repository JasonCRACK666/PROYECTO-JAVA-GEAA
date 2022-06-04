package GUIs;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNombreDeUsuario;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfName;
	private JTextField tfUsername;
	private JTextField tfEmail;
	private JLabel lblNewLabel_1;
	private JButton btnRegister;
	private JPasswordField tswPassword;
	private App app;
	private FormularioPrincipal FormularioPrincipal;
	private JButton btnRedirectBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setResizable(false);
		setBounds(100, 100, 540, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		setBounds(100, 100, 534, 336);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(55, 91, 143, 19);
		getContentPane().add(lblNewLabel);
		
		lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreDeUsuario.setBounds(55, 121, 143, 26);
		getContentPane().add(lblNombreDeUsuario);
		
		lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(55, 158, 143, 20);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(55, 189, 143, 20);
		getContentPane().add(lblNewLabel_3);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Arial", Font.PLAIN, 14));
		tfName.setBounds(211, 92, 234, 20);
		getContentPane().add(tfName);
		tfName.setColumns(10);
		
		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		tfUsername.setBounds(211, 126, 234, 20);
		getContentPane().add(tfUsername);
		tfUsername.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		tfEmail.setBounds(211, 157, 234, 20);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		lblNewLabel_1 = new JLabel("REGISTRARSE");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 32, 498, 48);
		getContentPane().add(lblNewLabel_1);
		
		btnRegister = new JButton("Registrarse");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerAction();
			}
		});
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setBackground(new Color(255, 0, 51));
		btnRegister.setFont(new Font("Arial", Font.PLAIN, 16));
		btnRegister.setBounds(211, 219, 121, 33);
		contentPane.add(btnRegister);
		
		tswPassword = new JPasswordField();
		tswPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		tswPassword.setBounds(211, 188, 234, 19);
		contentPane.add(tswPassword);
		
		btnRedirectBack = new JButton("");
		btnRedirectBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redirectBack();
			}
		});
		btnRedirectBack.setBackground(Color.WHITE);
		btnRedirectBack.setIcon(new ImageIcon(RegisterForm.class.getResource("/icons24px/back.png")));
		btnRedirectBack.setBounds(10, 11, 44, 42);
		contentPane.add(btnRedirectBack);
	}
	
	String name, username, email, password;
	
	void registerAction() {
		name = tfName.getText();
		username = tfUsername.getText();
		email = tfEmail.getText();
		password = String.valueOf(tswPassword.getPassword());
		if (name.equals("") && username.equals("") && email.equals("") && password.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de llenar todos los campos");
		} else if (name.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de colocar su nombre");
		} else if (username.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de colocar su nombre de usuario");
		} else if (email.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de colocar su email");
		} else if (password.equals("")) {
			JOptionPane.showMessageDialog(this, "Debe de colorcar su password");
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
