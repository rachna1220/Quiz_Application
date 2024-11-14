package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Score extends JFrame {

    Score(String name,int score){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(60,200,200,150);
        add(image);

        JLabel heading=new JLabel("ThankYou " + name+" for Playing Quiz Test");
        heading.setBounds(100,80,650,38);
        heading.setFont(new Font("Tamoha",Font.BOLD,33));
        add(heading);

        JLabel Score=new JLabel("Your Score is " + score);
        Score.setBounds(350,200,280,30);
        Score.setFont(new Font("Tamoha",Font.BOLD,32));
        add(Score);

        JButton exit=new JButton("EXIT");
        exit.setBounds(380,270,120,30);
        exit.setBackground(new Color(22,99,54));
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new login();
            }
        });

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image ii2=ii1.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(0,0,750,550);
        add(iimage);


        setSize(750,550);
        setLocation(400,150);
        setLayout(null);
        setUndecorated(true);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
