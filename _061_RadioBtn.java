import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class MyFrame extends JFrame implements ActionListener{

    JRadioButton pizza;
    JRadioButton burger;
    JRadioButton hotdog;
    ImageIcon pizzaIcon;
    ImageIcon burgerIcon;
    ImageIcon hotdogIcon;

    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza = new JRadioButton("Pizza");
        burger = new JRadioButton("Burger");
        hotdog = new JRadioButton("HotDog");

        pizzaIcon = new ImageIcon("");
        burgerIcon = new ImageIcon("");
        hotdogIcon = new ImageIcon("");
        //image not add here

        ButtonGroup group = new ButtonGroup();
        group.add(burger);
        group.add(pizza);
        group.add(hotdog);

        pizza.addActionListener(this);
        burger.addActionListener(this);
        hotdog.addActionListener(this);
        // we can also use icons here not included

        pizza.setIcon(pizzaIcon);
        burger.setIcon(burgerIcon);
        hotdog.setIcon(hotdogIcon);

        this.add(pizza);
        this.add(hotdog);
        this.add(burger);
        this.pack();
        this.setVisible(true);
    }
    @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == pizza) {
                System.out.println("you get pizza");
            }
            else if (e.getSource() == burger) {
                System.out.println("you get burger");
            }
            else if (e.getSource() == hotdog) {
                System.out.println("you get hotdog");
            }
        }
}
public class _061_RadioBtn {
    public static void main(String[] args) {
        
        new thisFrame();
    }
}