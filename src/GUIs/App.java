package GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDesktopPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.UIManager;

public class App {

	JFrame frmSistemaDePedido;
	private Compras Compras;
	private JDesktopPane dpApp;
	private Comentarios Comentarios;
	private Información Información;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmSistemaDePedido.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void designGUI() {
		frmSistemaDePedido = new JFrame();
		frmSistemaDePedido.setTitle("Sistema de pedido de comida rapida");
		frmSistemaDePedido.setBounds(100, 100, 700, 700);
		frmSistemaDePedido.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmSistemaDePedido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(UIManager.getColor("Button.background"));
		toolBar.setFloatable(false);
		
		dpApp = new JDesktopPane();
		dpApp.setBackground(UIManager.getColor("Button.background"));
		GroupLayout groupLayout = new GroupLayout(frmSistemaDePedido.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
				.addComponent(dpApp, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dpApp, GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
		);
		
		JButton btnCompras = new JButton("COMPRAS");
		btnCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPageCompras();
			}
		});
		btnCompras.setFont(new Font("Arial", Font.BOLD, 15));
		btnCompras.setForeground(new Color(255, 255, 255));
		btnCompras.setBackground(new Color(50, 205, 50));
		btnCompras.setIcon(new ImageIcon(App.class.getResource("/icons24px/shop.png")));
		toolBar.add(btnCompras);
		
		JButton btnInformación = new JButton("INFORMACIÓN");
		btnInformación.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPageInformación();
			}
		});
		btnInformación.setFont(new Font("Arial", Font.BOLD, 15));
		btnInformación.setForeground(new Color(255, 255, 255));
		btnInformación.setBackground(new Color(135, 206, 250));
		btnInformación.setIcon(new ImageIcon(App.class.getResource("/icons24px/info.png")));
		toolBar.add(btnInformación);
		
		JButton btnComentarios = new JButton("COMENTARIOS");
		btnComentarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPageComentarios();
			}
		});
		btnComentarios.setFont(new Font("Arial", Font.BOLD, 15));
		btnComentarios.setForeground(new Color(255, 255, 255));
		btnComentarios.setBackground(new Color(51, 204, 204));
		btnComentarios.setIcon(new ImageIcon(App.class.getResource("/icons24px/comments.png")));
		toolBar.add(btnComentarios);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Arial", Font.BOLD, 15));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(204, 102, 102));
		btnLogout.setIcon(new ImageIcon(App.class.getResource("/icons24px/logout.png")));
		toolBar.add(btnLogout);
		frmSistemaDePedido.getContentPane().setLayout(groupLayout);
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	void showPageCompras() {
		if (Compras == null || Compras.isClosed()) {
			Compras = new Compras();
			dpApp.add(Compras);
			Dimension size = Compras.getSize();
			Compras.setLocation((dpApp.getWidth()-size.width)/2, (dpApp.getHeight()-size.height)/2);
			Compras.show();
		}
	}

	void showPageComentarios() {
		if (Comentarios == null || Comentarios.isClosed()) {
			Comentarios = new Comentarios();
			dpApp.add(Comentarios);
			Dimension size = Comentarios.getSize();
			Comentarios.setLocation((dpApp.getWidth()-size.width)/2, (dpApp.getHeight()-size.height)/2);
			Comentarios.show();
		}
	}
	void showPageInformación() {
		if (Información == null || Información.isClosed()) {
			Información = new Información();
			dpApp.add(Información);
			Dimension size = Información.getSize();
			Información.setLocation((dpApp.getWidth()-size.width)/2, (dpApp.getHeight()-size.height)/2);
			Información.show();
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		designGUI();
	}
}
