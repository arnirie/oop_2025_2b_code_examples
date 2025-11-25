import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleCalc {
    private JTextField txtInput1;
    private JTextField txtInput2;
    private JTextField txtAnswer;
    private JButton btnCompute;
    private JPanel panelMain;

    public SimpleCalc() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("action taken");
            }
        });
        btnCompute.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //get values from 1st and 2nd tf
                double num1 = Double.parseDouble(txtInput1.getText());
                double num2 = Double.parseDouble(txtInput2.getText());
                double answer = num1 + num2;
                txtAnswer.setText(Double.toString(answer));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                JOptionPane.showMessageDialog(null, "exited");
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Simple Calc");
        mainFrame.setContentPane(new SimpleCalc().panelMain);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
