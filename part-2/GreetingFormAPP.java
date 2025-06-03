import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingFormAPP extends JFrame implements ActionListener{
    private JLabel messageLabel;
    private JTextField nameField;
    private JButton sendButton;
    public GreetingFormAPP() {
        setTitle("Greeting Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        nameField = new JTextField(15);
        sendButton = new JButton("Send");
        messageLabel = new JLabel("Enter your name:",SwingConstants.CENTER);
        sendButton.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(sendButton);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(messageLabel, BorderLayout.SOUTH);

    }
    @Override
    public void actionPerformed (ActionEvent e){
        String name = nameField.getText().trim();
        if(name.isEmpty()){
            messageLabel.setText("Please enter your name");
        }
        else{
            messageLabel.setText("Hello "+name+"!");
        }
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(()->new GreetingFormAPP().setVisible(true));
    }


}