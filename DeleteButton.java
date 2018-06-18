/**
 * Created by Vasiliy on 13.09.2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DeleteButton implements ActionListener {

/*    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    //	JTextField textField4;
    JTextField textField5;
  */
    JTextField textField7;

    double d1;
    double d2;
    double d3;
    double c;
    String s2;
    String text7;



    public void getTextField7(JTextField textField7) {
        this.textField7 = textField7;
    }


    public void actionPerformed(ActionEvent e) {

        String d1 = textField7.getText();

        Integer i1 = Integer.valueOf(d1);

        //   d1 = Double.parseDouble(a1);
        //   d2 = Double.parseDouble(a2);
        //   d3 = Double.parseDouble(a3);
        //   c = d1 + d2 +d3;

        //   s2 = String.valueOf(c);
        //    textField4.setText(a1 + a2 + a3);



        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:file:///c:/hsqldb/mydb", "SA", "");

            Statement stInsertData = conn2.createStatement();
            String DELETE_DATA1 = "delete from MY_TABLE where id = '" + i1 + "' ";

            System.out.println(DELETE_DATA1);


            stInsertData.execute(DELETE_DATA1);

        }

        catch (Exception exception) {
            exception.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Record number " + i1 + ", was deleted.");

    }
}



