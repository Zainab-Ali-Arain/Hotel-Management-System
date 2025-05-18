package hotel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec;
    Dashboard(){
        super("hotel Management System");
rec = new JButton("reception");
rec.setBounds(425,510,140,30);
rec.setFont(new Font("Tahoma",Font.BOLD,15));
rec.setBackground(new Color(48, 3, 30));
rec.setForeground(Color.WHITE);
rec.addActionListener(this);
add(rec);

add = new JButton("admin");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(48, 3, 30));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon imageIconb = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = imageIconb.getImage().getScaledInstance(200,195 , Image.SCALE_DEFAULT);

        ImageIcon  imageIcon11= new ImageIcon(i2);
        JLabel jlabel1 = new JLabel(imageIcon11);
        jlabel1.setBounds(850,300,200,195);
        add(jlabel1);

        ImageIcon imageIconbb= new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = imageIconbb.getImage().getScaledInstance(200,195 , Image.SCALE_DEFAULT);

        ImageIcon  imageIcon111= new ImageIcon(i22);
        JLabel jlabel11 = new JLabel(imageIcon111);
        jlabel11.setBounds(400,300,200,195);
        add(jlabel11);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
Image i1 = imageIcon.getImage().getScaledInstance(1950,1090 , Image.SCALE_DEFAULT);

ImageIcon  imageIcon1= new ImageIcon(i1);
JLabel jlabel = new JLabel(imageIcon1);
jlabel.setBounds(0,0,1950,1090);
add(jlabel);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==rec){
              new Reception();
              setVisible(false);
            }
            else{
                new Login2();
                setVisible(false);


            }
    }

    public static void main(String[] args) {
        new Dashboard();
    }


}
