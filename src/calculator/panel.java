
package calculator;

import com.sun.org.apache.regexp.internal.REDebugCompiler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class panel extends  JPanel implements ActionListener {
    JTextField t;
    JButton b1 ,b2,b3,b4,b5,b6,b7,b8,b9,b10,
            b11,b12,b13,b14,b15,b16,b17,b18,
            b19,b20,b21,b22,b23,b24,b25,b26,
            b27,b28,b29,b30,b31;

    Font f = new Font("Arial",Font.BOLD,20);
    Font f1 = new Font("Arial",Font.BOLD,15);


    panel (){

        this.setLayout(null);
         t = new JTextField();
        t.setBounds(0,0,350,100);
        this.setBackground(Color.BLACK);
        this.add(t);
        t.setBackground(Color.BLACK);
        t.setFont(f);
        t.setForeground(Color.red);


        b1 = new JButton("C");
        b1.setBounds(20,120,70,30);
        this.add(b1);
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.red);
        b1.setFont(f);

//
          b2 = new JButton("log");
        b2.setBounds(100,120,70,30);
        this.add(b2);
        b2.addActionListener(this);
        b2.setFont(f);
        b2.setBackground(Color.black);
        b2.setForeground(Color.red);

//
          b3 = new JButton("ln()");
        b3.setBounds(180,120,70,30);
        this.add(b3);
        b3.setFont(f);
        b3.setBackground(Color.black);
        b3.setForeground(Color.red);

//
          b4 = new JButton("sin()");
        b4.setBounds(260,120,70,30);
        this.add(b4);
        b4.setFont(f1);
        b4.setBackground(Color.black);
        b4.setForeground(Color.red);

//
          b5 = new JButton("cos()");
        b5.setBounds(20,160,70,30);
        this.add(b5);
        b5.setFont(f1);
        b5.setForeground(Color.red);

//
        b5.setBackground(Color.black);
          b6 = new JButton("tan()");
        b6.setBounds(100,160,70,30);
        this.add(b6);
        b6.setForeground(Color.red);
        b6.setFont(f1);
        b6.setBackground(Color.black);


//
          b7 = new JButton("cot()");
        b7.setBounds(180,160,70,30);
        this.add(b7);
        b7.setForeground(Color.red);
        b7.setFont(f1);
        b7.setBackground(Color.black);

//
          b8 = new JButton("sec()");
        b8.setBounds(260,160,70,30);
        this.add(b8);
        b8.setForeground(Color.red);
        b8.setFont(f1);
        b8.setBackground(Color.black);


//
         b9 = new JButton("%");
        b9.setBounds(20,200,70,30);
        this.add(b9);
        b9.setForeground(Color.red);
        b9.setBackground(Color.black);
        b9.setFont(f);


//
          b10 = new JButton("^");
        b10.setBounds(100,200,70,30);
        this.add(b10);
        b10.setFont(f);
        b10.setForeground(Color.red);
        b10.setBackground(Color.black);

//
          b11 = new JButton("(");
        b11.setBounds(180,200,70,30);
        this.add(b11);
        b11.setFont(f);
        b11.setForeground(Color.red);
        b11.setBackground(Color.black);

//
          b12 = new JButton(")");
        b12.setBounds(260,200,70,30);
        this.add(b12);
        b12.setFont(f);
        b12.setForeground(Color.red);
        b12.setBackground(Color.black);

//
          b13 = new JButton("*");
        b13.setBounds(20,240,70,30);b13.setForeground(Color.red);
        this.add(b13);
        b13.setFont(f);
        b13.setBackground(Color.black);

//
          b14 = new JButton("-");
        b14.setBounds(100,240,70,30);
        this.add(b14);
        b14.setFont(f);
        b14.setForeground(Color.red);
        b14.setBackground(Color.black);

//
          b15= new JButton("/");
        b15.setBounds(180,240,70,30);b15.setForeground(Color.red);
        this.add(b15);
        b15.setFont(f);
        b15.setBackground(Color.black);

//
          b16 = new JButton("+");
        b16.setBounds(260,240,70,190);
        this.add(b16);
        b16.setFont(f);
        b16.setForeground(Color.red);
        b16.addActionListener(this);
        b16.setBackground(Color.black);


//
          b17 = new JButton("7");
        b17.setBounds(20,280,70,30);
        this.add(b17);
        b17.setFont(f);
        b17.addActionListener(this);
        b17.setBackground(Color.darkGray);b17.setForeground(Color.red);

//

        b18 = new JButton("8");
        b18.setBounds(100,280,70,30);
        this.add(b18);
        b18.setFont(f);
        b18.addActionListener(this);
        b18.setBackground(Color.darkGray);
        b18.setForeground(Color.red);

//
          b19 = new JButton("9");
        b19.setBounds(180,280,70,30);
        this.add(b19);
        b19.setFont(f);
        b19.addActionListener(this);
        b19.setBackground(Color.darkGray);
        b19.setForeground(Color.red);


//
//          b20 = new JButton("");
//        b20.setBounds(260,280,70,30);
////        this.add(b20);

          b21 = new JButton("4");
        b21.setBounds(20,320,70,30);
        this.add(b21);
        b21.setFont(f);
        b21.addActionListener(this);
        b21.setForeground(Color.red);
        b21.setBackground(Color.darkGray);

//
          b22 = new JButton("5");
        b22.setBounds(100,320,70,30);
        this.add(b22);
        b22.addActionListener(this);
        b22.setBackground(Color.darkGray);
        b22.setFont(f);
        b22.setForeground(Color.red);


//
          b23 = new JButton("6");
        b23.setBounds(180,320,70,30);
        this.add(b23);
        b23.setBackground(Color.darkGray);
        b23.setFont(f);
        b23.setForeground(Color.red);
        b23.addActionListener(this);

//
//          b24 = new JButton("1");
//        b24.setBounds(260,320,70,30);
////        this.add(b24);

         b25 = new JButton("1");
        b25.setBounds(20,360,70,30);
        this.add(b25);
        b25.setFont(f);
        b25.setBackground(Color.darkGray);
        b25.addActionListener(this);
        b25.setForeground(Color.red);

//
          b26 = new JButton("2");
        b26.setBounds(100,360,70,30);
        this.add(b26);
        b26.addActionListener(this);
        b26.setBackground(Color.darkGray);
        b26.setFont(f);
        b26.setForeground(Color.red);


//
          b27 = new JButton("3");
        b27.setBounds(180,360,70,30);
        this.add(b27);
        b27.addActionListener(this);
        b27.setBackground(Color.darkGray);
        b27.setFont(f);
        b27.setForeground(Color.red);

//
//          b28 = new JButton("3");
//        b28.setBounds(260,360,70,30);
////        this.add(b28);
//
          b29 = new JButton(".");
        b29.setBounds(20,400,70,30);
        this.add(b29);
        b29.addActionListener(this);
        b29.setForeground(Color.red);
        b29.setBackground(Color.darkGray);
        b29.setFont(f);

//
          b30 = new JButton("0");
        b30.setBounds(100,400,70,30);
        this.add(b30);
        b30.addActionListener(this);
        b30.setBackground(Color.darkGray);
        b30.setFont(f);
        b30.setForeground(Color.red);


//
          b31= new JButton("=");
        b31.setBounds(180,400,70,30);
        this.add(b31);
        b31.addActionListener(this);
        b31.setBackground(Color.red);
        b31.setForeground(Color.BLACK);
        b31.setFont(f);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1,s2,s3,s4,s5,s6,s7,s8,s9,s0 , op="",x="",y="";
        int a=0,b=0,n1=0,n2=0;
        if (e.getSource()==b1){

            t.setText("");
        }
        if (e.getSource()==b17){
            s7 = "7";
            t.setText(t.getText()+s7);
        }
         if (e.getSource()==b18){
             s8 = "8";
            t.setText(t.getText()+s8);
        }
        if (e.getSource()==b19){
             s9 = "9";
            t.setText(t.getText()+s9);
        }
        if (e.getSource()==b21){
             s4 = "4";
            t.setText(t.getText()+s4);
        }
        if (e.getSource()==b22){
             s5 = "5";
            t.setText(t.getText()+s5);
        }
        if (e.getSource()==b23) {
             s6 = "6";
            t.setText(t.getText()+s6);
        }
            if (e.getSource()==b25){
                 s1 = "1";
                t.setText(t.getText()+s1);
                n1=Integer.parseInt(t.getText());
            }
            if (e.getSource()==b26){
                s2 = "2";
                t.setText(t.getText()+s2);
                n2=Integer.parseInt(t.getText());

            }
            if (e.getSource()==b27){
                 s3 = "3";
                t.setText(t.getText()+s3);
            }
        if (e.getSource()==b29){
            String s = ".";
            t.setText(t.getText()+s);
        }
        if (e.getSource()==b30){
             s0 = "0";
            t.setText(t.getText()+s0);
        }
        if (e.getSource()==b16){

           op="+";
          x= t.getText();

            t.setText("");

           y=t.getText();

        }

        if (e.getSource()==b31){
            if (op == "+") {

            n1=Integer.parseInt(x);
            n2=Integer.parseInt(y);

                int sum = n1+n2;
                String summ = String.valueOf(sum);
                t.setText(summ);
            }
        }


    }
}


