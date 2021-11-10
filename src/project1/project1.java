package project1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class project1 extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;
    project1(){
        setBounds(400,200,1200,500);//dleft,dtop,lenght,height  with respect to screen
        getContentPane().setBackground(Color.white);//this will give color to the frame
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project1\\icon\\login.jpeg"));// give address as project name\\foldername\\imagename.extension
        JLabel l1= new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);

        JLabel l2=new JLabel("Simple Minds");
        l2.setBounds(750,40,300,45);
        l2.setFont(new Font("Raleway",Font.BOLD,45));
        l2.setForeground(Color.cyan);
        add(l2);

        JLabel l3=new JLabel("Enter Your Name");
        l3.setBounds(750,150,300,20);
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setForeground(Color.cyan);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(730,200,300,25);
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        add(t1);

        b1 = new JButton("Rules");
        b1.setBounds(750,270,120,25);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);


        b2 = new JButton("Exit");
        b2.setBounds(900,270,120,25);
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);


        setVisible(true);//this will show the frame
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            String name = t1.getText();

            new Rules(name);
            this.setVisible(false);
        }
        else if(e.getSource()==b2){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new project1();

    }
}
