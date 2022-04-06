import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MyFrame extends JFrame {
 

	public MyFrame() throws Exception {

        setBounds(100, 200, 220, 280);
        setResizable(false);

        // container control:
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setContentPane(panel);

        // First Side
        JLabel firstSide = new JLabel();
        firstSide.setText("Side 1: ");
        firstSide.setBounds(50, 12, 150, 14);
        panel.add(firstSide); // add it to the panel

        JTextField firstSideName = new JTextField();
        firstSideName.setBounds(50, 26, 100, 18);
        panel.add(firstSideName);


        // Second Side
        JLabel secondSide = new JLabel();
        secondSide.setText("Side 2: ");
        secondSide.setBounds(50, 40, 150, 22);
        panel.add(secondSide);

        JTextField secondSideName = new JTextField();
        secondSideName.setBounds(50, 60, 100, 18);
        panel.add(secondSideName);


        // Third Side
        JLabel thirdSide = new JLabel();
        thirdSide.setText("Side 3: ");
        thirdSide.setBounds(50, 80, 150, 22);
        panel.add(thirdSide);

        JTextField thirdSideName = new JTextField();
        thirdSideName.setBounds(50, 104, 100, 18);
        panel.add(thirdSideName);


        // Showing the Answer
        JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", NORMAL, 14));
		textArea.setEditable(false);
		textArea.setBounds(10, 180, 190, 55);
		panel.add(textArea);
		textArea.setText("Answer");
		
		 // Creating a button
        JButton btn = new JButton();
        btn.setText("Check");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String s1= firstSideName.getText();
			String s2= secondSideName.getText();
			String s3= thirdSideName.getText();
			 // Get the result of Triangle
	        Triangle tr = new Triangle();
			String type = tr.computeType(s1, s2, s3);
			
			// Show answer
			textArea.setText(type);	
			}
		});
		 btn.setBounds(50, 150, 100, 18);
		 panel.add(btn);
	
		
    }
}