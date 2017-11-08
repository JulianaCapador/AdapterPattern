package gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.AdaptadorPersonaje;
import javax.swing.JTextField;

public class InterfazA extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public InterfazA() {
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
		
		JButton btnAtacar = new JButton("ATACAR");
		btnAtacar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnAtacar.setBounds(39, 216, 108, 34);
		contentPane.add(btnAtacar);
		//Accion Atacar
		btnAtacar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								ataque nueva = new ataque();
								nueva.setVisible(true);
								InterfazA.this.dispose();
							}
						});
		
		JButton btnCaminar = new JButton("CAMINAR");
		btnCaminar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		btnCaminar.setBounds(233, 216, 108, 34);
		contentPane.add(btnCaminar);
		//Accion Caminar
		btnCaminar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								for (int i= 0;i<200;i++){
									lblMago.setBounds(i, 5, 200, 200); 
								}
							}
						});
		
		
		
	
	}
}
