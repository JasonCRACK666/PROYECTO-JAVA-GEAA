package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Comentarios extends JInternalFrame {

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
		
		JLabel lblCli1 = new JLabel("");
		lblCli1.setIcon(new ImageIcon(Comentarios.class.getResource("/images/Cliente_1.png")));
		lblCli1.setBounds(34, 93, 75, 75);
		contentPane.add(lblCli1);
		
		JLabel lblCli2 = new JLabel("");
		lblCli2.setIcon(new ImageIcon(Comentarios.class.getResource("/images/Cliente_2.png")));
		lblCli2.setBounds(34, 197, 75, 75);
		contentPane.add(lblCli2);
		
		JLabel lblCli3 = new JLabel("");
		lblCli3.setIcon(new ImageIcon(Comentarios.class.getResource("/images/Cliente_3.png")));
		lblCli3.setBounds(34, 301, 75, 75);
		contentPane.add(lblCli3);
		
		JTextArea txtComent1 = new JTextArea();
		txtComent1.setLineWrap(true);
		txtComent1.setEditable(false);
		txtComent1.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtComent1.setText("Su delivery muy rápido y muy amable. La comida espectacular. Muy pero muy recomendado.");
		txtComent1.setBounds(119, 100, 536, 60);
		contentPane.add(txtComent1);
		
		JTextArea txtComent2 = new JTextArea();
		txtComent2.setLineWrap(true);
		txtComent2.setEditable(false);
		txtComent2.setText("Demasiado rico todo, sus papitas super crocantes y sus cremas top!! Recomendado total");
		txtComent2.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtComent2.setBounds(119, 205, 536, 60);
		contentPane.add(txtComent2);
		
		JTextArea txtComent3 = new JTextArea();
		txtComent3.setText("Hamburgesa 10/10");
		txtComent3.setLineWrap(true);
		txtComent3.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtComent3.setEditable(false);
		txtComent3.setBounds(119, 310, 536, 60);
		contentPane.add(txtComent3);
		
		JButton btnComent = new JButton("Comentar");
		btnComent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Publicado con exito");
			}
		});
		btnComent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnComent.setBounds(547, 415, 129, 73);
		contentPane.add(btnComent);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 413, 527, 73);
		contentPane.add(scrollPane);
		
		JTextArea txtComent = new JTextArea();
		scrollPane.setViewportView(txtComent);
		txtComent.setLineWrap(true);
		txtComent.setFont(new Font("Arial Black", Font.BOLD, 14));
	
		setClosable(true);
		setResizable(true);
	}
}

