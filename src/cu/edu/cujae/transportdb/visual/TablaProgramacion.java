package cu.edu.cujae.transportdb.visual;

import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
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
import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.GroupsDto;
import cu.edu.cujae.transportdb.dto.ProgrammingDto;
import cu.edu.cujae.transportdb.dto.ProgrammingTypeDto;
import cu.edu.cujae.transportdb.services.ProgrammingServices;
import cu.edu.cujae.transportdb.services.ProgrammingTypeServices;
import cu.edu.cujae.transportdb.services.ServicesLocator;

import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

public class TablaProgramacion extends JDialog {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JSpinner spinner;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JSpinner spinner_1;
	private JLabel lblCodplanificacion;
	private JTextField textField_1;

	private final Object[] row = new Object[6];
	private final DefaultTableModel model = new DefaultTableModel(){
		@Override
		public boolean isCellEditable(int row, int column) {
			//all cells false
			return false;
		}
	};
	private ProgrammingServices ps = ServicesLocator.getProgrammingServices();
	private ProgrammingTypeServices pts = ServicesLocator.getProgrammingTypeServices();


	/**
	 * Create the dialog.
	 */
	public TablaProgramacion() {
		setTitle("Programación");
		setBounds(100, 100, 681, 445);
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
				
				Object[] columns = {"Lugar de Recogida", "Codigo de Solicitud", "Hora de salida", "Hora de llegada"};
				
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
					ColumnSpec.decode("max(103dlu;default):grow"),
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
				lblNewLabel_1 = new JLabel("Hora salida");
				panel.add(lblNewLabel_1, "3, 2, right, default");
			}
			{
				spinner = new JSpinner();
				spinner.setModel(new SpinnerDateModel(new java.util.Date(1637388000000L), new java.util.Date(1637388000000L), new java.util.Date(1668924000000L), Calendar.DAY_OF_YEAR));
				panel.add(spinner, "5, 2, fill, default");
			}
			{
				lblNewLabel_2 = new JLabel("Hora llegada");
				panel.add(lblNewLabel_2, "7, 2, right, default");
			}
			{
				spinner_1 = new JSpinner();
				spinner_1.setModel(new SpinnerDateModel(new java.util.Date(1637388000000L), new java.util.Date(1637388000000L), new java.util.Date(1668924000000L), Calendar.DAY_OF_YEAR));
				panel.add(spinner_1, "10, 2");
			}
			{
				lblNewLabel = new JLabel("Lugar de recogida");
				panel.add(lblNewLabel, "3, 4, right, default");
			}
			{
				textField = new JTextField();
				panel.add(textField, "5, 4, fill, default");
				textField.setColumns(10);
			}
			{
				lblCodplanificacion = new JLabel("Cod.Solicitud");
				panel.add(lblCodplanificacion, "7, 4");
			}
			{
				textField_1 = new JTextField();
				panel.add(textField_1, "10, 4, fill, default");
				textField_1.setColumns(10);
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
						Date x = (Date) spinner.getValue();	
						Date y = (Date) spinner_1.getValue();
						if(!(textField.getText().toString().equals(""))){
							if(!(textField_1.getText().toString().equals(""))){
								if(x.before(y)){
									insertData();
									}else JOptionPane.showMessageDialog(null, "Error. La hora de llegada debe ser posterior a la hora de entrada ");
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un codigo de solicitud valido ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un lugar de recogid valido ");
					
				}
			});
			}
			{
				btnNewButton_1 = new JButton("Modificar");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int a = table.getSelectedRow();
						Date x = (Date) spinner.getValue();	
						Date y = (Date) spinner_1.getValue();
						if(a>=0){
							if(!(textField.getText().toString().equals(""))){
								if(!(textField_1.getText().toString().equals(""))){
									if(x.before(y)){
										modifyData(a);
									}else JOptionPane.showMessageDialog(null, "Error. La hora de llegada debe ser posterior a la hora de entrada ");
								}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un codigo de solicitud valido ");
							}else JOptionPane.showMessageDialog(null, "Error. Por favor ingrese un lugar de recogid valido ");		
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
		LinkedList<ProgrammingDto> programmings = null;
		LinkedList<ProgrammingTypeDto> programmingTypes = null;
		try {
			programmings = ps.getAllInfo();
			programmingTypes = pts.getAllInfo();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (ProgrammingDto p :
				programmings) {
			row[2] = p.getStartTime();
			row[3] = p.getEndTime();
			row[0] = p.getPickUpPlace();
			row[1] = p.getIdApplication();
			row[5] = p.getIdModification();

			boolean found = false;
			Iterator<ProgrammingTypeDto> iter = programmingTypes.iterator();
			while (iter.hasNext() && !found) {
				ProgrammingTypeDto pt = iter.next();
				if (pt.getIdProgrammingType() == p.getIdProgrammingType()) {
					found = true;
					row[4] = pt.getProgrammingType();
				}
			}
			model.addRow(row);
		}
	}

	private void insertData() {
		//get modification info
		String pickUpPlaceAfter =  textField.getText();
		int idApplicationAfter = Integer.parseInt(textField_1.getText());
		Time startTimeAfter = new Time(((java.util.Date)spinner.getValue()).getTime());
		Time endTimeAfter = new Time(((java.util.Date)spinner_1.getValue()).getTime());

		row[0] = textField.getText().toString();
		row[1] = textField_1.getText().toString();
		row[2] = spinner.getValue();
		row[3] = spinner_1.getValue();
		model.addRow(row);

		//insert gui
		row[0] = pickUpPlaceAfter;
		row[1] = idApplicationAfter;
		row[2] = startTimeAfter;
		row[3] = endTimeAfter;
		model.addRow(row);

		try {
			//insert db
			ps.insertProgramming(new ProgrammingDto(startTimeAfter, endTimeAfter, pickUpPlaceAfter, 0, 1, 1, 4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void modifyData(int rowNumber){

		try{
			//get current info
			String pickUpPlaceBefore =  model.getValueAt(rowNumber, 0).toString();
			int idApplicationBefore = (int) (model.getValueAt(rowNumber, 1));
			Time startTimeBefore = new Time(((java.util.Date)model.getValueAt(rowNumber, 2)).getTime());
			Time endTimeBefore = new Time(((java.util.Date)model.getValueAt(rowNumber, 3)).getTime());


			//get modification info
			String pickUpPlaceAfter =  textField.getText();
			int idApplicationAfter = Integer.parseInt(textField_1.getText());
			Time startTimeAfter = new Time(((java.util.Date)spinner.getValue()).getTime());
			Time endTimeAfter = new Time(((java.util.Date)spinner_1.getValue()).getTime());

			//change info in gui
			model.setValueAt(pickUpPlaceAfter, rowNumber, 0);
			model.setValueAt(idApplicationAfter, rowNumber, 1);
			model.setValueAt(startTimeAfter, rowNumber, 2);
			model.setValueAt(endTimeAfter, rowNumber, 3);

			//change info in bd
            /*
            Info needed:
            - idProgramming
            - startTimeAfter
            - endTimeAfter
            - pickupPlaceAfter
            - idProgrammingTypeAfter
            - idApplicationAfter
            - idModificationAfter
             */

			//Find idProgramming
            /*
            Info needed:
            - startTimeBefore
            - endTimeBefore
            - pickupPlaceBefore
            - idApplicationBefore
             */

			int idProgramming = ps.getIdProgramming(startTimeBefore, endTimeBefore, pickUpPlaceBefore, idApplicationBefore);

			System.out.println(startTimeAfter);
			System.out.println(endTimeAfter);
			System.out.println(pickUpPlaceAfter);
			System.out.println(idApplicationAfter);
			ps.updateProgramming(new ProgrammingDto(startTimeAfter, endTimeAfter, pickUpPlaceAfter, 0, 1, 1, 4));

		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	public void deleteData(int rowNumber){
		//get current info
		String pickUpPlaceBefore =  model.getValueAt(rowNumber, 0).toString();
		int idApplicationBefore = (int) (model.getValueAt(rowNumber, 1));
		Time startTimeBefore = new Time(((java.util.Date)model.getValueAt(rowNumber, 2)).getTime());
		Time endTimeBefore = new Time(((java.util.Date)model.getValueAt(rowNumber, 3)).getTime());

		//delete from gui
		model.removeRow(rowNumber);

		//delete from db
		try{
			ps.deleteRegister(ps.getIdProgramming(startTimeBefore, endTimeBefore, pickUpPlaceBefore, idApplicationBefore));
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
