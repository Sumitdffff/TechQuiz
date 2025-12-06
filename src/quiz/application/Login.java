package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton back, rules;
    JTextField tfname;


    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 480);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
        heading.setBounds(800, 60, 300, 45);
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter The Name ");
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        name.setBounds(840, 150, 300, 20);
        add(name);

        tfname = new JTextField();
        tfname.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        tfname.setBounds(755, 200, 300, 25);
        add(tfname);

        tfname.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                // If character is NOT letter and NOT space → ignore it
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume(); // stop character from appearing
                }
            }
        });

        rules = new JButton("Rules");
        rules.setForeground(Color.WHITE);
        rules.setBackground(new Color(30, 144, 254));
        rules.setBounds(755, 270, 120, 25);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setForeground(Color.WHITE);
        back.setBackground(new Color(30, 144, 254));
        back.setBounds(935, 270, 120, 25);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(60, 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        if (ae.getSource() ==  back) {
            setVisible(false);
        }
    }

    public static void main(String[] arg) {
        new Login();
    }
}
