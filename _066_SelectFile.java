import java.awt.*;
import java.awt.event.*;

import java.io.File;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{

    JButton button;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));

            /* int respose = fileChooser.showOpenDialog(null); */
            //select file to open
            int respose = fileChooser.showSaveDialog(null);

            if (respose == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}

public class _066_SelectFile {
    public static void main(String[] args) {
        
        new thisFrame();
    }
}
