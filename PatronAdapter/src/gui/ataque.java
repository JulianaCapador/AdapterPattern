package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ataque extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ataque frame = new ataque();
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
	public ataque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMago = new JLabel("");
		lblMago.setIcon(new ImageIcon(InterfazA.class.getResource("/gui/mago.png")));
		lblMago.setBounds(5, 5, 200, 200);
		contentPane.add(lblMago);
		
		JLabel lblAtac = new JLabel("");
		lblAtac.setIcon(new ImageIcon(InterfazA.class.getResource("/gui/explosion.png")));
		lblAtac.setBounds(173, 41, 108, 147);
		contentPane.add(lblAtac);
		
		JLabel lblAtac2 = new JLabel("");
		lblAtac2.setIcon(new ImageIcon(ataque.class.getResource("/gui/explosion.png")));
		lblAtac2.setBounds(305, 41, 108, 147);
		contentPane.add(lblAtac2);
		
		JLabel lblPersonajeAtacando = new JLabel("Personaje Atacando ...\r\n\r\n");
		lblPersonajeAtacando.setFont(new Font("Castellar", Font.PLAIN, 15));
		lblPersonajeAtacando.setBounds(42, 216, 271, 34);
		contentPane.add(lblPersonajeAtacando);
		
	}

}
