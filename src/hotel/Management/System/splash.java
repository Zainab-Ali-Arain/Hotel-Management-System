package hotel.managment.system;

import javax.swing.*;

public class splash extends JFrame {

    splash(){
               //to set image on frame
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/haha.jpg")); //location of the
        // image and image will save in imageicon obj
        //cant set image directly on frame so use jlable
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0 , 0 , 858 , 630 );
        add(label);//add image at frame

        setLayout(null);
        setLocation(300 , 30 );
       setSize(858 , 630 );
       setVisible(true); // to visible frame

        try{ //to close frame
            Thread.sleep(3000);  //timer for run frame
            new login();
            setVisible(false); //to stop frame after certain timer

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
new splash();


    }
}
