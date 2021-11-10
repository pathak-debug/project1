package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JButton b1;
    Score(String u,int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project1\\icon\\score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(10,20,300,250);
        add(l1);

        JLabel l2 = new JLabel("Thank you !! "+ u);
        l2.setBounds(400,30,200,35);
        l2.setFont(new Font("Raleway",Font.PLAIN,28));
        add(l2);

        JLabel l3 = new JLabel("Your score is " +score);
        l3.setBounds(400,100,200,35);
        l3.setFont(new Font("Raleway",Font.PLAIN,28));
        l3.setForeground(new Color(0,100,60));
        add(l3);

        b1 = new JButton("Play again");
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.black);
        b1.setBounds(475,150,123,30);
        b1.addActionListener(this);
        add(b1);
    }

    public static void main(String[] args) {
        new Score("",0).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            this.setVisible(false);
            new project1().setVisible(true);



    }
}
