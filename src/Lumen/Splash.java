/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lumen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Splash extends JFrame implements ActionListener {
    public static SplashScreen execute;
    public static int count;
 
    public static int delay = 5000;
   
    
    
        public Splash() {
            super("Project Lumen");
      
            Container container = getContentPane();
            container.setLayout(null);
            setUndecorated(true);
            JPanel panel = new JPanel();
            panel.setBorder(new javax.swing.border.EtchedBorder());
            panel.setBackground(new Color(255, 255, 255));
            panel.setBounds(10, 10, 350, 150);
            panel.setLayout(null);
            pack();
            container.add(panel);
    
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(getClass().getResource("/img/splash.png")));
            label.setFont(new Font("Verdana", Font.BOLD, 14));
            label.setBounds(1, 1, 350, 150);
            panel.add(label);
            
            JProgressBar progressBar = new JProgressBar(0, 100);
            progressBar.setStringPainted(true);
            progressBar.setBounds(55, 180, 250, 15);
            container.add(progressBar);
            setSize(370, 240);
            setLocationRelativeTo(null);
            setVisible(true);
            
            Runnable schedulerRunnable = new Runnable() {
                public void run() {
                    int value = progressBar.getValue();
                    progressBar.setValue(value + 1);
                }
            };
            
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
            executor.scheduleAtFixedRate(schedulerRunnable, 0, 50, TimeUnit.MILLISECONDS);
            
            
            try {
                
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setVisible(false);
            new Login().setVisible(true);

        
     
            
           
    
        
         
           
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        

        }



           

       
        


    
    }
    

