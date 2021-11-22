package cu.edu.cujae.transportdb.visual;

import java.awt.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

public class TablaSituacionCarro extends JDialog {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JSpinner spinner;
	private JScrollPane scrollPane;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JTextField textField;



	/**
	 * Create the dialog.
	 */
	public TablaSituacionCarro() {
		setTitle("Situacion del Carro");
		setBounds(100, 100, 665, 445);
		setModal(true);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("649px:grow"),},
			new RowSpec[] {
				RowSpec.decode("66px:grow"),
				RowSpec.decode("297px:grow"),
				RowSpec.decode("41px:grow"),}));
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
				
				Object[] columns = {"Fecha", "Situacion", "Numero del carro"};
				
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
					ColumnSpec.decode("left:max(33dlu;default)"),
					ColumnSpec.decode("4px"),
					FormFactory.RELATED_GAP_COLSPEC,
					ColumnSpec.decode("max(87dlu;default):grow"),
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
				spinner = new JSpinner();
				spinner.setModel(new SpinnerDateModel(new java.util.Date(1637388000000L), new java.util.Date(1637388000000L), new java.util.Date(1668924000000L), Calendar.DAY_OF_YEAR));
				panel.add(spinner, "5, 2, fill, default");
			}
			{
				lblNewLabel_2 = new JLabel("Situacion");
				panel.add(lblNewLabel_2, "7, 2, right, default");
			}
			{
				comboBox = new JComboBox();
				comboBox.addItem("Ninguno");
				comboBox.addItem("Cuba");
				comboBox.addItem("Brasil");
				comboBox.addItem("Aegentina");
				comboBox.addItem("Venezuela");
				comboBox.addItem("Nicaragua");
				comboBox.addItem("Uruguay");
				panel.add(comboBox, "10, 2, fill, default");
			}
			{
				lblNewLabel = new JLabel("Numero del carro");
				panel.add(lblNewLabel, "3, 4, right, default");
			}
			{
				textField = new JTextField();
				panel.add(textField, "5, 4, fill, default");
				textField.setColumns(10);
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
						if(!(comboBox.getSelectedItem().toString() == ("Ninguno"))){
							if(!(textField.getText().toString().equals(""))){
									row[0] = spinner.getValue();
									row[1] = comboBox.getSelectedItem().toString();
									row[2] = textField.getText().toString();
									model.addRow(row);
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un numero de carro valido ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor elija una situacion ");
					
				}
			});
			}
			{
				btnNewButton_1 = new JButton("Modificar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int a = table.getSelectedRow();
						if(a>=0){
							if(!(comboBox.getSelectedItem().toString() == ("Ninguno"))){
								if(!(textField.getText().toString().equals(""))){
										model.setValueAt(spinner.getValue(), a, 0);
										model.setValueAt(comboBox.getSelectedItem().toString(), a, 1);
										model.setValueAt(textField.getText().toString(), a, 2);
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un numero de carro valido ");		
							}else JOptionPane.showMessageDialog(null, "Error. Por favor elija un pais ");		
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
							JOptionPane.showMessageDialog(null, "Error al Eliminar, por favor elija una fila");
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
