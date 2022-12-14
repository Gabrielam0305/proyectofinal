/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arcángel;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Gabriela Montes
 */
public class im15 extends JFrame{
     JFrame frame = new JFrame(); 

        public im15(){
        frame.setTitle(" Niña");
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setBounds(100, 200, 350, 300); 
        
        Container con = frame.getContentPane(); 
        JLabel label = new JLabel(); 
        label.setIcon(new ImageIcon("niña.jpeg")); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(50, 30, size.width, size.height); 
 
    con.add(label); //Adds objects to the container
        frame.setVisible(true); // Exhibit the frame
        }
}
