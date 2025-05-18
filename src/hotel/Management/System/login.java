package hotel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField Password1;
    JButton b1, b2;

    login() {

        JLabel lable1 = new JLabel("USERNAME");
        lable1.setBounds(40, 20, 100, 30);
        lable1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lable1.setForeground(Color.white);
        add(lable1);

        JLabel lable2 = new JLabel("PASSWORD");
        lable2.setBounds(40, 70, 100, 30);
        lable2.setFont(new Font("Tahoma", Font.BOLD, 16));
        lable2.setForeground(Color.white);
        add(lable2);

        textField1 = new JTextField();
        textField1.setBounds(150, 20, 150, 30);
        textField1.setForeground(Color.white);
        textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField1.setBackground(new Color(26, 110, 103));
        add(textField1);

        Password1 = new JPasswordField();
        Password1.setBounds(150, 70, 150, 30);
        Password1.setForeground(Color.white);
        Password1.setBackground(new Color(26, 110, 103));
        add(Password1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/download.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(290, 390, Image.SCALE_DEFAULT);
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(315, -30, 255, 300);
        add(imageLabel);

        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(1, 45, 46));
        setLayout(null);
        setLocation(400, 270);
        setSize(600, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                Con c = new Con();
                String user = textField1.getText();
                String pass = Password1.getText();

                String q = "select * from login where username = '" + user + "' and password = '" + pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    new Dashboard();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");

                }


            } catch (Exception x) {
                x.printStackTrace();
            }
        } else {
            System.exit(4);
        }

    }

    public static void main(String[] args) {
        new login();
    }
}
