
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class quiz extends JFrame implements ActionListener {
   String questions [][] = new String[10][5];
   String answers[][]= new String[10][2];
   JLabel qno,question;
   String useranswer[][] = new String[10][1];
    ButtonGroup groupoptions;
   JRadioButton OPT1, OPT2, OPT3, OPT4;
   JButton next, submit, lifeline;
   public static int timer = 15;
   public static int count = 0;
   public static int score = 0;

   public static  int ans_given = 0;
   String name;
   quiz(String name){
       this.name = name;
       setBounds(50, 0, 1440, 850);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       setVisible(true);

       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
       JLabel image = new JLabel(i1);
       image.setBounds(0, 0, 1440,392);
       add(image);

        qno = new JLabel( );
       qno.setBounds(100, 450, 50, 30);
       qno.setFont( new Font("Tahoma", Font.PLAIN, 24));
       add(qno);

        question = new JLabel( );
       question.setBounds(150, 450, 900, 30);
       question.setFont( new Font("Tahoma", Font.PLAIN, 24));
       add(question);

       questions[0][0]="Who is the inventor of Artificial Intelligence?";
       questions[0][1]="Geoffrey Hinton";
       questions[0][2]="Andrew Ng";
       questions[0][3]="John McCarthy";
       questions[0][4]="Jürgen Schmidhuber";

       questions[1][0]="What is the full form of “AI”? ";
       questions[1][1]="Artificially Intelligence";
       questions[1][2]="Artificial Intelligent";
       questions[1][3]="Artificially Intelligence";
       questions[1][4]="Advanced Intelligence";

       questions[2][0]="Which of the following is the branch of Artificial Intelligence?";
       questions[2][1]="Machine Learning";
       questions[2][2]="Cyber forensics";
       questions[2][3]="Full-Stack Developer";
       questions[2][4]="Network Design";

       questions[3][0]="Which of the following is a component of Artificial Intelligence?";
       questions[3][1]="Learning";
       questions[3][2]="Training";
       questions[3][3]="Designing";
       questions[3][4]="Puzzling";

       questions[4][0]="Which of the following is not the commonly used programming language for Artificial Intelligence?";
       questions[4][1]="Perl";
       questions[4][2]="Java";
       questions[4][3]="PROLOG";
       questions[4][4]="LISP";

       questions[5][0]="Which of the following is not an application of artificial intelligence?";
       questions[5][1]="Face recognition system";
       questions[5][2]="Chatbots";
       questions[5][3]="LIDAR";
       questions[5][4]="DBMS";

       questions[6][0]="_________ number of informed search method are there in Artificial Intelligence.";
       questions[6][1]="4";
       questions[6][2]="3";
       questions[6][3]="2";
       questions[6][4]="1";

       questions[7][0]="Which of the following is an example of artificial intelligent agent/agents?";
       questions[7][1]="Autonomous Spacecraft";
       questions[7][2]="Human";
       questions[7][3]="Robot";
       questions[7][4]="All of the mentioned";

       questions[8][0]="Which of the following are the 5 big ideas of AI?";
       questions[8][1]="Perception";
       questions[8][2]="Human-AI Interaction";
       questions[8][3]="Societal Impact";
       questions[8][4]="All of the above";

       questions[9][0]="What is the total number of quantification available in artificial intelligence?";
       questions[9][1]="4";
       questions[9][2]="3";
       questions[9][3]="1";
       questions[9][4]="2";

       answers[0][1] = "John McCarthy";
       answers[1][1] = "Artificially Intelligent";
       answers[2][1] = "Machine Learning";
       answers[3][1] = "Learning";
       answers[4][1] = "perl";
       answers[5][1] = "DBMS";
       answers[6][1] = "4";
       answers[7][1] = "All of the mentioned";
       answers[8][1] = "All of the above";
       answers[9][1] = "2";

        OPT1 = new JRadioButton( );
       OPT1.setBounds(178, 520, 700, 30);
       OPT1.setBackground(Color.WHITE);
       OPT1.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(OPT1);



        OPT2 = new JRadioButton( );
       OPT2.setBounds(178, 600, 700, 30);
       OPT2.setBackground(Color.WHITE);
       OPT2.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(OPT2);

        OPT3 = new JRadioButton( );
       OPT3.setBounds(178, 640, 700, 30);
       OPT3.setBackground(Color.WHITE);
       OPT3.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(OPT3);

       OPT4 = new JRadioButton( );
       OPT4.setBounds(178, 560, 700, 30);
       OPT4.setBackground(Color.WHITE);
       OPT4.setFont(new Font("Dialog", Font.PLAIN, 20));
       add(OPT4);


       groupoptions = new ButtonGroup();
       groupoptions.add(OPT1);
       groupoptions.add(OPT2);
       groupoptions.add(OPT3);
       groupoptions.add(OPT4);






     next = new JButton("Next");
    next.setBounds(1100,550,200,40);
    next.setFont(new Font ("Tahoma", Font.PLAIN, 22));
    next.setBackground(new Color(30, 144, 255));
    next.setForeground(Color.WHITE);
    next.addActionListener(this);
    add(next);

        lifeline = new JButton("50 50 lifeline");
       lifeline.setBounds(1100,630,200,40);
       lifeline.setFont(new Font ("Tahoma", Font.PLAIN, 22));
       lifeline.setBackground(new Color(30, 144, 255));
       lifeline.setForeground(Color.WHITE);
       lifeline.addActionListener(this);
       add(lifeline);

        submit = new JButton("Submit");
       submit.setBounds(1100,710,200,40);
       submit.setFont(new Font ("Tahoma", Font.PLAIN, 22));
       submit.setBackground(new Color(30, 144, 255));
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       submit.setEnabled(false);
       add(submit);

       start(count);

   }

   public void actionPerformed(ActionEvent ae){

       if(ae.getSource() == next){
           repaint();
           OPT1.setEnabled(true);
           OPT2.setEnabled(true);
           OPT3.setEnabled(true);
           OPT4.setEnabled(true);
           ans_given = 1;
           if (groupoptions.getSelection() == null){
               useranswer[count][0] = "";
           }else {
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
           }
           if(count == 8){
               next.setEnabled(false);
               submit.setEnabled(true);

           }           count++;
           start(count);

       } else if (ae.getSource() == lifeline){
           if(count == 0 || count == 6 || count == 7 )
           {
               OPT1.setEnabled(false);
               OPT2.setEnabled(false);

           }  else {
               OPT3.setEnabled(false);
               OPT1.setEnabled(false);

           } lifeline.setEnabled(false);
       } else if (ae.getSource() == submit) {
           ans_given = 1;
           if (groupoptions.getSelection() == null){
               useranswer[count][0] = "";
           }else {
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
           }
           for (int i = 0; i < useranswer.length; i++){
               if (useranswer[i][0].equals(answers[i][1])) {
                   score += 10;
               }}

           setVisible(false);
           new Score(name, score);

       }

   }
     public void paint(Graphics g)
   {
       super.paint(g);
       String time = "time left  " + timer + " seconds left";
       g.setColor(Color.red);
       g.setFont(new Font("Tahoma",Font.BOLD, 25));

           if (timer > 0) {
               g.drawString(time, 1100, 500);
           }else {
               g.drawString("Times up",1100, 500 );
           }
           timer--;

           try {
               Thread.sleep(1000);
                 repaint();
           }catch (Exception e){
               e.printStackTrace();

           }
           if(ans_given== 1) {
           ans_given = 0;
           timer = 15;}
        else if (timer<0){
           timer = 15;
           OPT1.setEnabled(true);
           OPT2.setEnabled(true);
           OPT3.setEnabled(true);
           OPT4.setEnabled(true);

               if(count == 8) {
                   next.setEnabled(false);
                   submit.setEnabled(true);
               }
               if (count == 9) {
                   if (groupoptions.getSelection() == null){
                       useranswer[count][0] = "";
                   }else {
                       useranswer[count][0] = groupoptions.getSelection().getActionCommand();
                   }
                   for (int i = 0; i < useranswer.length; i++){
                       if (useranswer[i][0].equals(answers[i][1])) {
                            score += 10;
                       }}

                   setVisible(false);
                   new Score(name, score);

               }      else{     if (groupoptions.getSelection() == null){
               useranswer[count][0] = "";
           }else {
               useranswer[count][0] = groupoptions.getSelection().getActionCommand();
           }
           count ++;
           start(count);

   }       }   }  public void start(int count){

          qno.setText("" + (count +1)+ ". ");
          question.setText(questions[count] [0]);

        OPT1.setText(questions[count][1]);
        OPT1.setActionCommand(questions[count][1]);
        OPT2.setText(questions[count][2]);
        OPT2.setActionCommand(questions[count][2]);

         OPT3.setText(questions[count][3]);
        OPT3.setActionCommand(questions[count][3]);
         OPT4.setText(questions[count][4]);
        OPT4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
     }
    public static void main (String [] args)
    {
        new quiz("user");
    }
}
