import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("new window");

    LaunchPage() {

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();

        }
    }
}

class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("hello ");

    NewWindow() {

        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 35));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

public class _057_GUI_Window {
    public static void main(String[] args) {

        LaunchPage launchPage = new LaunchPage();
    }
}