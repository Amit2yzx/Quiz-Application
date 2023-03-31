import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;
    JLabel name;
    login(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600,500);
        add(image);

        JLabel heading = new JLabel("Simple minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        add(heading);

          name = new JLabel("Enter your name");
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,22));
        name.setBounds(810,150,300,20);
        add(name);

         tfname = new JTextField();
        tfname.setBounds(735,200, 300, 25);
        add(tfname);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));

         rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color (30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

         back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color (30,144,254));
        back.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(back);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== rules){
            String name =  tfname.getText();
            setVisible(false);
            new Rules( name);

        }

         else if (ae.getSource() == back){
                   setVisible(false);


        }    }


    public static void main (String[] args)
    {
        new login();

    }


}
