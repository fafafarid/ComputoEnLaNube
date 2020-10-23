/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromes;
import java.util.Scanner;

/**
 *
 * @author fafafarid
 */
public class NumeroMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner scn=new Scanner(System.in);
        System.out.println("Digite un número del 1 al 12: ");
        int digito=scn.nextInt();
        mes=digito;
        if (mes==1)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de ENERO");
        if (mes==2)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de FEBRERO");
        if (mes==3)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de MARZO");
        if (mes==4)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de ABRIL");
        if (mes==5)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de MAYO");
        if (mes==6)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de JUNIO");
        if (mes==7)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de JULIO");
        if (mes==8)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de AGOSTO");
        if (mes==9)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de SEPTIEMBRE");
        if (mes==10)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de OCTURBRE");
        if (mes==11)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de NOVIEMBRE");
        if (mes==12)
            System.out.printf ("\nEl número " +mes +" corresponde al mes de DICIEMBRE");
        System.out.printf ("\n");
    }
    
}
