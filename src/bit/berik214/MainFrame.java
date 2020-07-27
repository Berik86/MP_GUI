package bit.berik214;

import javax.swing.*;

public class MainFrame extends JFrame {
    protected MainMenu menu;
    protected FirstPage first;
    protected SecondPage second;
    protected ThirdPage third;

    public MainFrame(){
        setSize(500,500);
        setTitle("STUDENT APPLICATION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menu = new MainMenu();
        menu.setVisible(true);
        add(menu);

        first = new FirstPage();
        first.setVisible(false);
        add(first);

        second = new SecondPage();
        second.setVisible(false);
        add(second);

        third = new ThirdPage();
        third.setVisible(false);
        add(third);

    }
    public void showFirst(){
        menu.setVisible(false);
        second.setVisible(false);
        first.setVisible(true);
    }
    public void showMenu(){
        first.setVisible(false);
        second.setVisible(false);
        menu.setVisible(true);
    }
    public void showSecond(){
        menu.setVisible(false);
        first.setVisible(false);
        second.setVisible(true);
    }

    public void showThird(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
