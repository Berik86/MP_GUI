package bit.berik214;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends Container {
    public SecondPage(){
        setSize(500,500);
        setLayout(null);

        JLabel lbl_1 = new JLabel("NAME:");
        lbl_1.setSize(70, 30);
        lbl_1.setLocation(50, 50);
        add(lbl_1);

        JLabel lbl_2 = new JLabel("SURNAME:");
        lbl_2.setSize(100, 30);
        lbl_2.setLocation(180, 50);
        add(lbl_2);

        JLabel lbl_3 = new JLabel("AGE:");
        lbl_3.setSize(100, 30);
        lbl_3.setLocation(340, 50);
        add(lbl_3);

        JButton back = new JButton("BACK");
        back.setSize(350, 30);
        back.setLocation(70, 400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showMenu();
            }
        });
    }
}
