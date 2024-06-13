/* JOptionPane   =   pop up a standard dailog box that prompts users for a value or informs them of something */

import javax.swing.JOptionPane;

public class _058_JOptionPane {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "plain msg", "Box", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "inform msg", "Box", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "question msg", "Box", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "warning msg", "Box", JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "error msg", "Box", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "do you code?", "question", JOptionPane.YES_NO_CANCEL_OPTION);

        //look up video again

        String name = JOptionPane.showInputDialog("what is your name ?");
        System.out.println("hello " + name);

        JOptionPane.showOptionDialog(null, "hello there", "messenger", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
    }
}