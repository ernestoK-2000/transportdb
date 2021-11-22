package cu.edu.cujae.transportdb.visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class Principal extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Pagina Principal. Base de Transporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpresa = new JLabel("BASE DE TRANSPORTE");
		lblEmpresa.setFont(new Font("Times New Roman", Font.BOLD, 31));
		lblEmpresa.setBounds(201, 211, 461, 55);
		contentPane.add(lblEmpresa);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setBounds(0, 0, 104, 21);
		contentPane.add(menuBar);
		
		JMenu menu1 = new JMenu("Archivo");
		menuBar.add(menu1);
		
		JMenu mnNewMenu = new JMenu("Tablas");
		menu1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Carros");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaCAR sec = new TablaCAR();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Conductores");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaConductor sec = new TablaConductor();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Categoria del Conductor");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaCategoriaConduccion sec = new TablaCategoriaConduccion();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Grupos");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaGrupo sec = new TablaGrupo();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Hoja de Ruta");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaHojadeRuta sec = new TablaHojadeRuta();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Marca del Carro");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaMarca sec = new TablaMarca();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Modificacion del Grupo");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaModificacion sec = new TablaModificacion();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Carro Asignado");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaCarroAsignado sec = new TablaCarroAsignado();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Paises");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaPais sec = new TablaPais();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Programacion");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaProgramacion sec = new TablaProgramacion();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Situacion del Carro");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaSituacionCarro sec = new TablaSituacionCarro();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Situaciones de los carros");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaSituacionCarro_1 sec = new TablaSituacionCarro_1();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Situacion del Conductor");
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaSituacionChofer sec = new TablaSituacionChofer();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Situaciones de los Conductores");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaSituacionConductor sec = new TablaSituacionConductor();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Solicitudes");
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaSolicitud sec = new TablaSolicitud();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Tipos de Modificaciones");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaTipoModificacion sec = new TablaTipoModificacion();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Tipos de Programaciones");
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaTipoProgramacion sec = new TablaTipoProgramacion();
				sec.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_17);
		
		JMenuItem item2 = new JMenuItem("Salir");
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salida sec = new Salida();
				sec.setVisible(true);
			}
		});
		
		menu1.add(item2);
		
		JMenu menu2 = new JMenu("Ayuda");
		menuBar.add(menu2);
		
	}
}
