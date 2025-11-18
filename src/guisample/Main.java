package guisample;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "hello to all");
        int age = Integer.parseInt( JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "Your age after 10 years  is " + (age + 10));
    }

}
