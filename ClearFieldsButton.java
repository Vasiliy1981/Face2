/**
 * Created by Vasiliy on 14.09.2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClearFieldsButton implements ActionListener {

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    public JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextArea textArea;
    String zero = "";


    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public void setTextField5(JTextField textField5) {
        this.textField5 = textField5;
    }

    public void setTextField6(JTextField textField6) {
        this.textField6 = textField6;
    }



    public void actionPerformed(ActionEvent e) {

        textField1.setText(zero);
        textField2.setText(zero);
        textField3.setText(zero);
        textField5.setText(zero);
        textField6.setText(zero);

       }
}

