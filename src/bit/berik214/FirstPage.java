package bit.berik214;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends Container {

    public FirstPage(){
        setSize(500,500);
        setLayout(null);

        JLabel lbl1 = new JLabel("NAME:");
        lbl1.setSize(70, 30);
        lbl1.setLocation(50, 100);
        add(lbl1);

        JLabel lbl2 = new JLabel("SURNAME:");
        lbl2.setSize(70, 30);
        lbl2.setLocation(50, 160);
        add(lbl2);

        JLabel lbl3 = new JLabel("AGE:");
        lbl3.setSize(70, 30);
        lbl3.setLocation(50, 220);
        add(lbl3);

        JTextField textField1 = new JTextField();
        textField1.setSize(300, 30);
        textField1.setLocation(140, 100 );
        add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setSize(300, 30);
        textField2.setLocation(140, 160 );
        add(textField2);

        JTextField textField3 = new JTextField();
        textField3.setSize(300, 30);
        textField3.setLocation(140, 220 );
        add(textField3);

        JButton btn1 = new JButton("ADD");
        btn1.setSize(185, 30);
        btn1.setLocation(50, 300);
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btn2 = new JButton("BACK");
        btn2.setSize(185, 30);
        btn2.setLocation(255, 300);
        add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showMenu();
            }
        });
    }
}
