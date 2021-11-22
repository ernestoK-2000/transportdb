package cu.edu.cujae.transportdb.visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;

public class TablaCAR extends JDialog {
	private JTextField textField;
	private JTable table;




	/**
	 * Create the dialog.
	 */
	public TablaCAR() {
		setTitle("Carros");
		setBounds(100, 100, 629, 454);
		getContentPane().setLayout(null);
		setModal(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 79, 593, 278);
		scrollPane.setForeground(Color.RED);
		scrollPane.setBackground(Color.WHITE);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		final DefaultTableModel model = new DefaultTableModel();
		table.setBounds(0, 121, 686, 255);
		Object[] columns = {"Número del carro", "Asientos", "Marca", "Km Disponibles"};
		
		model.setColumnIdentifiers(columns);
		//getContentPane().add(table);
		table.setToolTipText("aaaaaaaaa");
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		table.setBackground(Color.white);
		table.setForeground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.red);
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		table.setModel(model);
		scrollPane.setViewportView(table);
		final Object[] row= new Object[6];
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 593, 60);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero del carro");
		lblNewLabel.setBounds(10, 11, 116, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Asientos");
		lblNewLabel_1.setBounds(51, 36, 62, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setBounds(340, 11, 62, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Km Disponibles");
		lblNewLabel_3.setBounds(298, 36, 104, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(116, 8, 147, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(387, 8, 133, 20);
		panel_1.add(comboBox_1);
		comboBox_1.addItem("None");
		comboBox_1.addItem("Lada");
		comboBox_1.addItem("Toyota");
		comboBox_1.addItem("Hyundai");
		comboBox_1.addItem("Chevrolet");
		comboBox_1.addItem("Polsvki");
		comboBox_1.addItem("Audi");
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(387, 32, 133, 20);
		panel_1.add(spinner);
		
		final JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_1.setBounds(116, 32, 147, 20);
		panel_1.add(spinner_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 368, 613, 47);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Insertar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					if(!(comboBox_1.getSelectedItem().toString()== "None")){
						if(!(textField.getText().toString().equals(""))){
								row[0] = textField.getText().toString();
								row[1] = spinner_1.getValue();
								row[2] = comboBox_1.getSelectedItem().toString();
								row[3] = spinner.getValue();
								model.addRow(row);
						}else JOptionPane.showMessageDialog(null, "Error. Por favor inserte un número de carro válido ");
					}else JOptionPane.showMessageDialog(null, "Error. Por favor elija una marca ");
				
			}
		});
		btnNewButton.setBounds(10, 4, 150, 36);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = table.getSelectedRow();
				if(a>=0){
						if(!(comboBox_1.getSelectedItem().toString()== "None")){
							if(!(textField.getText().toString().equals(""))){
								model.setValueAt(textField.getText().toString(), a, 0);
								model.setValueAt(spinner_1.getValue().toString(), a, 1);
								model.setValueAt(comboBox_1.getSelectedItem().toString(), a, 2);
								model.setValueAt(spinner.getValue(), a, 3);
							}else JOptionPane.showMessageDialog(null, "Error. Por favor inserte un número de carro válido ");
						}else JOptionPane.showMessageDialog(null, "Error. Por favor elija una marca ");	
				}else JOptionPane.showMessageDialog(null, "Error. Seleccione una fila");
						
			}
		});
		btnNewButton_1.setBounds(170, 4, 136, 36);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = table.getSelectedRow();
				if(a>=0)
					model.removeRow(a);
				else
					JOptionPane.showMessageDialog(null, "Error al Eliminar");
			}
		});
		btnNewButton_2.setBounds(316, 4, 136, 36);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Atrás");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_3.setBounds(462, 4, 141, 36);
		panel.add(btnNewButton_3);
	}

	private void SpinnerListModel(Object x) {

		
	}
}
