package cu.edu.cujae.transportdb.visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
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
import cu.edu.cujae.transportdb.dto.ApplicationDto;
import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.GroupsDto;
import cu.edu.cujae.transportdb.services.ApplicationServices;
import cu.edu.cujae.transportdb.services.ServicesLocator;

import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.Iterator;
import java.util.LinkedList;

public class TablaSolicitud extends JDialog {
	boolean x = false;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JSpinner spinner;
	private JScrollPane scrollPane;
	private JCheckBox chckbxNewCheckBox;
	private JLabel lblNewLabel;
	private JSpinner spinner_1;

	private final Object[] row= new Object[6];
	private final DefaultTableModel model = new DefaultTableModel(){
		@Override
		public boolean isCellEditable(int row, int column) {
			//all cells false
			return false;
		}
	};

	private ApplicationServices as = ServicesLocator.getApplicationServices();
	private LinkedList<ApplicationDto> applications;

	/**
	 * Create the dialog.
	 */
	public TablaSolicitud() {
		try {
			applications = as.getAllInfo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		setTitle("Solicitudes");
		setBounds(100, 100, 665, 445);
		setModal(true);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("649px:grow"),},
			new RowSpec[] {
				RowSpec.decode("38px:grow"),
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
				
				Object[] columns = {"Fecha", "Solicitud", "Grupo"};
				
				model.setColumnIdentifiers(columns);
				table.setToolTipText("");
				table.setFont(new Font("Times New Roman", Font.BOLD, 16));
				table.setBackground(Color.white);
				table.setForeground(Color.black);
				table.setSelectionBackground(Color.lightGray);
				table.setGridColor(Color.black);
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
				lblNewLabel_2 = new JLabel("Solicitud");
				panel.add(lblNewLabel_2, "7, 2, right, default");
			}
			{
				chckbxNewCheckBox = new JCheckBox("Aceptada");
				chckbxNewCheckBox.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent arg0) {
						if(!(arg0.getStateChange() == ItemEvent.SELECTED)) x = false;
						else x = true;
					}
				});
				panel.add(chckbxNewCheckBox, "10, 2");
			}
			{
				lblNewLabel = new JLabel("Grupo");
				panel.add(lblNewLabel, "3, 4, right, default");
			}
			{
				spinner_1 = new JSpinner();
				spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				panel.add(spinner_1, "5, 4, fill, default");
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
									insertData();
				}
			});
			}
			{
				btnNewButton_1 = new JButton("Modificar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int a = table.getSelectedRow();
						if(a>=0){
							
										modifyData(a);
										
										
									
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
				btnNewButton_3 = new JButton("Atrás");
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
		for (ApplicationDto a :
				applications) {
			row[0] = a.getDate();
			row[1] = a.isAccepted() ? "Aceptada" : "Denegada";
			row[2] = a.getIdGroups();

			model.addRow(row);
		}
	}

	private void insertData() {
		//get modification info
		Date dateAfter = new Date(((java.util.Date)spinner.getValue()).getTime());
		boolean acepptedAfter = chckbxNewCheckBox.isSelected();
		int idGroupsAfter = (int) spinner_1.getValue();

		//insert gui
		row[0] = dateAfter;
		row[1] = acepptedAfter ? "Aceptada" : "Denegada";
		row[2] = idGroupsAfter;
		model.addRow(row);


		try {
			//insert db
			as.insertApplication(new ApplicationDto(0, acepptedAfter, dateAfter, idGroupsAfter));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void modifyData(int rowNumber){

		try{
			//get current info
			Date dateBefore = (Date) model.getValueAt(rowNumber, 0);
			boolean acceptedBefore = (model.getValueAt(rowNumber, 1).toString().equals("Aceptada"));
			int idGroupsBefore = (int) model.getValueAt(rowNumber, 2);


			//get modification info
			Date dateAfter = new Date(((java.util.Date)spinner.getValue()).getTime());
			boolean acepptedAfter = chckbxNewCheckBox.isSelected();
			int idGroupsAfter = (int) spinner_1.getValue();

			//change info in gui
			model.setValueAt(dateAfter, rowNumber, 0);
			model.setValueAt(acepptedAfter ? "Aceptada" : "Denegada", rowNumber, 1);
			model.setValueAt(idGroupsAfter, rowNumber, 2);

			//change info in bd
            /*
            Info needed:
            - idApplication
            - dateAfter
            - acepptedAfter
            - idGroupsAfter
             */


			//Find idApplication
            /*
            Info needed:
            - dateBefore
            - acceptedBefore
            - idGroupsBefore
             */

			int idApplication = as.getIdApplication(acceptedBefore, dateBefore, idGroupsBefore);

			System.out.println(idApplication);
			System.out.println(acepptedAfter);
			System.out.println(dateAfter);
			System.out.println(idGroupsAfter);
			as.updateApplication(new ApplicationDto(idApplication, acepptedAfter, dateAfter, idGroupsAfter));

		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	public void deleteData(int rowNumber){
		//get current info
		Date dateBefore = (Date) model.getValueAt(rowNumber, 0);
		boolean acepptedBefore = (model.getValueAt(rowNumber, 1).toString().equals("Aceptada"));
		int idGroupsBefore = (int) model.getValueAt(rowNumber, 2);

		//delete from gui
		model.removeRow(rowNumber);

		//delete from db
		try{
			as.deleteRegister(as.getIdApplication(acepptedBefore, dateBefore, idGroupsBefore));
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
