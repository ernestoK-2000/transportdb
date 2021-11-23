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
import cu.edu.cujae.transportdb.dto.GroupsDto;
import cu.edu.cujae.transportdb.dto.ProgrammingTypeDto;
import cu.edu.cujae.transportdb.services.ProgrammingTypeServices;
import cu.edu.cujae.transportdb.services.ServicesLocator;

import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.LinkedList;

public class TablaTipoProgramacion extends JDialog {
	boolean x = false;
	private JButton btnNewButton_3;
	private JTable table;
	private JScrollPane scrollPane;


	private ProgrammingTypeServices pts = ServicesLocator.getProgrammingTypeServices();
	private Object[] row= new Object[6];
	private DefaultTableModel model = new DefaultTableModel(){
		@Override
		public boolean isCellEditable(int row, int column) {
			//all cells false
			return false;
		}
	};

	/**
	 * Create the dialog.
	 */
	public TablaTipoProgramacion() {
		setTitle("Tipos de Programaciones");
		setModal(true);
		setBounds(100, 100, 665, 445);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("649px:grow"),},
			new RowSpec[] {
				RowSpec.decode("2px"),
				RowSpec.decode("358px:grow"),
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
				
				Object[] columns = {"Código de Solicitud ", "Tipo de Programación"};
				
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
		///////
		
		//////
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, "1, 3, fill, top");
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
						.addGap(503)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
						.addContainerGap())
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(5)
						.addComponent(btnNewButton_3))
			);
			buttonPane.setLayout(gl_buttonPane);
		}
		
		loadData();
	}

	private void loadData(){
		try {
			LinkedList<ProgrammingTypeDto> groups = pts.getAllInfo();
			for (ProgrammingTypeDto pt :
					groups) {
				row[0] = pt.getIdProgrammingType();
				row[1] = pt.getProgrammingType();
				model.addRow(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}


