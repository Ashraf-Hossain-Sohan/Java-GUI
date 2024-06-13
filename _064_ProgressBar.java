import java.awt.*;

import javax.swing.*;

class barDemo{

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    barDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,350,100);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);
        //not showing color

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(bar);

        fill();
    }
    public void fill(){
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("done");
    }
}
public class _064_ProgressBar{
    public static void main(String[] args) {
        
        barDemo demo = new barDemo();
    }
}