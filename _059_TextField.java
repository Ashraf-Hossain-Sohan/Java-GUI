/* JTextField = A GUI textbox component that can be used to add , set or get text  */

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JTextField text;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        text = new JTextField();
        text.setPreferredSize(new Dimension(250,40));
        text.setFont(new Font("Consolar",Font.PLAIN,20));
        text.setForeground(new Color(0x00FF00));
        text.setBackground(Color.black);
        text.setCaretColor(Color.white);
        text.setText("User Name");
        // text.setEditable(false);

        this.add(button);
        this.add(text);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == button) {
            System.out.println("welcome " + text.getText());
            button.setEnabled(false);
            text.setEditable(false);
       }
    }
}

public class test{
    public static void main(String[] args) {
        
        thisFrame frame = new thisFrame();
    }
}