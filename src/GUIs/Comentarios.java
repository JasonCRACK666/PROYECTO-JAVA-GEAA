package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;

public class Comentarios extends JInternalFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtComent;
	private JTextArea txtComentarios;
	private JLabel lblContador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comentarios frame = new Comentarios();
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
	
	
	public Comentarios() {
		setTitle("Comentarios");
		setBounds(100, 100, 700, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(5, 20, 676, 49);
		lblComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblComentarios.setFont(new Font("Tahoma", Font.BOLD, 40));
		contentPane.add(lblComentarios);
		
		JButton btnComent = new JButton("Comentar");
		btnComent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtComent.getText().trim().equals("")) {
				    JOptionPane.showMessageDialog(null, "No puedes comentar en blanco");
				    txtComent.setText(null);
				}	
				else if (contador() < 0){
				    JOptionPane.showMessageDialog(null, "No puedes superar el limite de caracteres");
				    txtComent.setText(null);}
				else if (RegisterForm.username == null){
					String Com = txtComent.getText();
					JOptionPane.showMessageDialog(null, "El comentario se ha publicado con exito");
					txtComentarios.append(LoginForm.usuario+"\n\n");
					txtComentarios.append(Com+"\n\n\n");
				}
				else {
					String Com = txtComent.getText();
					JOptionPane.showMessageDialog(null, "El comentario se ha publicado con exito");
					txtComentarios.append(RegisterForm.username+"\n\n");
					txtComentarios.append(Com+"\n\n\n");
				}
			}	
		});
		
		btnComent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnComent.setBounds(547, 428, 129, 60);
		contentPane.add(btnComent);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 426, 532, 60);
		contentPane.add(scrollPane);
		
		txtComent = new JTextArea();
		txtComent.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				lblContador.setText(""+contador());
			}
			@Override
			public void keyTyped(KeyEvent e) { 
				if(contador() == 0) {
					e.consume();
				}
			}
		});
		scrollPane.setViewportView(txtComent);
		txtComent.setLineWrap(true);
		txtComent.setFont(new Font("Arial Black", Font.BOLD, 14));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 79, 671, 314);
		contentPane.add(scrollPane_1);
		
		txtComentarios = new JTextArea();
		txtComentarios.setLineWrap(true);
		txtComentarios.setEditable(false);
		txtComentarios.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtComentarios.setText("Melady Morales\r\n\nSu delivery muy rápido y muy amable. La comida espectacular. Muy pero muy recomendado.\r\n\r\n\r\nJorge Luis Mendez\r\n\nDemasiado rico todo, sus papitas super crocantes y sus cremas top!! Recomendado total\r\n\r\n\r\n");
		scrollPane_1.setViewportView(txtComentarios);
		
		lblContador = new JLabel("300");
		lblContador.setForeground(Color.RED);
		lblContador.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContador.setBounds(483, 403, 59, 25);
		contentPane.add(lblContador);
		
		setClosable(true);
		setResizable(true);
	}
	public int contador() {
		String caracteres = txtComent.getText();
		int num = 300 - caracteres.length();
		return num;
	}
}