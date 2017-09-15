/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejecicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       //mostrar mensaje
        System.out.println("");
        System.out.println("INGRESE UN AÑO: ");
        
        int año=input.nextInt();
        System.out.println("INGRESE UN MES: ");
        String mes=input.nextLine();
        //espera
        boolean añoBisiesto=
                ((año%4==0)&&(año%100 !=0))|| (año%400==0);
        
        //muestra el numero  de dias en una b
        System.out.println(mes+ " " + año + " tiene ");
        boolean tiene31dias=mes.equals(" Ene ")||
                            mes.equals("Mar")||
                            mes.equals("May")||
                            mes.equals("Jul")||
                            mes.equals("Agos")||
                            mes.equals("Oct")||
                            mes.equals("Dic");
        boolean tiene30dias=mes.equals("Abr")||
                            mes.equals("Jun")||
                            mes.equals("Set")||
                            mes.equals("Nov");
       
                
                
        if(tiene31dias){
            System.out.println(31 + " dias. " );
        }
        else if(tiene30dias){
            System.out.println(30 + " dias.");   
        }
        else {
            System.out.println(((añoBisiesto)? 29:28)+ " dias.");
        }
    }
    
}
