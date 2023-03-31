import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener {
    String name;
    JButton Start;
    JButton back;


    public Rules(String name) {
        this.name = name;
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("welcome" + "  " + name +"  " + "to Simple minds");
        heading.setBounds(50,20,700,35);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel Rules = new JLabel("welcome" + "  " + name +"  " + "to Simple minds");
        Rules.setBounds(20,90,700,350);
        Rules.setFont(new Font("Tahoma",Font.BOLD,16));
        Rules.setText(
                "<html>"+
                        "1. Scoring: Each correct answer will be awarded one point. Incorrect or unanswered questions will not be awarded any points." + "<br><br>"+
                        "2. Option Display: The four options for each question will be displayed as multiple-choice options." + "<br><br>"+
                        "3.  Time Limit: Each question will have a time limit of 15 seconds. Participants are expected to answer each question within the allotted time. " + "<br><br>"+
                        "2. Format: The quiz will consist of 10 questions, each with four options. The questions will be multiple-choice and will cover various topics that will be communicated beforehand." + "<br><br>" +
                        "<html>"
        );
        add(Rules);

          Start = new JButton("Start");
        Start.setBounds(250, 500, 100, 30);
        Start.setBackground(new Color (30,144,254));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

        back = new JButton("Back");
        back.setBounds(400, 500, 100, 30);
        back.setBackground(new Color (30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Start)
        {
            setVisible(false);
            new quiz (name);

        } else {
            setVisible(false);
            new login();

        }    }
    public static void main (String [] args)
    {
        new Rules("user");

    }}
