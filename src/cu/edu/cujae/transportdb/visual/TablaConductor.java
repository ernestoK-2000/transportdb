package cu.edu.cujae.transportdb.visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.GridLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;

import java.awt.Font;

import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TablaConductor extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_1;
	private JScrollPane scrollPane;




	/**
	 * Create the dialog.
	 */
	public TablaConductor() {
		setTitle("Conductores");
		setBounds(100, 100, 722, 480);
		getContentPane().setLayout(null);
		
		table = new JTable();
		final DefaultTableModel model = new DefaultTableModel();
		/*table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int a = table.getSelectedRow();
				textField.setText(model.getValueAt(a, 0).toString());
				textField_1.setText(model.getValueAt(a, 0).toString());
				textField_2.setText(model.getValueAt(a, 0).toString());
				textField_3.setText(model.getValueAt(a, 0).toString());
				//comboBox.getSelectedItem.setText(model.getValueAt(a, 0).toString());
				textField_4.setText(model.getValueAt(a, 0).toString());
				
			}
		});*/
		table.setBounds(0, 121, 686, 255);
		Object[] columns = {"Nombre", "1er Apellido", "2do Apeliido", "DNI", "Categoria", "Direccion"};
		
		model.setColumnIdentifiers(columns);
		getContentPane().add(table);
		table.setToolTipText("aaaaaaaaa");
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		table.setBackground(Color.white);
		table.setForeground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.red);
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		table.setModel(model);
		
		
		JScrollPane one = new JScrollPane(table);
		one.setForeground(Color.RED);
		one.setBackground(Color.WHITE);
		one.setBounds(10,122,669,279);
		getContentPane().add(one);
		
		final Object[] row= new Object[6];
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 706, 116);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(20, 25, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setBounds(20, 75, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2do Apellido");
		lblNewLabel_2.setBounds(453, 25, 77, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria");
		lblNewLabel_3.setBounds(178, 75, 57, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1er Apellido");
		lblNewLabel_4.setBounds(240, 25, 67, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(320, 75, 61, 14);
		panel_1.add(lblDireccion);
		
		textField = new JTextField();
		textField.setBounds(65, 22, 170, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(312, 22, 137, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(526, 22, 170, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(48, 72, 120, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String x;
				if(e.getStateChange() == ItemEvent.SELECTED)
					x = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setBounds(239, 72, 71, 20);
		panel_1.add(comboBox);
		comboBox.addItem("None");
		comboBox.addItem("A");
		comboBox.addItem("B");
		comboBox.addItem("C");
		comboBox.addItem("D");
		comboBox.addItem("E");
		comboBox.addItem("F");
		
		
		textField_4 = new JTextField();
		textField_4.setBounds(378, 72, 318, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		
		{
			
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 402, 706, 39);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(null);
			
			JButton but2 = new JButton("Modificar");
			but2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int a = table.getSelectedRow();
					if(a>=0){
						if(!(textField.getText().toString().equals(""))){
							if(!(textField_1.getText().toString().equals(""))){
								if(!(textField_2.getText().toString().equals(""))){
									if(!(textField_3.getText().toString().equals(""))){
										if(!(textField_4.getText().toString().equals(""))){
											if(!(comboBox.getSelectedItem().toString()== "None")){
												model.setValueAt(textField.getText(), a, 0);
												model.setValueAt(textField_1.getText(), a, 1);
												model.setValueAt(textField_2.getText(), a, 2);
												model.setValueAt(textField_3.getText(), a, 3);
												model.setValueAt(comboBox.getSelectedItem().toString(), a, 4);
												model.setValueAt(textField_4.getText(), a, 5);
											}else JOptionPane.showMessageDialog(null, "Error. Por favor elija una categoria ");
										}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese una direccion valida ");
									}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un DNI valido ");
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese su segundo apellido ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese su primer apellido ");
						}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese su nombre ");	
					}else JOptionPane.showMessageDialog(null, "Error. Por favor elija una fila ");
					
						
				}
			});
			but2.setBounds(184, 5, 161, 23);
			buttonPane.add(but2);
			
			JButton but3 = new JButton("Eliminar");
			but3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int a = table.getSelectedRow();
						if(a>=0)model.removeRow(a);
						
						else JOptionPane.showMessageDialog(null, "Error. Por favor elija una fila ");
				}
			});
			but3.setBounds(355, 5, 161, 23);
			buttonPane.add(but3);
			
			JButton but1 = new JButton("Insertar");
			but1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
						if(!(textField.getText().toString().equals(""))){
							if(!(textField_1.getText().toString().equals(""))){
								if(!(textField_2.getText().toString().equals(""))){
									if(!(textField_3.getText().toString().equals(""))){
										if(!(textField_4.getText().toString().equals(""))){
											if(!(comboBox.getSelectedItem().toString()== "None")){
												row[0] = textField.getText();
												row[1] = textField_1.getText();
												row[2] = textField_2.getText();
												row[3] = textField_3.getText();
												row[4] = comboBox.getSelectedItem().toString();
												row[5] = textField_4.getText();
												model.addRow(row);
											}else JOptionPane.showMessageDialog(null, "Error. Por favor elija una categoria ");
										}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese una direccion valida ");
									}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un DNI valido ");
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese su segundo apellido ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese su primer apellido ");
						}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese su nombre ");	
					}
				}
			);
			but1.setBounds(10, 5, 161, 23);
			buttonPane.add(but1);
			
			JButton but4 = new JButton("Atras");
			but4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			but4.setBounds(526, 5, 161, 23);
			buttonPane.add(but4);
		}
		
		
		
		
		
		
		
	}
}
