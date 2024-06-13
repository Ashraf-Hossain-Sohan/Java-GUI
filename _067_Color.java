import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setText("this is a text");
        label.setFont(new Font("MV Boli",Font.PLAIN,30));

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            
            Color color = JColorChooser.showDialog(null, "pick a color", Color.black);

            //label.setForeground(color);
            label.setBackground(color);
        }
    }
}
public class _067_Color{
    public static void main(String[] args) {
        
        new thisFrame();
    }
}

