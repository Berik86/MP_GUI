package bit.berik214;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    protected JButton first;
    protected JButton second;
    protected JButton exit;

    public MainMenu(){
        setSize(500,500);
        setLayout(null);

        first = new JButton("ADD STUDENT");
        first.setSize(300,30);
        first.setLocation(100,100);
        add(first);
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showFirst();
            }
        });

        second = new JButton("LIST STUDENTS");
        second.setSize(300,30);
        second.setLocation(100,160);
        add(second);
        second.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showSecond();
            }
        });

        exit = new JButton("EXIT");
        exit.setSize(300,30);
        exit.setLocation(100,220);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showThird();
            }
        });
    }

}
