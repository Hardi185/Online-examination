
package exam_project;

import java.awt.Color;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField t1;
    Quiz()
    {
        setBounds(500,200,1000,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("exam_project/icons/h.png"));
        JLabel s1 = new JLabel(il);
        
        s1.setBounds(0,0,600,500);
        add(s1);
        
        JLabel s2 = new JLabel("Java Quiz");
        s2.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
        s2.setForeground(Color.magenta);
        s2.setBounds(650, 40, 300, 35);
        add(s2);
        
        JLabel s3 = new JLabel("welcome to Quiz!!!");
        s3.setFont(new Font("Raleway",Font.BOLD, 25));
        s3.setForeground(Color.GREEN);
        s3.setBounds(650, 130, 300, 20);
        add(s3);
        
        JLabel s4 = new JLabel("you have to login first");
        s4.setFont(new Font("Raleway",Font.BOLD, 25));
        s4.setForeground(Color.GREEN);
        s4.setBounds(650,160, 300, 80);
        add(s4);
        
        b1 = new JButton("Login");
        b1.setForeground(Color.blue);
        b1.setBackground(Color.orange);
        b1.setBounds(630, 300, 120, 25);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exits");
        b2.setForeground(Color.blue);
        b2.setBackground(Color.orange);
        b2.setBounds(810, 300, 120, 25);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new Quiz();
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == b1)
        {
           
            this.setVisible(false);
            
            EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Userlogin frame = new Userlogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    
        }
        else
        {
            System.exit(0);
        }
    }
    
}
