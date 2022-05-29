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
	private FormRegistro fr;
	private FormLogin fl;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 1056);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargaRegistro();
			}
		});
		btnLogin.setBackground(new Color(255, 250, 250));
		btnLogin.setFont(new Font("Sitka Small", Font.PLAIN, 34));
		
		btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setBackground(new Color(255, 250, 250));
		btnRegistrarse.setFont(new Font("Sitka Small", Font.PLAIN, 34));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/images/cocinero (1).png")));
		
		lblNewLabel_1 = new JLabel("FOOD GO");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 99, 71));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 54));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(80)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
					.addGap(49))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE)
					.addGap(22))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogin, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
						.addComponent(btnRegistrarse, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
					.addGap(93))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(64)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
					.addGap(167)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
					.addGap(87)
					.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
					.addGap(53)
					.addComponent(btnRegistrarse, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
					.addGap(92))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		designGUI();
	}
	
	
	void cargaRegistro() {
		fr = new FormRegistro();
		fr.show();
	}
	
}
