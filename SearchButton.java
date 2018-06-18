
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchButton implements ActionListener {

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    public JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextArea textArea;
    int identificator;
    String text1;
    String text2;
    String text3;
    String text4;
    String text5;
    String totalText;
    //	JComboBox comboBox;
    String search;
    int rawCounter;



    public void getTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public void getTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public void getTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public void getTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public void getTextField5(JTextField textField5) {
        this.textField5 = textField5;
    }

    public void getTextField6(JTextField textField6) {
        this.textField6 = textField6;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void actionPerformed(ActionEvent e) {

        String e1 = textField1.getText();
        String e2 = textField2.getText();
        String e3 = textField3.getText();
        String e4 = textField5.getText();
        String e5 = textField6.getText();
        final String columnName = textField4.getText();

        System.out.println("columnName = " + columnName);

        switch (columnName) {
            case "firstname":
                search = e1;
                break;
            case "middlename":
                search = e2;
                break;
            case "lastname":
                search = e3;
                break;
            case "emailaddress":
                search = e4;
                break;
            case "phonenumber":
                search = e5;
                break;
            default:
                System.out.println("Error");
        }

        System.out.println("search = " + search);

        JFrame frame3 = new JFrame("Search result");
        frame3.setSize(220, 350);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocation(500, 250);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 1));
        frame3.add(panel2);

        JTextArea textArea = new JTextArea();
        panel2.add(textArea);
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        panel2.add(scroll);
        // JScrollPane scrollPane = new JScrollPane(textArea);
        // panel2.add(scrollPane, BorderLayout.EAST);
        // scrollPane.setVisible(true);
        textArea.setVisible(true);

        frame3.setVisible(true);

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:///c:/hsqldb/mydb", "SA", "");

            Statement stmt1 = conn.createStatement();

            ResultSet rs1 = stmt1
                    .executeQuery("SELECT COUNT(*) FROM MY_TABLE WHERE " + columnName + " = '" + search + "'; ");

            if (rs1.next()) {
                // read the data out of the result set.
                rawCounter = rs1.getInt(1);

                System.out.println("There are " + rawCounter + " raws found in table");

            } else {
                // handle the case that no matching data was found.

                System.out.println("No data was extracted from table");
            }

            Statement stmt2 = conn.createStatement();

            ResultSet rs2 = stmt2.executeQuery(
                    "SELECT id, firstname, middlename, lastname, emailaddress, phonenumber FROM MY_TABLE WHERE "
                            + columnName + " = '" + search + "'; ");

            // rs2.next();
            while (rs2.next()) {

                for (int i = 1; i <= rawCounter; i++)

                {
                    if (i > 1)
                        System.out.println("\n Next record");

                    identificator = rs2.getInt("id");
                    text1 = rs2.getString("firstname");
                    text2 = rs2.getString("middlename");
                    text3 = rs2.getString("lastname");
                    text4 = rs2.getString("emailaddress");
                    text5 = rs2.getString("phonenumber");

                    String idString = String.valueOf(identificator);

                    totalText = "Sequence ID in DB:  " + idString + " \n " + text1 + "   \n " + text2
                            + "  \n " + text3 + " \n" + " " + text4 + "  \n " + text5 + " \n ";
                    System.out.println("totalText = " + totalText);

                }
                textArea.append(totalText);

            }
            // }

			/*
			 * if (rs.next()) { // read the data out of the result set.
			 * identificator = rs.getInt("id"); text1 =
			 * rs.getString("firstname"); text2 = rs.getString("middlename");
			 * text3 = rs.getString("lastname"); text4 =
			 * rs.getString("emailaddress"); text5 =
			 * rs.getString("phonenumber");
			 *
			 * } else { // handle the case that no matching data was found.
			 *
			 * System.out.println("No data was extracted from table"); }
			 */

            // }

            // while (rs.next()) {
            // System.out.println(rs.getRow() + ". " + rs.getString("TITLE")
            // + "\t" + rs.getString("AUTHOR"));
            // }
        }

        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
