import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {


    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel pswdlabel;
    private static JPasswordField pswdText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userlabel = new JLabel("User: ");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        pswdlabel = new JLabel("Password: ");
        pswdlabel.setBounds(10, 50, 80, 25);
        panel.add(pswdlabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        pswdText = new JPasswordField();
        pswdText.setBounds(100, 50, 165, 25);
        panel.add(pswdText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new LoginGUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);











        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = pswdText.getText();


        if(user.equals("Rob") && password.equals("Marines")){
            success.setText("Login Successful");
        } else{
            success.setText("Wrong Password or User Name - Try Again!");
        }
    }
}
