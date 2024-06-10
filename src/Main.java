import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;



class Main
{
    public static void main(String args[])
    {
        cal3 object = new cal3();
    }
}

class cal3 extends JFrame
{
    //GUI

    ImageIcon icon = new ImageIcon("C:/Users/Pasindu/Desktop/javapro/javagui/Calculators/calculator v.2.0/CALCULATOR/Calculator v.2.0/src/ICON/ic.png");
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    Font f1 = new Font("Xenara",Font.BOLD, 35);
    Font f2 = new Font("digital-7",Font.BOLD,30);
    Font f3 = new Font("Xenara",Font.BOLD, 20);
    Color c = new Color(65, 101, 242);
    JFrame frame = new JFrame();
    JLabel label = new JLabel("calculator v.2.0");
    JTextArea area = new JTextArea();
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonadi = new JButton("+");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton buttonsub = new JButton("-");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton buttonmul = new JButton("x");
    JButton buttonans = new JButton("=");
    JButton buttondot = new JButton(".");
    JButton buttondiv = new JButton("/");
    JButton button0 = new JButton("0");
    JButton buttondec= new JButton(".");
    JButton button00 = new JButton("00");
    JButton buttonbsp = new JButton("<");
    JButton buttonac = new JButton("AC");
    JButton buttonper = new JButton("%");

    //Variables
    String stri1 = "";
    String stri2 = "";
    String strout = "";

    double i1 = 0;
    double i2 = 0;
    double out = 0;

    String[] statement;





    cal3()//frame
    {
        frame.setTitle("Calculator");
        frame.setSize(365,630);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        //Sframe.setHorizontalAlignment(JTextArea.RIGHT);

        frame.setIconImage(icon.getImage());


        label.setBounds(13,10,100,15);//version//
        frame.add(label);


        area.setBounds(13,30,325,100);//display//
        area.setFont(f1);
        area.setBorder(border);
        frame.add(area);

        button7.setBounds(13,150,70,70);//button7
        button7.setFont(f2);
        frame.add(button7);
        button7.setBackground(Color.WHITE);
        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("7");
            }
        });
//85
        button8.setBounds(98,150,70,70);//button8
        button8.setFont(f2);
        frame.add(button8);
        button8.setBackground(Color.WHITE);
        button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("8");
            }
        });

        button9.setBounds(183,150,70,70);//button9
        button9.setFont(f2);
        frame.add(button9);
        button9.setBackground(Color.WHITE);
        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("9");
            }
        });

        buttonadi.setBounds(268,150,70,70);//button+
        buttonadi.setFont(f2);
        frame.add(buttonadi);
        buttonadi.setBackground(Color.WHITE);
        buttonadi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                area.append("+");
            }
        });

        button4.setBounds(13,235,70,70);//button4
        button4.setFont(f2);
        frame.add(button4);
        button4.setBackground(Color.WHITE);
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("4");
            }
        });

        button5.setBounds(98,235,70,70);//button5
        button5.setFont(f2);
        frame.add(button5);
        button5.setBackground(Color.WHITE);
        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("5");
            }
        });

        button6.setBounds(183,235,70,70);//button6
        button6.setFont(f2);
        frame.add(button6);
        button6.setBackground(Color.WHITE);
        button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("6");
            }
        });

        buttonsub.setBounds(268,235,70,70);//button-
        buttonsub.setFont(f2);
        frame.add(buttonsub);
        buttonsub.setBackground(Color.WHITE);
        buttonsub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("-");
            }
        });

        button1.setBounds(13,320,70,70);//button1
        button1.setFont(f2);
        frame.add(button1);
        button1.setBackground(Color.WHITE);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.setText(area.getText()+"1");
            }
        });

        button2.setBounds(98,320,70,70);//button2
        button2.setFont(f2);
        frame.add(button2);
        button2.setBackground(Color.WHITE);
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("2");
            }
        });


        button3.setBounds(183,320,70,70);//button3
        button3.setFont(f2);
        frame.add(button3);
        button3.setBackground(Color.WHITE);
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("3");
            }
        });


        buttonmul.setBounds(268,320,70,70);//button*
        buttonmul.setFont(f2);
        frame.add(buttonmul);
        buttonmul.setBackground(Color.WHITE);
        buttonmul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("*");
            }
        });

        button00.setBounds(13,405,70,70);//button00
        button00.setFont(f2);
        frame.add(button00);
        button00.setBackground(Color.WHITE);
        button00.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("00");
            }
        });

        button0.setBounds(98,405,70,70);//button0
        button0.setFont(f2);
        frame.add(button0);
        button0.setBackground(Color.WHITE);
        button0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("0");
            }
        });

        buttondec.setBounds(183,405,70,70);//button.
        buttondec.setFont(f2);
        frame.add(buttondec);
        buttondec.setBackground(Color.WHITE);
        buttondec.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append(".");
            }
        });

        buttondiv.setBounds(268,405,70,70);//button/
        buttondiv.setFont(f2);
        frame.add(buttondiv);
        buttondiv.setBackground(Color.WHITE);
        buttondiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.append("/");
            }
        });


        buttonans.setBounds(13,490,70,70);//ans=
        buttonans.setBackground(c);
        buttonans.setForeground(Color.WHITE);
        buttonans.setFont(f2);
        frame.add(buttonans);
        buttonans.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
//+ operation//
                if(area.getText().contains("+"))
                {
                    System.out.println("Contains");
                    statement = area.getText().split("\\+");

                    stri1 = statement[0];
                    stri2 = statement[1];

                    i1 = Double.parseDouble(stri1);
                    i2 = Double.parseDouble(stri2);

                    out = i1 + i2;

                    strout = Double.toString(out);
                    area.setText(strout);
                }
//- operation//
                if(area.getText().contains("-"))
                {
                    System.out.println("Contains");
                    statement = area.getText().split("\\-");

                    stri1 = statement[0];
                    stri2 = statement[1];

                    i1 = Double.parseDouble(stri1);
                    i2 = Double.parseDouble(stri2);

                    out = i1 - i2;

                    strout = Double.toString(out);
                    area.setText(strout);
                }
//x operation//
                if(area.getText().contains("*"))
                {
                    System.out.println("Contains");
                    statement = area.getText().split("\\*");

                    stri1 = statement[0];
                    stri2 = statement[1];

                    i1 = Double.parseDouble(stri1);
                    i2 = Double.parseDouble(stri2);

                    out = i1 * i2;

                    strout = Double.toString(out);
                    area.setText(strout);
                }
//devide operation//
                if(area.getText().contains("/"))
                {
                    System.out.println("Contains");
                    statement = area.getText().split("\\/");

                    stri1 = statement[0];
                    stri2 = statement[1];

                    i1 = Double.parseDouble(stri1);
                    i2 = Double.parseDouble(stri2);

                    out = i1 / i2;

                    if(i2 == 0)
                    {
                        area.setFont(f3);
                        area.setText("Can't divide by Zero");
                    }
                    else
                    {
                        strout = Double.toString(out);
                        area.setText(strout);
                    }
                }
            }
        });


        buttonbsp.setBounds(98,490,70,70);//buttonbackspace/
        buttonbsp.setFont(f2);
        frame.add(buttonbsp);
        buttonbsp.setBackground(Color.WHITE);
        buttonbsp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.setText(area.getText ().substring (0, area.getText ().length () - 1));
            }
        });


        buttonac.setBounds(183,490,70,70);//buttonAC
        buttonac.setFont(f2);
        frame.add(buttonac);
        buttonac.setBackground(Color.WHITE);
        buttonac.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.setText("");
            }
        });

        buttonper.setBounds(268,490,70,70);//button%
        buttonper.setFont(f2);
        frame.add(buttonper);
        buttonper.setBackground(Color.WHITE);
        buttonper.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
// % operation//
                if(area.getText().contains("/"))
                {
                    System.out.println("Contains");
                    statement = area.getText().split("\\/");

                    stri1 = statement[0];
                    stri2 = statement[1];

                    i1 = Double.parseDouble(stri1);
                    i2 = Double.parseDouble(stri2);

                    out = (i1 / i2)*100;

                    if(i2 == 0)
                    {
                        area.setFont(f3);
                        area.setText("Can't divide by Zero");
                    }
                    else
                    {
                        strout = Double.toString(out);
                        area.setText(strout);
                    }
                }

            }
        });

    }
}