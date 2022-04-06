import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class MyListener implements java.awt.event.ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, null); // will be done when the button is clicked
    }
}
