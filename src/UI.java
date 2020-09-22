import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.MouseAdapter;
import java.io.*;

public class UI {
    private JFrame title, dictionary, define;
    private JButton b1, b2, b3, back;
    private int WIDTH= 1540;
    private int HEIGHT= 845;


    public UI() {

        title();
        dictionary();
        define();
    }

    public void title() {
        title = new JFrame("Project Lumen");
        title.setLayout(null);
        title.setSize(WIDTH, HEIGHT);
        title.setResizable(false);
        title.setExtendedState(JFrame.MAXIMIZED_BOTH);
        title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Background

            title.setContentPane(new JLabel(new ImageIcon("img/background.png")));


        b1 = new JButton();
        ImageIcon dictionaryOn = new ImageIcon("img/button.png");
        b1.setVisible(true);
        b1.setOpaque(false);
        b1.setBorderPainted(false);
        b1.setIcon(dictionaryOn);
        b1.setSize(430 ,170);
        b1.setLocation(780,255);
        ImageIcon dictionaryOff = new ImageIcon("");
        b1.setRolloverIcon(dictionaryOff);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //title.setVisible(false);
                dictionary.setVisible(true);
                title.setVisible(false);
            }
        });

        
       

        b2 = new JButton();
        b2.setVisible(true);
        b2.setOpaque(false);
        b2.setBorderPainted(false);
        b2.setSize(430,170);
        b2.setLocation(780,455);
        ImageIcon definitionOn = new ImageIcon("img/button.png");
        b2.setIcon(definitionOn);
        ImageIcon definitionOff = new ImageIcon("");
        b2.setRolloverIcon(definitionOff);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                define.setVisible(true);
            }
        });

       


        b3 = new JButton ();
        b3.setVisible(true);
        b3.setBorderPainted(false);
        b3.setSize(430,170);
        b3.setLocation(780,655);
        ImageIcon exitOn = new ImageIcon ("img/button.png");
        b3.setIcon(exitOn);
        ImageIcon exitOff = new ImageIcon ("");
        b3.setRolloverIcon(exitOff);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });


        title.add(b1);
        title.add(b2);
        title.add(b3);
       



        title.setVisible(true);
    }

    public void dictionary(){
        dictionary = new JFrame();
        dictionary.setLayout(null);
        dictionary.setUndecorated(true);
        dictionary.setSize(1540,845);
        dictionary.setResizable(false);
        dictionary.setExtendedState(Frame.MAXIMIZED_BOTH);
        dictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dictionary.setVisible(false);
//Dictionary Background
        dictionary.setContentPane(new JLabel(new ImageIcon("")));

        dictionary.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                dictionary.setVisible(false);
                //main2.setVisible(true);
                
            }
        });


        backButton();
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dictionary.setVisible(false);
                title.setVisible(true);
            }
        });
        dictionary.add(back);
        
    }

    public void define(){
        define = new JFrame();
        define.setLayout(null);
        define.setUndecorated(true);
        define.setSize(1540,845);
        define.setResizable(false);
        define.setExtendedState(Frame.MAXIMIZED_BOTH);
        define.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        define.setVisible(false);
//Definition Background
        define.setContentPane(new JLabel(new ImageIcon("")));

        define.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                define.setVisible(false);
                //main2.setVisible(true);
                
            }
        });


        backButton();
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                define.setVisible(false);
                title.setVisible(true);
            }
        });
        define.add(back);
       
    }
   


    public void backButton(){
        back = new JButton();
        back.setLocation(50, 675);
        back.setSize (220,130);
        back.setBorderPainted(false);
        ImageIcon backOn = new ImageIcon("img/button.png");
        //back.setIcon(back);
        ImageIcon backOff = new ImageIcon("");
        back.setRolloverIcon(backOn);
    }

    
}


