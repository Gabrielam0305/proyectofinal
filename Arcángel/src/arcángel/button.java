/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arcángel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Gabriela Montes
 */
public class button extends JFrame implements ActionListener{
     JButton button;
    private JFrame frame;
    private ImageIcon im;
    private JLabel label;
    
    button(){
        button=new JButton();
        button.setBounds(300, 300,250, 100);
        button.addActionListener(this);
        button.setText("Personajes");
        button.setFocusable(false);
        frame=new JFrame("Arcangel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000, 1000);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Personajes");
            System.out.println("Nombre: Belial Aelia Hester");
            System.out.println("Genero: F");
            System.out.println("Edad: 15 anios");
            System.out.println("Afiliacion: la fe");
            System.out.println("");
            System.out.println("Nombre: Maialen Rusalka of Loreto");
            System.out.println("Genero: F");
            System.out.println("Edad: 20 anios");
            System.out.println("Ocupacion: Bruja");
            System.out.println("");
            System.out.println("Nombre: Sedit Faust");
            System.out.println("Genero: M");
            System.out.println("Edad: 21 anios");
            System.out.println("Mision: salvar al mundo");
            System.out.println("");
            System.out.println("Nombre: Nali");
            System.out.println("Genero: M");
            System.out.println("Edad: muerto");
            System.out.println("Afiliacion: muerto");
            System.out.println("");
            System.out.println("Arcangeles");
            System.out.println("Nombre: Morfran");
             System.out.println("Nombre: Malacoda");
              System.out.println("Nombre: Forneus");
             System.out.println("Nombre: Rangda");
              System.out.println("Nombre: Helel");
               System.out.println("Nombre: Boruta");
             System.out.println("Nombre: Dagon"); 
             System.out.println("");
             System.out.println("Demonios");
            System.out.println("Nombre: Samael");
             System.out.println("Nombre: Hazazel ");
              System.out.println("Nombre: Tifon");
             System.out.println("Nombre: Teivel");
              System.out.println("Nombre: Kavana");
               System.out.println("Nombre: Agan"); 
    }
    }
}

