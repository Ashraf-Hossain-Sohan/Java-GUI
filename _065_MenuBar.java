import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

class myFrame extends JFrame implements ActionListener{

    myFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar menu = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save"); 
        JMenuItem exitItem = new JMenuItem("Exit");
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menu.add(helpMenu);
        menu.add(fileMenu);
        menu.add(editMenu);

        this.setMenuBar(menu);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}

public class _065_MenuBar{
    public static void main(String[] args) {
        
        new myFrame();
    }
}
