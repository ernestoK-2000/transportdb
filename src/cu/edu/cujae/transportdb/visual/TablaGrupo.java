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
import cu.edu.cujae.transportdb.services.CountryServices;
import cu.edu.cujae.transportdb.services.GroupsServices;
import cu.edu.cujae.transportdb.services.ServicesLocator;

import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

public class TablaGrupo extends JDialog {
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

    private GroupsServices gs = ServicesLocator.getGroupsServices();
    private CountryServices cs = ServicesLocator.getCountryServices();
    private final DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };
    private final Object[] row = new Object[6];
    LinkedList<CountryDto> countries;
    LinkedList<GroupsDto> groups;


    /**
     * Create the dialog.
     */
    public TablaGrupo() {
        try {
            countries = cs.getAllInfo();
            groups = gs.getAllInfo();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        setTitle("Grupo");
        setBounds(100, 100, 665, 445);
        setModal(true);
        getContentPane().setLayout(new FormLayout(new ColumnSpec[]{
                ColumnSpec.decode("649px:grow"),},
                new RowSpec[]{
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

                Object[] columns = {"Cantidad de Personas", "Pais"};

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
            panel.setLayout(new FormLayout(new ColumnSpec[]{
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
                    new RowSpec[]{
                            FormFactory.LINE_GAP_ROWSPEC,
                            RowSpec.decode("27px"),
                            FormFactory.RELATED_GAP_ROWSPEC,
                            FormFactory.DEFAULT_ROWSPEC,}));
            {
                lblNewLabel_1 = new JLabel("Cantidad de personas");
                panel.add(lblNewLabel_1, "3, 2, right, default");
            }
            {
                spinner = new JSpinner();
                spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
                panel.add(spinner, "5, 2, fill, default");
            }
            {
                lblNewLabel_2 = new JLabel("Pais");
                panel.add(lblNewLabel_2, "7, 2, right, default");
            }
            {
                comboBox = new JComboBox();
                comboBox.addItem("Ninguno");
                try {
                    LinkedList<CountryDto> countries = cs.getAllInfo();
                    for (CountryDto c :
                            countries) {
                        comboBox.addItem(c.getCountry());
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                panel.add(comboBox, "10, 2, fill, default");
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
                        if (!(comboBox.getSelectedItem().toString().equals("Ninguno"))) {
                            insertData();
                        } else JOptionPane.showMessageDialog(null, "Error. Por favor elija un pais ");

                    }
                });
            }
            {
                btnNewButton_1 = new JButton("Modificar");
                btnNewButton_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        int a = table.getSelectedRow();
                        if (a >= 0) {
                            if (!(comboBox.getSelectedItem().toString() == ("Ninguno"))) {
                                modifyData(a);
                            } else JOptionPane.showMessageDialog(null, "Error. Por favor elija un pais ");
                        } else JOptionPane.showMessageDialog(null, "Error. Seleccione una fila");

                    }
                });
            }
            {
                btnNewButton_2 = new JButton("Eliminar");
                btnNewButton_2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        int a = table.getSelectedRow();
                        if (a >= 0)
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

        /** Ernest's code **/
        loadData();
    }

    private void loadData() {
        for (GroupsDto g :
                groups) {
            row[0] = g.getAmountOfPeople();
            row[1] = g.getIdCountry();

            boolean found = false;
            Iterator<CountryDto> iter = countries.iterator();
            while (iter.hasNext() && !found) {
                CountryDto c = iter.next();
                if (c.getIdCountry() == g.getIdCountry()) {
                    found = true;
                    row[1] = c.getCountry();
                }
            }
            model.addRow(row);
        }
    }

    private void insertData() {
        //get modification info
        int amountPeopleAfter = (Integer) spinner.getValue();
        String countryAfter = comboBox.getSelectedItem().toString();

        //insert gui
        row[0] = amountPeopleAfter;
        row[1] = countryAfter;
        model.addRow(row);


        try {
            //get idCountry
            int idCountry = cs.getIdCountry(countryAfter);

            //insert db
            gs.insertGroups(new GroupsDto(0, (Integer) spinner.getValue(), idCountry));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void modifyData(int rowNumber){

        try{
            //get current info
            int amountPeopleBefore = (Integer) model.getValueAt(rowNumber, 0);
            String countryBefore = model.getValueAt(rowNumber, 1).toString();


            //get modification info
            int amountPeopleAfter = (Integer) spinner.getValue();
            String countryAfter = comboBox.getSelectedItem().toString();

            //change info in gui
            model.setValueAt(amountPeopleAfter, rowNumber, 0);
            model.setValueAt(countryAfter, rowNumber, 1);

            //change info in bd
            /*
            Info needed:
            - idGroups
            - amountPeopleAfter
            - idCountryAfter
             */

            //Find idCountryAfter
            int idCountryAfter = cs.getIdCountry(countryAfter);

            //Find idGroups
            /*
            Info needed:
            - amountPeopleBefore
            - idCountryBefore
             */

            //Find idCountryBefore
            int idCountryBefore = cs.getIdCountry(countryBefore);
            int idGroups = gs.getIdGroup(amountPeopleBefore, idCountryBefore);

            System.out.println(idGroups);
            System.out.println(amountPeopleAfter);
            System.out.println(idCountryAfter);
            gs.updateGroups(new GroupsDto(idGroups, amountPeopleAfter, idCountryAfter));

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteData(int rowNumber){
        //get current info
        int amountPeopleBefore = (Integer) model.getValueAt(rowNumber, 0);
        String countryBefore = model.getValueAt(rowNumber, 1).toString();

        //delete from gui
        model.removeRow(rowNumber);

        //delete from db
        try{
            gs.deleteRegister(gs.getIdGroup(amountPeopleBefore, cs.getIdCountry(countryBefore)));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
