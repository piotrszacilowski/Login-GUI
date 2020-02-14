import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userTest = new JTextField();
        userTest.setBounds(100,20,165,25);
        panel.add(userTest);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        JLabel success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        success.setText();

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
