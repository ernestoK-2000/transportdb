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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.GridLayout;


import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TablaCarroAsignado extends JDialog {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JSpinner spinner;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JScrollPane scrollPane;



	/**
	 * Create the dialog.
	 */
	public TablaCarroAsignado() {
		setTitle("Carro Asignado");
		setBounds(100, 100, 665, 445);
		setModal(true);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("649px:grow"),},
			new RowSpec[] {
				RowSpec.decode("66px:grow"),
				RowSpec.decode("297px:grow"),
				RowSpec.decode("70px:grow"),}));
		final Object[] row= new Object[6];
		final DefaultTableModel model = new DefaultTableModel();
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, "1, 2, fill, fill");
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			
			{
				scrollPane = new JScrollPane();
				scrollPane.setForeground(Color.RED);
				scrollPane.setBackground(Color.WHITE);
				panel.add(scrollPane);
				
				
				
				table = new JTable();
				
				Object[] columns = {"Fecha", "Numero del carro", "DNI Conductor", "DNI Copiloto"};
				
				model.setColumnIdentifiers(columns);
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
				
			}
		}
		/////
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, "1, 1, fill, fill");
			panel.setLayout(new FormLayout(new ColumnSpec[] {
					ColumnSpec.decode("6px"),
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("max(45dlu;default):grow"),
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("left:max(107dlu;default):grow"),
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("left:max(45dlu;default):grow"),
					ColumnSpec.decode("6px"),
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("max(93dlu;default):grow"),
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("max(23dlu;default)"),
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,
					FormFactory.RELATED_GAP_COLSPEC,
					FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
					FormFactory.LINE_GAP_ROWSPEC,
					RowSpec.decode("27px"),
					FormFactory.RELATED_GAP_ROWSPEC,
					FormFactory.DEFAULT_ROWSPEC,}));
			{
				lblNewLabel_1 = new JLabel("Fecha");
				panel.add(lblNewLabel_1, "3, 2, right, default");
			}
			{
				lblNewLabel = new JLabel("Numero del carro");
			}
			{
				spinner = new JSpinner();
				spinner.setModel(new SpinnerDateModel(new Date(1636437600000L), new Date(1636437600000L), new Date(1668319200000L), Calendar.DAY_OF_YEAR));
				panel.add(spinner, "5, 2, fill, default");
			}
			{
				lblNewLabel_2 = new JLabel("Conductor DNI");
				panel.add(lblNewLabel_2, "7, 2, right, default");
			}
			{
				textField_1 = new JTextField();
				panel.add(textField_1, "10, 2, fill, default");
				textField_1.setColumns(10);
			}
			panel.add(lblNewLabel, "3, 4, right, top");
			{
				textField = new JTextField();
				panel.add(textField, "5, 4, fill, default");
				textField.setColumns(10);
			}
			{
				lblNewLabel_3 = new JLabel("Copiloto DNI");
				panel.add(lblNewLabel_3, "7, 4, right, default");
			}
			{
				textField_2 = new JTextField();
				panel.add(textField_2, "10, 4, fill, default");
				textField_2.setColumns(10);
			}
		}
		///////
		
		//////
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, "1, 3, fill, top");
			{
				btnNewButton = new JButton("A\u00F1adir");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(!(textField.getText().toString().equals(""))){
							if(!(textField_1.getText().toString().equals(""))){
								if(!(textField_2.getText().toString().equals(""))){
									row[0] = spinner.getValue();
									row[1] = textField.getText().toString();
									row[2] = textField_1.getText().toString();
									row[3] = textField_2.getText().toString();
									model.addRow(row);
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese correctamente el DNI del copiloto ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese correctamente el DNI del conductor ");
						}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un numero de carro valido ");
					
				}
			});
			}
			{
				btnNewButton_1 = new JButton("Modificar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int a = table.getSelectedRow();
						if(a>=0){
							if(!(textField.getText().toString().equals(""))){
								if(!(textField_1.getText().toString().equals(""))){
									if(!(textField_2.getText().toString().equals(""))){
										model.setValueAt(spinner.getValue(), a, 0);
										model.setValueAt(textField.getText(), a, 1);
										model.setValueAt(textField_1.getText(), a, 2);
										model.setValueAt(textField_2.getText(), a, 3);
									}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese correctamente el DNI del copiloto ");
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese correctamente el DNI del conductor ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un numero de carro valido ");	
						}else JOptionPane.showMessageDialog(null, "Error. Seleccione una fila");
								
					}
				});
			}
			{
				btnNewButton_2 = new JButton("Elimiar");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int a = table.getSelectedRow();
						if(a>=0)
							model.removeRow(a);
						else
							JOptionPane.showMessageDialog(null, "Error al Eliminar");
					}
				});
			}
			{
				btnNewButton_3 = new JButton("Atras");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addContainerGap())
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(5)
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton)
							.addComponent(btnNewButton_1)
							.addComponent(btnNewButton_2)
							.addComponent(btnNewButton_3)))
			);
			buttonPane.setLayout(gl_buttonPane);
		}
		
		
	}
}
