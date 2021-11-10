package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton b1,b2;
    String usname;
    Rules( String user_name){
        this.usname=user_name;
        setBounds(600,200,800,650);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome "+user_name+" to my project ");
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        l1.setBounds(50,20,750,40);
        l1.setForeground(new Color(30,144,254));
        add(l1);

        JLabel l2 = new JLabel("");
        l2.setBounds(20,60,600,30);
        l2.setText("Code For Interview");//add html text here
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(new Color(30,144,255));
        b1.setForeground((Color.white));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(500,500,100,30);
        b2.setBackground(new Color(30,144,255));
        b2.setForeground((Color.white));
        b2.addActionListener(this);
        add(b2);


        setVisible(true);
    }
    public static void main(String[] args) {
        new Rules("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            this.setVisible(false);
            new project1().setVisible(true);
        }
        else if(e.getSource()==b2){
            this.setVisible(false);
new quiz(usname).setVisible(true);
        }
    }
}
