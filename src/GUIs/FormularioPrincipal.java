package GUIs;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnLogin;
	private JButton btnRegistrarse;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	private RegisterForm registerForm;
	private LoginForm loginForm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	void designGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FormularioPrincipal.class.getResource("/images/logo de la empresa.jpg")));
		setBounds(100, 100, 740, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showLogin();
			}
		});
		btnLogin.setBounds(238, 362, 258, 49);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(51, 204, 255));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 22));
		
		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setBounds(238, 422, 258, 49);
		btnRegistrarse.setForeground(new Color(255, 255, 255));
		btnRegistrarse.setBackground(new Color(255, 0, 0));
		btnRegistrarse.setFont(new Font("Arial", Font.BOLD, 22));
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showRegister();
			}
		});
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 137, 704, 136);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/images/cocinero (1).png")));
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("FOOD GO");
		lblNewLabel_1.setBounds(10, 61, 704, 81);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 99, 71));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 50));
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel);
		contentPane.add(btnLogin);
		contentPane.add(btnRegistrarse);
	}
	
	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		designGUI();
	}
	
	
	void showRegister() {
		RegisterForm register = new RegisterForm();
		register.setVisible(true);
	}
	
	void showLogin() {
		LoginForm login = new LoginForm();
		login.setVisible(true);
	}
}
