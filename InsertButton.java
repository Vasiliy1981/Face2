
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class InsertButton implements ActionListener {

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    //	JTextField textField4;
    JTextField textField5;
    JTextField textField6;

    double d1;
    double d2;
    double d3;
    double c;
    String s2;
    String text7;



    public void getTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public void getTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public void getTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    //   public void setTextField4(JTextField textField4) {
    //       this.textField4 = textField4;
    //   }


    public void getTextField5(JTextField textField5) {
        this.textField5 = textField5;
    }
    public void getTextField6(JTextField textField6) {
        this.textField6 = textField6;
    }

    public void actionPerformed(ActionEvent e) {

        String a1 = textField1.getText();
        String a2 = textField2.getText();
        String a3 = textField3.getText();
        String a4 = textField5.getText();
        String a5 = textField6.getText();

        //   d1 = Double.parseDouble(a1);
        //   d2 = Double.parseDouble(a2);
        //   d3 = Double.parseDouble(a3);
        //   c = d1 + d2 +d3;

        //   s2 = String.valueOf(c);
        //    textField4.setText(a1 + a2 + a3);



        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:///c:/hsqldb/mydb", "SA", "");

            Statement stInsertData = conn.createStatement();
            String INSERT_DATA1 = "insert into MY_TABLE ( firstname, middlename,"
                    + " lastname, emailaddress, phonenumber) values ('" + a1 + "', '" +
                    a2 + "', '" + a3 + "', '" + a4 + "', '" + a5 +"')";

            System.out.println(INSERT_DATA1);


            stInsertData.execute(INSERT_DATA1);

        }

        catch (Exception excepton) {
            excepton.printStackTrace();
        }

    }
}


