import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Combo implements ActionListener {

    JComboBox comboBox;
    JTextField textField4;
    public String fromCombobox1;

    String items;



    public void getComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public void actionPerformed(ActionEvent e) {

        JComboBox comboBox = (JComboBox)e.getSource();
        items = (String)comboBox.getSelectedItem();

        fromCombobox1 = items;
        String s2 = String.valueOf(items);
        textField4.setText(s2);

        System.out.println("Items " + items);

    }
}