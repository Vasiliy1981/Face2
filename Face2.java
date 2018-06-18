import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Face2 {
    static JTextField textField1;
    static JTextField textField2;
    static JTextField textField3;
    static JTextField textField4;
    static JTextField textField5;
    static JTextField textField6;
    static JComboBox<String> comboBox;
    static JTextField textField7;
    static JTextArea textArea;
    static String search;
    //   static Boolean tableExistCheck;

    static String bookTableSQL;
 //   static ResultSet rs2;



    static String[] items = {
            "Choose...",
            "firstname",
            "middlename",
            "lastname",
            "emailaddress",
            "phonenumber"
    };

    public static void main(String[] JTextField) {
        JFrame frame = new JFrame("Phone book");

        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(21, 2));
        frame.add(panel);

        JLabel label36 = new JLabel("Phone", JLabel.RIGHT);
        panel.add(label36);
        label36.setVisible(true);

        JLabel label37 = new JLabel(" book", JLabel.LEFT);
        panel.add(label37);
        label37.setVisible(true);

        JLabel label1 = new JLabel("First name", JLabel.CENTER);
        panel.add(label1);
        label1.setVisible(true);

        JTextField textField1 = new JTextField("", 12);
        panel.add(textField1);
        textField1.setVisible(true);

        JLabel label2 = new JLabel("Middle name", JLabel.CENTER);
        panel.add(label2);
        label2.setVisible(true);


        JTextField textField2 = new JTextField("", 12);
        panel.add(textField2);
        textField2.setVisible(true);

        JLabel label3 = new JLabel("Last name", JLabel.CENTER);
        panel.add(label3);
        label3.setVisible(true);

        JTextField textField3 = new JTextField("", 12);
        panel.add(textField3);
        textField3.setVisible(true);

        JLabel label5 = new JLabel("Email address", JLabel.CENTER);
        panel.add(label5);
        label5.setVisible(true);

        JTextField textField5 = new JTextField("", 12);
        panel.add(textField5);
        textField5.setVisible(true);

        JLabel label6 = new JLabel("Phone number", JLabel.CENTER);
        panel.add(label6);
        label6.setVisible(true);

        JTextField textField6 = new JTextField("", 12);
        panel.add(textField6);
        textField6.setVisible(true);

        JLabel label71 = new JLabel("   ", JLabel.CENTER);
        panel.add(label71);
        label71.setVisible(true);

        JLabel label72 = new JLabel("   ", JLabel.CENTER);
        panel.add(label72);
        label72.setVisible(true);

        JLabel label721 = new JLabel("   ", JLabel.CENTER);
        panel.add(label721);
        label721.setVisible(true);


        JButton button4 = new JButton("Insert");
        panel.add(button4);
        button4.setVisible(true);

        JLabel label722 = new JLabel("   ", JLabel.CENTER);
        panel.add(label722);
        label722.setVisible(true);

        JLabel label723 = new JLabel("   ", JLabel.CENTER);
        panel.add(label723);
        label723.setVisible(true);

        JLabel label724 = new JLabel("   ", JLabel.CENTER);
        panel.add(label724);
        label724.setVisible(true);

        JButton button9 = new JButton("Clear fields");
        panel.add(button9);
        button9.setVisible(true);

        JLabel label81 = new JLabel("   ", JLabel.CENTER);
        panel.add(label81);
        label81.setVisible(true);

        JLabel label82 = new JLabel("   ", JLabel.CENTER);
        panel.add(label82);
        label82.setVisible(true);

        JLabel label8 = new JLabel("Search by", JLabel.CENTER);
        panel.add(label8);
        label8.setVisible(true);

        JComboBox<String> comboBox = new JComboBox<String>(items);
        panel.add(comboBox);
        comboBox.setVisible(true);

        JLabel label91 = new JLabel("   ", JLabel.CENTER);
        panel.add(label91);
        label91.setVisible(true);

        JLabel label92 = new JLabel("   ", JLabel.CENTER);
        panel.add(label92);
        label92.setVisible(true);

        JLabel label10 = new JLabel("   ", JLabel.CENTER);
        panel.add(label10);
        label10.setVisible(true);


        JButton button5 = new JButton("Search");
        panel.add(button5);
        button5.setVisible(true);

        JLabel label32 = new JLabel("   ", JLabel.CENTER);
        panel.add(label32);
        label32.setVisible(true);

        JLabel label33 = new JLabel("   ", JLabel.CENTER);
        panel.add(label33);
        label33.setVisible(true);


        JLabel label4 = new JLabel("Search parameter is", JLabel.CENTER);
        panel.add(label4);
        label4.setVisible(true);

        JTextField textField4 = new JTextField("", 12);
        panel.add(textField4);
        textField4.setVisible(true);

        JLabel label51 = new JLabel("   ", JLabel.CENTER);
        panel.add(label51);
        label51.setVisible(true);

        JLabel label52 = new JLabel("   ", JLabel.CENTER);
        panel.add(label52);
        label52.setVisible(true);

        JLabel label111 = new JLabel("   ", JLabel.CENTER);
        panel.add(label111);
        label111.setVisible(true);

        JLabel label112 = new JLabel("   ", JLabel.CENTER);
        panel.add(label112);
        label112.setVisible(true);

        JLabel label113 = new JLabel("Enter entry ID to delete:", JLabel.CENTER);
        panel.add(label113);
        label113.setVisible(true);

        JTextField textField7 = new JTextField("Search to find out ID", 12);
        panel.add(textField7);
        textField7.setVisible(true);

        JLabel label61 = new JLabel("   ", JLabel.CENTER);
        panel.add(label51);
        label51.setVisible(true);

        JLabel label62 = new JLabel("   ", JLabel.CENTER);
        panel.add(label52);
        label52.setVisible(true);

        JLabel label101 = new JLabel("   ", JLabel.CENTER);
        panel.add(label101);
        label101.setVisible(true);

        JButton button8 = new JButton("Delete");
        panel.add(button8);
        button8.setVisible(true);



        InsertButton action1 = new InsertButton();
        action1.getTextField1(textField1);
        action1.getTextField2(textField2);
        action1.getTextField3(textField3);
        action1.getTextField5(textField5);
        action1.getTextField6(textField6);

        button4.addActionListener(action1);

        Combo action2 = new Combo();
        action2.getComboBox(comboBox);
        action2.setTextField4(textField4);

        comboBox.addActionListener(action2);

//        action2.setTextField4(textField4);

        SearchButton action3 = new SearchButton();
        action3.getTextField1(textField1);
        action3.getTextField2(textField2);
        action3.getTextField3(textField3);
        action3.getTextField4(textField4);
        action3.getTextField5(textField5);
        action3.getTextField6(textField6);
        //     action3.getComboBox(comboBox);
        button5.addActionListener(action3);
        action3.setTextArea(textArea);
        //     comboBox.addActionListener(action3);

        DeleteButton action4 = new DeleteButton();
        action4.getTextField7(textField7);
        button8.addActionListener(action4);

        ClearFieldsButton action5 = new ClearFieldsButton();
        action5.setTextField1(textField1);
        action5.setTextField2(textField2);
        action5.setTextField3(textField3);
        action5.setTextField5(textField5);
        action5.setTextField6(textField6);
        button9.addActionListener(action5);

        frame.setVisible(true);



        try   {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:///c:/hsqldb/mydb", "SA", "");


            final String bookTableSQL = "create table MY_TABLE ("+
                    " id INTEGER IDENTITY PRIMARY KEY,"+
                    " firstname char(256) not null,"+
                    " middlename char(256) not null,"+
                    " lastname char(256) not null,"+
                    " emailaddress char(256) not null," +
                    " phonenumber char(256) not null" +
                    ")";


            Statement stCreateTable = conn.createStatement();
            stCreateTable.execute(bookTableSQL); }

        catch (Exception exception) {
            exception.printStackTrace();

        }
    }
}