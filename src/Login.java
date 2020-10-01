import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel, register;
    
    Login() {
       
      // Username Label
       user_label = new JLabel();
       user_label.setText("Usermame : sementara admin");
       userName_text = new JTextField();
       
       // Password Label
       password_label = new JLabel();
       password_label.setText("Password : sementara admin");
       password_text = new JPasswordField();
       
       // Submit
       submit = new JButton("LOGIN");
       register = new JButton("REGISTER");
       panel = new JPanel(new GridLayout(4, 1));
       panel.add(user_label);
       panel.add(userName_text);
       panel.add(password_label);
       panel.add(password_text);
       message = new JLabel();
       panel.add(register);

       panel.add(submit);  
       panel.add(message);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
     
       
       // Adding listeners
       submit.addActionListener(this);
       add(panel, BorderLayout.CENTER);
       setTitle("Project Lumen");
       setSize(450,350);
       setLocation(600, 250);
       setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       String userName = userName_text.getText();
       String password = password_text.getText();
       //obsolete when database is ready
       if (userName.trim().equals("admin") && password.trim().equals("admin")) { 
          message.setText(" Hello " + userName + "");
          new UI();
       } else {
          message.setText(" Invalid credentials! Please double-check your Username and Password.");
       }
    }
 }