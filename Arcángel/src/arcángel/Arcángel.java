/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arcángel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class Arcángel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        button b=new button();
        juego();
                
        // TODO code application logic here
    }
    
    public static void juego (){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Item> it= new ArrayList<Item>();
        ArrayList<Andra> and= new ArrayList<Andra>();
        ArrayList<Andra> and2= new ArrayList<Andra>();
        Juego jugador=new Juego(0,and,and2, it);
        capitulo1();
        new imh();
        System.out.println("1. Matar a la critura, 2. Dejarla vivir");
        int op = entrada.nextInt();
        switch(op){
            case 1:
                System.out.println("Ha salvado el mundo");
                System.out.println("Game over");
                break;
            case 2:
                capitulo2();
                decodificar(jugador);
                capitulo3();
                System.out.println("1. Suicidio, 2. Obedecer a los vigilantes");
                int op2 = entrada.nextInt();
                switch(op2){
                    case 1:
                System.out.println("Ha elegido la ruta de egoismo y condenado a todo el mundo a sufrir");
                System.out.println("Game over");
                break; 
                    case 2:
                capitulo4();
                new im13();
                new im14();
                new im15 ();
                
                rima(jugador);
                capitulo5();
                System.out.println("1. Dejar el Andra en paz, 2. Utilizar el Andra");
                int op3 = entrada.nextInt();
                switch(op3){
                    case 1:
                      System.out.println("Ha sido encontrado por Boruta");
                      new im4();
                System.out.println("Game over");  
                    break;
                    case 2: 
                        hechizo(jugador);
                        capitulo6();
                        new im ();
                        System.out.println("1. Matarla y ganar 100 puntos, 2. Dejarla vivir");
                int op4 = entrada.nextInt();
                switch(op4){
                    case 1:
                        new im5();
                        cat(jugador);
                        capitulo7(jugador);
                        capitulo9();
                        System.out.println("1. correr, 2. arrodillarme");
                    int op5 = entrada.nextInt();
                    switch(op5){
                    case 1:
                        System.out.println("Haz sido asesinado por Forneus");
                        System.out.println("GAME OVER");
                        break;
                    case 2:
                        forneus(jugador);
                        capitulo10();
                        new im2 ();
                        pluma(jugador);
                        capitulo11();
                         System.out.println("1. cantar , 2. jugar");
                         int op8 = entrada.nextInt();
                    switch(op8){
                        case 1:
                        secuencia (jugador);
                            capitulo12();
                            dagon(jugador);
                            new im8 ();
                            capitulo15();
                            new im12 ();
                        //final
                        capitulo13();
                        jugador.simulador();
                        break;
                        case 2:
                            secuencia2 (jugador);
                         capitulo12();
                            dagon(jugador);
                            new im8 ();
                            capitulo15();
                            new im12 ();
                        //final
                        capitulo13();
                        jugador.simulador();
                        break;
                    }
                    }
                    break;
                    case 2: 
                        new im6();
                        cat(jugador);
                        capitulo8(jugador);
                        capitulo9();
                          System.out.println("1. correr, 2. arrodillarme");
                         int op6 = entrada.nextInt();
                    switch(op6){
                    case 1:
                        System.out.println("Haz sido asesinado por Forneus");
                        System.out.println("GAME OVER");
                        break;
                    case 2:
                        forneus(jugador);
                        capitulo10();
                        new im2 ();
                        pluma(jugador);
                        capitulo11();
                        System.out.println("1. cantar , 2. jugar");
                         int op7 = entrada.nextInt();
                    switch(op7){
                        case 1:
                              secuencia (jugador);
                            capitulo12();
                            dagon(jugador);
                            new im8 ();
                            capitulo14();
                            new im11();
                        //final
                        capitulo13();
                        jugador.simulador();
                        break;
                        case 2:
                            secuencia2 (jugador);
                            capitulo12();
                            dagon(jugador);
                            new im8 ();
                            capitulo14();
                            new im11();
                        //final
                        capitulo13();
                        jugador.simulador();
                        break;
                    }
                        
                    }
                //switch 4
                }
        //switch 3
        }
                //switch 2
                }
        //switch
        }
     //main
    }
    public static char patron (Juego jugador){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivine la siguiente letra en la serie");
        System.out.println("C, E, L, S, L, E, L");
        char resp='S';
        return resp;
    }
    
    public static void secuencia (Juego jugador){
        jugador.printjuego();
         int p=jugador.getPoints();
        char r=patron(jugador);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es la siguiente letra en la serie?");
        String resp=entrada.next();
        if (resp.charAt(0)==r) {
            p+=200;
        }
          jugador.setPoints(p);
        }
    
    public static double patron2 (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("calcule cual esta fuera de lugar");
        System.out.println("213.00, 235.00, 489.00, 718.00, 5712.00, 7411.00");
        double resp=489.00;
        return resp;
    }
    
    public static boolean cor (){
        boolean correcto=false;
        double r=patron2();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es la respuesta");
        double resp=entrada.nextDouble();
        if (resp==r) {
            correcto=true;
            return correcto;
        }else{
            correcto=false;
            return correcto;
        }
        }
    
    public static void secuencia2 (Juego jugador){
         jugador.printjuego();
        boolean resp=cor();
         int p=jugador.getPoints();
        if(resp==true){
            p+=300;
        }
        jugador.setPoints(p);
    }

    
     public static void decodificar (Juego jugador){
         jugador.printjuego();
         System.out.println("Resuelva el siguiente juego para adquirir el elixir de la verdad ");
         Scanner entrada = new Scanner(System.in);
     int num= new Random().nextInt((3-1)+1)+1;
     String par="";
     String preg="";
     String resp="";
     if(num==1){
        par="serpiente"; 
        preg=jugador.codigo(par);
         System.out.println("Decodifique el siguiente mensaje");
         System.out.println(preg);
           resp = entrada.nextLine();
           if (resp.equalsIgnoreCase(par)){
               System.out.println("RESPUESTA CORRECTA");
               jugador.verdad();
           }else{
               System.out.println("RESPUESTA INCORRECTA ");
               System.out.println("El elixir no ha sido adiquirido");
           }
     }else if (num==2){
         par="muerte"; 
                 preg=jugador.codigo(par);
         System.out.println("Decodifique el siguiente mensaje");
         System.out.println(preg);
           resp = entrada.nextLine();
                      if (resp.equalsIgnoreCase(par)){
               System.out.println("RESPUESTA CORRECTA");
               jugador.verdad();
           }else{
               System.out.println("RESPUESTA INCORRECTA ");
               System.out.println("El elixir no ha sido adiquirido");
           }
     }else{
        par="veneno";  
               preg=jugador.codigo(par);
         System.out.println("Decodifique el siguiente mensaje");
         System.out.println(preg);
           resp = entrada.nextLine();
                      if (resp.equalsIgnoreCase(par)){
               System.out.println("RESPUESTA CORRECTA");
               jugador.verdad();
           }else{
               System.out.println("RESPUESTA INCORRECTA ");
               System.out.println("El elixir no ha sido adiquirido");
     }
     }
     }
     
     public static void rima (Juego jugador){
         jugador.printjuego();
         Scanner entrada = new Scanner(System.in);
         System.out.println("Resuelva el siguiente juego para adquirir el libro de la creacion ");
         System.out.println("Utilize la siguiente rima para determinar quien es el culpable ");
         System.out.println("Opciones La Anciana, El Hombre, La Niña");
         System.out.println("Quien es el que espera la parca? Si no el mas cascado. \n Quien es el mas sospechado? Si no el mas sospechoso. \n Y Quien tiene motivo ? Si no el mas esperanzado.");
         String resp = entrada.nextLine();
         String esp=resp.replace(" ", "");
         if ((esp.equalsIgnoreCase("niña"))||(esp.equalsIgnoreCase("laniña"))){
             jugador.creacion();
         }else{
             System.out.println("RESPUESTA INCORRECTA");
             System.out.println("El libro no ha sido adquirido");
         }
     }
     
     public static void hechizo(Juego jugador){
         jugador.printjuego();
         Scanner entrada = new Scanner(System.in);
         System.out.println("Cree un hechizo para dominar a los Andra ");
         System.out.println("Para que el hechizo funcione tiene que escribirlo todo al reves: ");
         System.out.println("Ingrese el hechizo original");
         String hech = entrada.nextLine();
         System.out.println("Escriba el hechizo con los requerimientos.");
         String resp = entrada.nextLine();
         String esp=resp.replace(" ", "");
         String com=jugador.magico(hech);
         if(com.equalsIgnoreCase(esp)){
             jugador.collect();
         }else{
             System.out.println("Incorrecto");
         }
         
     }
     public static void pluma (Juego jugador){
         jugador.printjuego();
                 System.out.println("Necesita utilizar un item para realizar este juego ");
     Item it=jugador.item.get(0);
     if(it.getNombre().equals("Libro de la creacion")){
         jugador.item.remove(0);
         System.out.println("El Item Libro de la creacion fue utilizado para abir el juego");
         Scanner entrada = new Scanner(System.in);
         int p=jugador.getPoints();
         String[][]pluma= new String[9][7];
         String[][]vacia= new String[9][7];
         pluma=llenarpluma(pluma);
         imprimirMatriz(pluma);
         System.out.println("Matriz vacia");
         vacia=llenarvacio(vacia);
         imprimirMatriz(vacia);
         System.out.println("Vuelva a dibujar la pluma, cada vez que acierte una posicion gana 10 puntos");
         
        
         for (int i = 0; i < 14; i++) {
        System.out.println("Fila: ");
        int fil = entrada.nextInt();
        System.out.println("columna: ");
        int col = entrada.nextInt();
        if ((fil<9)&&(col<8)){
        if(pluma[fil][col]=="*"){
            System.out.println("CORRECTA, +3 Puntos");
         p+=3;
         vacia=nmatriz(fil,col,vacia);
         imprimirMatriz(vacia);
     }else{
            System.out.println("INCORRECTA");
        }
        }else{
            System.out.println("ERROR");
        }   
        jugador.setPoints(p);
         }
     }else{
         System.out.println("No tiene el item necesario para entrar a este juego");
     }
     }
     
      public static String [][] llenarpluma (String [][]plum){
          plum[8][0]="/";
         plum[6][1]="/";
         plum[5][1]="/";
         plum[4][2]="/";
         plum[3][3]="/";
         plum[2][4]="/";
         plum[5][1]="/";
         plum[0][6]="*";
         plum[0][5]="*";
         plum[0][4]="*";
         plum[1][6]="*";
         plum[1][3]="*";
         plum[1][2]="*";
         plum[2][2]="*";
         plum[2][5]="*";
         plum[3][1]="*";
         plum[3][5]="*";
         plum[4][1]="*";
         plum[4][4]="*";
         plum[5][2]="*";
         plum[5][3]="*";
        
         
         return plum;
      }
      
    public static String [][] llenarvacio (String [][]plum){
          plum[8][0]="/";
         plum[6][1]="/";
         plum[5][1]="/";
         plum[4][2]="/";
         plum[3][3]="/";
         plum[2][4]="/";
         plum[5][1]="/";
          return plum;
      }
    public static String [][] nmatriz (int fila, int columna, String [][]plum){
         plum[8][0]="/";
         plum[6][1]="/";
         plum[5][1]="/";
         plum[4][2]="/";
         plum[3][3]="/";
         plum[2][4]="/";
         plum[5][1]="/";
         plum [fila][columna]="X";
           return plum;
    }
    public static void imprimirMatriz (String [][] matriz){
        for (int i = 0; i < matriz.length; i++) { // fila
            for (int j = 0; j < matriz[i].length; j++) {// columna
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void imprimirarreglo(String []array){
        for (int i = 0; i < array.length; i++) { // fila// columna
                System.out.print("["+array[i]+"]");
            }
            System.out.println("");
        }
    
    public static void forneus(Juego jugador){
    jugador.printjuego();
        System.out.println("Necesita utilizar un item para realizar este juego ");
     Item it=jugador.item.get(0);
     if(it.getNombre().equals("Elixir de la verdad")){
         jugador.item.remove(0);
         System.out.println("El Item Elixir de la Verdad fue utilizado para abir el juego");
    int p=jugador.getPoints();
    Scanner entrada=new Scanner(System.in); 
    int cont=0;
    String[][]HELL=new String [7][7];
    HELL=(llenarMatriz2(HELL));
    imprimirMatriz (HELL);
    while(cont<3){
        cont++;
        System.out.println("Ingrese la palabra");
        String Word=entrada.nextLine();
        String word=Word.replace(" ", "");
            if (word.equalsIgnoreCase("kill")){
                System.out.println("Correcta");
                p+=20;
            }else if (word.equalsIgnoreCase("cat")){
                System.out.println("Correcta");
                p+=20;
            }else if(word.equalsIgnoreCase("night")){
                System.out.println("Correcta");
                p+=20;
            }else{
                System.out.println("Palabra incorrecta");
            }
            cont++;
    }
            jugador.setPoints(p);
     }else{
         System.out.println("No tiene el item necesario para realizar este juego");
     }
    }
    
    public static void dagon(Juego jugador){
    jugador.printjuego();
    int p=jugador.getPoints();
    System.out.println(" Esquive los golpes de dagon por medio medio de elegir una posicion donde no halla holas");
    String[][]Sea= new String[2][2];
    Sea=(llenarMatrizc(Sea));
        System.out.println("Matriz vacia");
    imprimirMatriz(Sea);
    int Diamonds=0;
    Scanner scanner=new Scanner(System.in);
        Sea=(llenarMatriz(Sea));
        for (int i = 0; i < 2; i++) {
            Diamonds++;
         System.out.println("Ingrese valores validos entre 0-1");
        System.out.println("Fila: ");
        int place1=scanner.nextInt();
        System.out.println("Columna: ");
        int place2=scanner.nextInt();
            if((place1>2)&&(place2>2)){
                System.out.println("Ingrese valores validos entre 0-1");
                        System.out.println("Fila ");
                        place1=scanner.nextInt();
                        System.out.println("columna");
                        place2=scanner.nextInt();
            }
                if (Sea[place1][place2]=="*"){
                    System.out.println("Atrapat"); 
                    matriz(place1,place2,Sea);
                    i=3;
                    System.out.println("Ha ganado +150 puntos");
                }else if(Sea[place1][place2]!="*"){
                    System.out.println("No");            
                }
                
                
        }
        jugador.setPoints(p);
}
    public static String [][] llenarMatrizc (String[][] matrizc){ 
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < matrizc.length; i++) {
                for (int j = 0; j < matrizc[i].length; j++) {
                    matrizc [i][j]=" ";
                }
            }
        }
    return matrizc;
    }
    
    public static String [][] llenarMatriz (String[][] matrizc){ 
       
int f = new Random().nextInt((1-0)+1)+0;
int c = new Random().nextInt((1-0)+1)+0;
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < matrizc.length; i++) {
                for (int j = 0; j < matrizc[i].length; j++) {
                    if ((i==f)&&(j==c)){
                        matrizc[i][j]= "*";
                    }else{
                        matrizc[i][j]=" ";
                    }
                }
            }
        }
    return matrizc;
    }
    public static void matriz (int fila, int columna, String [][]matriz){
            matriz [fila][columna]="X";
            imprimirMatriz(matriz); 
 
        }
public static String [][] llenarMatriz2 (String[][] matrizc){ 
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < matrizc.length; i++) {// fila
                for (int j = 0; j < matrizc[i].length; j++) {// columna
                    matrizc[0][0]="M";
                    matrizc[1][0]="F";
                    matrizc[2][0]="V";
                    matrizc[3][0]="G";
                    matrizc[4][0]="X";
                    matrizc[5][0]="C";
                    matrizc[6][0]="K";
                    
                    matrizc[0][1]="R";
                    matrizc[1][1]="E";
                    matrizc[2][1]="P";
                    matrizc[3][1]="Q";
                    matrizc[4][1]="Q";
                    matrizc[5][1]="N";
                    matrizc[6][1]="I";

                    matrizc[0][2]="W";
                    matrizc[1][2]="F";
                    matrizc[2][2]="V";
                    matrizc[3][2]="K";
                    matrizc[4][2]="P";
                    matrizc[5][2]="T";
                    matrizc[6][2]="L";
                    
                    matrizc[0][3]="D";
                    matrizc[1][3]="X";
                    matrizc[2][3]="W";
                    matrizc[3][3]="T";
                    matrizc[4][3]="Y";
                    matrizc[5][3]="H";
                    matrizc[6][3]="L";
                    
                    matrizc[0][4]="V";
                    matrizc[1][4]="Z";
                    matrizc[2][4]="F";
                    matrizc[3][4]="D";
                    matrizc[4][4]="C";
                    matrizc[5][4]="A";
                    matrizc[6][4]="T";
                    
                    matrizc[0][5]="X";
                    matrizc[1][5]="N";
                    matrizc[2][5]="I";
                    matrizc[3][5]="G";
                    matrizc[4][5]="H";
                    matrizc[5][5]="T";
                    matrizc[6][5]="J";
                    
                    matrizc[0][6]="B";
                    matrizc[1][6]="H";
                    matrizc[2][6]="M";
                    matrizc[3][6]="Y";
                    matrizc[4][6]="P";
                    matrizc[5][6]="N";
                    matrizc[6][6]="Z";
                }
            }
        }
    return matrizc;
    }
public static void cat (Juego jugador){
    jugador.printjuego();
    int p=jugador.getPoints();
    String[]Hide= new String [3];
    Scanner scanner=new Scanner(System.in); 
    Hide=llenarMatriz1(Hide);
    System.out.println("Esconderse");
    System.out.println("Un numero del 0 al 2");
    int hid=scanner.nextInt();
    if(Hide[hid]=="x"){
        System.out.println("Perdedor");
    }else{
        System.out.println("Ganador");
        p+=100;
    }
    imprimirarreglo(Hide);
    jugador.setPoints(p);
    
}
public static String [] llenarMatriz1 (String[]matrizc){ 
int c = new Random().nextInt((2-0)+1)+0;
        for (int p = 0; p < 3; p++) {
            for (int i = 0; i < matrizc.length; i++) {
                if (c==i) {
                    matrizc[i]="x";
                }else{
                    matrizc[i]=" ";
                    }
                }
        }
    return matrizc;
    }


    //storyline
    public static void capitulo1(){
        System.out.println("El principio");
        System.out.println("Todos los humanos descienden de la union de Malacoda y Morfran, dos demonios al servicio ");
        System.out.println("de Olbelbis, el dios creador. Se dice que fueron creados despues de que Olbelbis fuera ");
        System.out.println("traicionado por los arcangeles y encarcelado en el inframundo, por lo que se les llama ");
        System.out.println("demonios. A pesar de descender de la magia, con el tiempo los humanos han perdido la mayor ");
        System.out.println("parte de su potencial arcano. Sin embargo, todavia habia algunos seres capaces de ejercer ");
        System.out.println("magia, el era uno de ellos. Sedit Faust, el hijo de un pobre maestro de esclusas, con un poco de ");
        System.out.println("entrenamiento magico. Aunque sabia que la magia siempre tenia un precio y un riesgo. Hoy ");
        System.out.println("estaba intentando algo mucho mas alla de su conocimiento y mucho mas alla de lo permitido, ");
        System.out.println("un ritual de resurreccion.");
        System.out.println("");
        System.out.println("Su hermano habia muerto la semana anterior por el virus de sangre, y nadie se habia ");
        System.out.println("molestado en ayudarlo, porque “la muerte era un regalo”, cuando su cuerpo se enfrio, ");
        System.out.println("aparecio una nueva luz en el rio Archeron, donde cada vez que una persona muere una nueva. ");
        System.out.println("la luz parece simbolizar que la persona ha resucitado, pero en lugar de traer consuelo, Sedit se ");
        System.out.println("sintio afligido, por lo que decidio resucitar a su hermano.");
        System.out.println("");
        System.out.println("El ritual involucra el cadaver de diferentes animales y la adquisicion de la luz de la persona ");
        System.out.println("muerta. El ritual fue bastante facil, quemas los cuerpos de los animales junto con la luz de la ");
        System.out.println("persona. Luego, de los residuos de la luz brotan la carne y la sangre de la persona y crean un ");
        System.out.println("nuevo cuerpo con el alma resucitada.");
        System.out.println("");
        System.out.println("la criatura gimio cuando su carne se retorcio y deformo a su alrededor");
        System.out.println("");
        System.out.println("Podia escuchar los gritos de su hermano en agonia mientras se transformaba en una criatura inhumana.");
        System.out.println("");
        System.out.println("Lo que sea que habia creado ya no era su hermano, al menos ya no.");
        System.out.println("");
        System.out.println("Tenia la opcion de matar a la criatura o dejarla vivir.");
    }
    public static void capitulo2(){
        System.out.println("La serpiente nueva");
        System.out.println("Samael habia sido el lider de los arcangeles en su tiempo. El fue el que decidio volverse contra ");
        System.out.println("Olbelbis. Primero envio a otros dos arcangeles para tratar de matarlo. primero envio a Hazazel ");
        System.out.println("“El chivo expiatorio” para perforar el corazon de Olbelbis con una espada, pero lo atraparon y ");
        System.out.println("con un solo atisbo de ira el creador lo incinero. A continuacion, Samael envio al tifon “La serpiente de ");
        System.out.println("antaño” para ahogar a Olbelbis mientras se bañaba, pero también fue atrapado. Se dice que ");
        System.out.println("Olbelbis lo corto en un millón de pedazos y esparcio sus partes por toda la Tierra. Por ultimo, ");
        System.out.println("Samael recogio las partes del tifon y cosecho su veneno, ganandose el nombre de “serpiente ");
        System.out.println("nueva”. Se lo sirvio a Olbelbis en su vino, el veneno lo debilito, no lo mato, pero les dio a los ");
        System.out.println("angeles el poder suficiente para arrojarlo al inframundo. Durante siete dias penso que habia ");
        System.out.println("ganado. Hasta el octavo dia, Olbelbis se levanto con sus demonios y lo derroto. Olbelbis, luego ");
        System.out.println("tomo a los enemigos restantes y los convirtio en rios, para que fueran cortados en pedazos ");
        System.out.println("cada vez que se recogiera agua de los rios. Los arcangeles entonces vivian en agonia, pero ");
        System.out.println("Samael tenía un plan especial para su liberación.");
        System.out.println("");
    }
    public static void capitulo3(){
        System.out.println("Los Vigilantes");
        System.out.println("Los vigilantes eran la seccion de angeles que no se pusieron del lado de los demonios o ");
        System.out.println("arcangeles en la guerra. Como se habian mantenido neutrales, Olbelbis los condeno a todos a ");
        System.out.println("solo poder \"observar\" toda su vida. No tienen ningún poder y su unica funcion es observar e ");
        System.out.println("informar.");
        System.out.println("");
        System.out.println("Uno de los angeles se paro frente a mi:");
        System.out.println("ella dijo “Sabes lo que has hecho?” en un tono enojado. “Has liberado los cuerpos ");
        System.out.println("reencarnados de Hazazel y Tifon”, “Como fuiste tu quien creo el hechizo original debes ser ");
        System.out.println("tu quien lo revierta, nadie mas puede”");
        System.out.println("");
        System.out.println("Considere mis opciones, podia salvar el mundo o matarme y condenarlo a terminar en sangre.");
    }
    public static void capitulo4(){
        System.out.println("La madre");
        System.out.println("Punto de vista Belial");
        System.out.println("Una Gresill es una sacerdotisa de la fe, fundada por la propia Malacoda. Segun la fe, Olbelbis ");
        System.out.println("les habia dado la vida eterna despues de la guerra, como recompensa a Malacoda y Morfran ");
        System.out.println("por sus contribuciones. Sin embargo, la fe conlleva tres reglas para poder ser receptor.");
        System.out.println("No puedes suicidarte");
        System.out.println("No puedes matar a otros.");
        System.out.println("No puedes interferir en la muerte de otra persona.");
        System.out.println("Como tal para convertirte en un Gresill, debes pasar una prueba que consiste en que te ");
        System.out.println("presenten dos inocentes y un criminal condenado a muerte. Si eres capaz de matar al criminal ");
        System.out.println("condenado a muerte, no habras cometido ningun pecado ya que se le prometio morir, pero si ");
        System.out.println("matas a un inocente, tendras que suicidarte y privarte del mas alla.");
}
    public static void capitulo5(){
        System.out.println("El protector");
        System.out.println("Boruta es el demonio que protege la flora y la fauna. Deambula por el bosque en busca de ");
        System.out.println("cualquier humano que intente profanarlo. En esto, es ayudado por los Andra, criaturas ");
        System.out.println("humanoides que viven en el bosque. El Andra tiene un gran potencial magico. ¿Deberia usarlos\n para derrotar a mi hermano?");
    }
    public static void capitulo6(){
          System.out.println("La bruja del bosque");
          System.out.println("Despues de recoger el Andra me encontre con una mujer en el bosque, dijo que su nombre era ");
          System.out.println("Maialen de Loreto, y que era una bruja del bosque. Un curandero que iba en contra de la ley ");
          System.out.println("para ayudar a los enfermos no sabia que existian esas personas, si hubiera sabido que tal vez ");
          System.out.println("mi hermano estaria vivo. Maialen era encantadora y dulce, me dejaba refugiarme en su casa y ");
          System.out.println("comer su comida. Como bruja, tiene magia en la sangre, estaba considerando matarla y usar el ");
          System.out.println("poder de su sangre para rituales mas tarde, ¿deberia hacerlo?");
    }
    public static void capitulo7(Juego jugador){
        int p=jugador.getPoints();
         p+=100;
         
        System.out.println("El Gato Curioso");
        System.out.println("Punto de vista Belial");
        System.out.println("Soy un humano inclinado a la magia, mi poder es entrar en la mente de los gatos. Los uso para ");
        System.out.println("explorar lugares en los que me siento llamado. Ultimamente, me he sentido llamado al ");
        System.out.println("bosque. Al llegar, encontre el cuerpo de una joven muriendo en el suelo, asi que me acurruque ");
        System.out.println("con ella y deje que me abrazara mientras moría."); 
        System.out.println("+100 puntos magicos");
        jugador.setPoints(p);
    }
     public static void capitulo8(Juego jugador){
         int p=jugador.getPoints();
         p+=300;
         
        System.out.println("El Gato Curioso");
        System.out.println("Punto de vista Belial");
        System.out.println("Soy un humano inclinado a la magia, mi poder es entrar en la mente de los gatos. Los uso para ");
        System.out.println("explorar lugares en los que me siento llamado. Ultimamente, me he sentido llamado al ");
        System.out.println("bosque. Al llegar, encontre a una joven de pelo rojo ");
        System.out.println("ella detecto que era humana entonces me transforme a mi forma natural");
         System.out.println("La bruja me hablo acerca de un viajero en busca de salvar el mundo");
         System.out.println("+300 puntos por ganar amistades");
         jugador.setPoints(p);
    }
     public static void capitulo9(){
        System.out.println("El Conocedor");
        System.out.println("Forneus es el demonio que domina el conocimiento, estoy en su presencia, que debo hacer arrodillarme o correr?");
    }
     public static void capitulo10(){
        System.out.println("El demonio caído");
        
        System.out.println("Helel es un demonio que perdio sus alas luchando en la guerra, por lo que sabe que domina el suelo.");
    }
     public static void capitulo11(){
        System.out.println("La nina");
        System.out.println("Rangda es la mas joven de los demonios, fue hecha con los restos de todos los demas demonios, por eso se la llama \"la niña\","
                + "\n que debo hacer para ganarme su favor?");
    }
      public static void capitulo12(){
          
        System.out.println("El naufragiador");
        System.out.println("Dagon es el demonio que domina el oceano, destroza los barcos de los malhechores.");
    }
    public static void capitulo13(){
        System.out.println("La ultima Guerra");
        System.out.println("Es hora de reunir todo lo que hemos recolectado y usarlo para vencer al mal..");
    }
        public static void capitulo14(){
        System.out.println("El corta lenguas");
        System.out.println("Para poder transferir el poder magico a tu andras debes hacer un ritual que involucra cortar");
            System.out.println("las lenguas se los sacerdotes de la fe: ");
    }
            public static void capitulo15(){
        System.out.println("El conciliador");
        System.out.println("Debido a la influencia de Belial en la fe, estos van a ayudarte a transferir el poder ");
        System.out.println("magico a los andras");
    }
     
}
