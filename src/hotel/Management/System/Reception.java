package hotel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    public Reception() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1238, 820);
        panel.setBackground(new Color(1, 45, 46));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBackground(new Color(1, 45, 46));
        add(panel1);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/download.png"));
        Image i = imageIcon1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i);
        JLabel label = new JLabel(imageIcon2);
        label.setBounds(300, 150, 400, 400);
        panel.add(label);

//        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/download.png"));
//        Image i2 = imageIcon3.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
//        ImageIcon imageIcon4 = new ImageIcon(i2);
//        JLabel label2 = new JLabel(imageIcon4);
//        label2.setBounds(5, 448, 250, 250);
//        panel1.add(label2);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30, 30, 200, 30);
        btnNCF.setBackground(Color.black);
        btnNCF.setForeground(Color.white);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewCustomer();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("customer room");
        btnRoom.setBounds(30, 70, 200, 30);
        btnRoom.setBackground(Color.black);
        btnRoom.setForeground(Color.white);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
new Room();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton btnDepartment = new JButton("Department ");
        btnDepartment.setBounds(30, 110, 200, 30);
        btnDepartment.setBackground(Color.black);
        btnDepartment.setForeground(Color.white);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                        new Department();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30, 150, 200, 30);
        btnAEI.setBackground(Color.black);
        btnAEI.setForeground(Color.white);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
new Employee();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
        JButton btnCustomerInfo = new JButton("Customer Info");
        btnCustomerInfo.setBounds(30, 190, 200, 30);
        btnCustomerInfo.setBackground(Color.black);
        btnCustomerInfo.setForeground(Color.white);
        panel1.add(btnCustomerInfo);
        btnCustomerInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerInfo();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton btnManagerinfo = new JButton("Manager Info");
        btnManagerinfo.setBounds(30, 230, 200, 30);
        btnManagerinfo.setBackground(Color.black);
        btnManagerinfo.setForeground(Color.white);
        panel1.add(btnManagerinfo);
        btnManagerinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
new ManagerInfo();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton btnCheckout = new JButton("checkout");
        btnCheckout.setBounds(30, 270, 200, 30);
        btnCheckout.setBackground(Color.black);
        btnCheckout.setForeground(Color.white);
        panel1.add(btnCheckout);
        btnCheckout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
new CheckOut();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton btncheckinDI = new JButton(" update check-in Details");
        btncheckinDI.setBounds(30, 310, 200, 30);
        btncheckinDI.setBackground(Color.black);
        btncheckinDI.setForeground(Color.white);
        panel1.add(btncheckinDI);
        btncheckinDI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton btnUpdateroomstatus = new JButton("Update Room Status");
        btnUpdateroomstatus.setBounds(30, 350, 200, 30);
        btnUpdateroomstatus.setBackground(Color.black);
        btnUpdateroomstatus.setForeground(Color.white);
        panel1.add(btnUpdateroomstatus);
        btnUpdateroomstatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateRoom();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Pick up service");
        btnPUS.setBounds(30, 390, 200, 30);
        btnPUS.setBackground(Color.black);
        btnPUS.setForeground(Color.white);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PickUp();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30, 430, 200, 30);
        btnSR.setBackground(Color.black);
        btnSR.setForeground(Color.white);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                     new SearchRoom();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }


        });

        JButton logout = new JButton("LOGOUT");
        logout.setBounds(30, 510, 200, 30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.WHITE);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    System.exit(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }


            }
        });

        JButton back = new JButton("BACK");
        back.setBounds(30, 470, 200, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    new Dashboard();
                    setVisible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }


            }
        });


        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Reception();
    }

}

