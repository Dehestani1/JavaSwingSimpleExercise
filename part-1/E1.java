import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E1 extends JFrame implements ActionListener {
    private JLabel counterLable;
    private JButton clickButton;
    private int counter;
    public E1() {
        setTitle("Click Counter");
        counterLable = new JLabel("Clicks = 0", SwingConstants.CENTER);
        setSize(500, 500);
        clickButton = new JButton("Click");
        clickButton.addActionListener(this);
        setLayout(new BorderLayout());
        add(counterLable, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);

    }
    public void actionPerformed(ActionEvent e) {
        counter++;
        counterLable.setText("Clicks = " + counter);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new E1().setVisible(true));
    }
}