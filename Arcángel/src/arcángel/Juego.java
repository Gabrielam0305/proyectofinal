/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arcángel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class Juego {
    public int points;
    ArrayList<Andra>andra;
    ArrayList<Andra>andra2;
    ArrayList<Item>item;

    public Juego(int points, ArrayList<Andra> andra, ArrayList<Andra> andra2, ArrayList<Item> item) {
        this.points = points;
        this.andra = new ArrayList<Andra>();
        this.andra2 = new ArrayList<Andra>();
        this.item = item;
    }

    public Juego() {
    }




   public void collect (){
        Scanner entrada = new Scanner(System.in);
            System.out.println("Los Andra han sido collecionados");
          for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese el nombre del andra");
        String nom=entrada.nextLine();
        Andra el=new Andra (nom,0);
        this.andra.add(el);
          
            System.out.println(nom+" ha sido agreagado !");
          }
          System.out.println("Llene los andra de puntos de combate para la batalla");
    }

    public void verdad(){
       Item el=new Item("Elixir de la verdad");
        this.item.add(el);
            System.out.println("Elixir de la verdad ha sido agregado a tu lista de items!");
    }
     public void creacion(){
       Item el=new Item("Libro de la creacion");
        this.item.add(el);
            System.out.println("Libro de la creacion ha sido agregado a tu lista de items!");
    }
    public int citem(){
    int itemsize=this.item.size();
    return itemsize;
}
    
        public int candra(){
    int andrasize=this.andra.size();
    return andrasize;
}
     public void imitems (){
            int vac=citem();
            System.out.println("la cantidad de items es: "+vac);
            System.out.println("Y estos son: ");
              Scanner entrada = new Scanner(System.in);
            for (int i = 0; i <this.item.size(); i++) {
                Item el=item.get(i);
                System.out.println(el.getNombre());
            }
    } 
  public void printjuego () {
        int mon= this.points;
         System.out.println("-----Analis-----");
        System.out.println("Tienes "+mon+ " puntos");
        imandra();
        imitems();
         System.out.println("----------------------------");
     }   
  
  public void imandra (){
            int an=candra();
            System.out.println("la cantidad de andra es: "+an);
            System.out.println("Y estas son: ");
              Scanner entrada = new Scanner(System.in);
            for (int i = 0; i <this.andra.size(); i++) {
                Andra el=andra.get(i);
                System.out.println(el.getNombre());
                System.out.println((char) el.getPuntos());
                
            }
    } 
  public String codigo(String in){
      int num= new Random().nextInt((3-1)+1)+1;
      String acum="";
      for (int i = 0; i <in.length(); i++) {
          if(i%2==0){
              acum+=in.charAt(i);
          }else{
              acum+=num;
      }
          }
      return acum;
  }
   public String magico (String or){
      String in=or.replace(" ", "");
      String acum="";
      for (int i = in.length()-1; i >=0; i--) {
          acum+=in.charAt(i);
      }
      return acum;
  } 
  //setters y getters 

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
  public void collect2 (){
          for (int i = 0; i < 5; i++) {
        String nom="malvado";
        int num= new Random().nextInt((110-50)+1)+50;
        Andra el=new Andra (nom,num);
        this.andra2.add(el);
          }
    }
public void andrapoints (){
    int div=this.points/5;
    for (int i = 0; i < 5; i++) {
        Andra el=this.andra.get(i);
        el.setPuntos(div);
          }
}
public void simulador (){
    collect2();
    andrapoints();
             while((andra.size()>0)&&(andra2.size()>0)){
                 Andra an=this.andra.get(0);
                 Andra an2=this.andra2.get(0);
        String nombre1=an.getNombre();
        String nombre2=an2.getNombre();
        int p1=an.getPuntos();
                 
        int p2=an2.getPuntos();
        int k=1;
            System.out.println("Jugada "+k);
            System.out.println(nombre1+" ataca  tiene: "+p1+ " puntos de magia");  
            System.out.println(nombre2+" ataca  tiene: "+p2+ " puntos de magia");
                
         if(p1<p2){
             this.andra.remove(0);
         }else{
             this.andra2.remove(0);
         }
         k+=1;
             }
                 if (andra.size()>andra2.size()) {
                     System.out.println("Gana el jugador");
                     
                 }else{
                     System.out.println("Ganan los arcangeles");
                     System.out.println("Fin del mundo");
                 }
}
  
    
}
