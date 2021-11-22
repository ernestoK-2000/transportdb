package cu.edu.cujae.transportdb.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;

public class Salida extends JDialog {




	/**
	 * Create the dialog.
	 */
	public Salida() {
		setTitle("EXIT");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(500, 250, 347, 200);
		getContentPane().setLayout(null);
		
		JLabel lblSeguroQueDesea = new JLabel("Seguro que desea salir");
		lblSeguroQueDesea.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblSeguroQueDesea.setBounds(64, 41, 239, 38);
		getContentPane().add(lblSeguroQueDesea);
		
		JButton but1 = new JButton("SI");
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		but1.setBackground(Color.WHITE);
		but1.setBounds(53, 109, 89, 23);
		getContentPane().add(but1);
		
		JButton but2 = new JButton("NO");
		but2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			}
		});
		but2.setBackground(Color.WHITE);
		but2.setBounds(195, 109, 89, 23);
		getContentPane().add(but2);
	}

}
