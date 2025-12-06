package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name ,int score) {
        
        setBounds(300, 100, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank You "+name+" For Playing Simple Minds");
        heading.setBounds(100, 30, 700, 30);
        heading.setFont(new Font("Raleway", Font.BOLD, 22));
        add(heading);
        
        JLabel lblscore = new JLabel("Your Score is "+score);
        lblscore.setBounds(400, 200, 400, 30);
        lblscore.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(400, 270, 200, 30);
        submit.setFont(new Font("Raleway", Font.BOLD, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] arg) {
        new Score("user",0);
    }
}
