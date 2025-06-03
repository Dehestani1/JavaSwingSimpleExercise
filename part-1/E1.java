import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E1 extends JFrame implements ActionListener {
    private JLabel counterLabel;
    private JButton clickButton;
    private int count = 0;
    public E1() {
        setTitle("Click Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);
        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        counterLabel.setText("Clicks: " + count);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E1().setVisible(true));
    }
}