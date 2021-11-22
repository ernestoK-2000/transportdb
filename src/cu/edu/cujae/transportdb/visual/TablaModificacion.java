package cu.edu.cujae.transportdb.visual;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;

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
import cu.edu.cujae.transportdb.dto.GroupsDto;
import cu.edu.cujae.transportdb.dto.ModificationDto;
import cu.edu.cujae.transportdb.dto.ModificationTypeDto;
import cu.edu.cujae.transportdb.services.ModificationServices;
import cu.edu.cujae.transportdb.services.ModificationTypeServices;
import cu.edu.cujae.transportdb.services.ServicesLocator;

import javax.swing.JComboBox;

public class TablaModificacion extends JDialog {
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

	private final Object[] row= new Object[6];
	private final DefaultTableModel model = new DefaultTableModel();
	private ModificationServices ms = ServicesLocator.getModificationServices();
	private LinkedList<ModificationDto> modifications;
	private LinkedList<ModificationTypeDto> modificationTypes;
	private ModificationTypeServices mts = ServicesLocator.getModificationTypeServices();

	/**
	 * Create the dialog.
	 */
	public TablaModificacion() {
		try {
			modifications = ms.getAllInfo();
			modificationTypes = mts.getAllInfo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		setTitle("Modificacion del Grupo");
		setBounds(100, 100, 665, 445);
		setModal(true);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("649px:grow"),},
			new RowSpec[] {
				RowSpec.decode("66px:grow"),
				RowSpec.decode("297px:grow"),
				RowSpec.decode("41px:grow"),}));

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
				
				Object[] columns = {"Fecha", "Tipo de modificacion", "Nuevo valor", "Grupo"};
				
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
				lblNewLabel_2 = new JLabel("Tipo de modificacion");
				panel.add(lblNewLabel_2, "7, 2, right, default");
			}
			{
				comboBox = new JComboBox();
				comboBox.addItem("Ninguno");
				for (ModificationTypeDto mt :
						modificationTypes) {
					comboBox.addItem(mt.getModification());
				}
				panel.add(comboBox, "10, 2, fill, default");
			}
			{
				lblNewLabel = new JLabel("Nuevo valor");
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
									insertData();
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un valor correcto ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor elija un tipo de modificacion ");
					
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
										updateData(a);
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un valor correcto ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor elija un tipo de modificacion ");		
						}else JOptionPane.showMessageDialog(null, "Error. Seleccione una fila");
								
					}
				});
			}
			{
				btnNewButton_2 = new JButton("Eliminar");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int a = table.getSelectedRow();
						if(a>=0)
							deleteData(a);
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
		loadData();
	}

	private void loadData() {
		for (ModificationDto m :
				modifications) {
			row[0] = m.getDate();
			row[2] = m.getNewValue();
			row[3] = m.getIdGroups();

			//find modification by modificationId
			boolean found = false;
			Iterator<ModificationTypeDto> iter = modificationTypes.iterator();
			while (iter.hasNext() && !found) {
				ModificationTypeDto mt = iter.next();
				if (m.getIdModificationType() == mt.getIdModificationType()) {
					found = true;
					row[1] = mt.getModification();
				}
			}
			model.addRow(row);
		}
	}

	private void insertData() {
		//get insert info
		Date dateAfter = new Date(((java.util.Date)spinner.getValue()).getTime());
		String modificationType = comboBox.getSelectedItem().toString();
		String newValue = textField.getText().toString();
		int idGroups = 1;

		//insert gui
		row[0] = dateAfter;
		row[1] = modificationType;
		row[2] = newValue;
		row[3] = idGroups;
		model.addRow(row);


		try {
			//get idModificationType
			int idModificationType = mts.getIdModificationType(modificationType);

			//insert db
			ms.insertModification(new ModificationDto(0, dateAfter, newValue, idModificationType, idGroups));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void updateData(int rowNumber){
		try{
			//get current info
			Date dateBefore = new Date(((java.util.Date)model.getValueAt(rowNumber,0)).getTime());
			String modificationTypeBefore = model.getValueAt(rowNumber, 1).toString();
			String newValueBefore = model.getValueAt(rowNumber, 2).toString();
			int idGroupsBefore = (int) model.getValueAt(rowNumber, 3);

			//get modification info
			Date dateAfter = new Date(((java.util.Date)spinner.getValue()).getTime());
			String modificationTypeAfter = comboBox.getSelectedItem().toString();
			String newValueAfter = textField.getText().toString();
			int idGroupsAfter = 1;

			//change info in gui
			model.setValueAt(dateAfter, rowNumber, 0);
			model.setValueAt(modificationTypeAfter, rowNumber, 1);
			model.setValueAt(newValueAfter, rowNumber, 2);
			model.setValueAt(idGroupsAfter, rowNumber, 3);

			//change info in bd
            /*
            Info needed:
            - idModification
            - dateAfter
            - newValueAfter
            - idModificationTypeAfter
            - idGroupsAfter
             */

			//Find idModificationTypeAfter
			int idModificationTypeAfter = mts.getIdModificationType(modificationTypeAfter);

			//Find idModification
            /*
            Info needed:
            - dateBefore
            - newValueBefore
            - idModificationTypeBefore
            - idGroupsBefore
             */

			//Find idModificationTypeBefore
			int idModificationTypeBefore = mts.getIdModificationType(modificationTypeBefore);
			int idModification = ms.getIdModification(dateBefore, newValueBefore, idModificationTypeBefore, idGroupsBefore);

			System.out.println(idModification);
			System.out.println(dateAfter);
			System.out.println(newValueAfter);
			System.out.println(idModificationTypeAfter);
			ms.updateModification(new ModificationDto(idModification, dateAfter, newValueAfter, idModificationTypeAfter, idGroupsAfter));

		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	public void deleteData(int rowNumber){
		//get current info
		Date dateBefore = new Date(((java.util.Date)model.getValueAt(rowNumber,0)).getTime());
		String modificationTypeBefore = model.getValueAt(rowNumber, 1).toString();
		String newValueBefore = model.getValueAt(rowNumber, 2).toString();
		int idGroupsBefore = (int) model.getValueAt(rowNumber, 3);

		//delete from gui
		model.removeRow(rowNumber);

		//delete from db
		try{
			ms.deleteRegister(ms.getIdModification(dateBefore, newValueBefore, mts.getIdModificationType(modificationTypeBefore), idGroupsBefore));
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
