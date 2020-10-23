/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero5cifras;
import java.util.Scanner;

/**
 *
 * @author fafafarid
 */
public class Numero5Cifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1=0;
        int digito1=0;
        int digito2=0;
        int digito3=0;
        int digito4=0;
        int digito5=0;
        
        int resultado_division1=0;
        int resultado_division2=0;
        int resultado_division3=0;
        int resultado_division4=0;
        int resultado_division5=0;
        
        numero1=LeerDatoEnterodeConsola();
        
        resultado_division1=numero1/10;
        digito1=numero1%10;
        
        resultado_division2=resultado_division1/10;
        digito2=resultado_division1%10;
        
        resultado_division3=resultado_division2/10;
        digito3=resultado_division2%10;
        
        resultado_division4=resultado_division3/10;
        digito4=resultado_division3%10;
        
        resultado_division5=resultado_division4/10;
        digito5=resultado_division4%10;
        
        System.out.printf("Primer dígito: %d", digito5);
        System.out.printf("\nPrimeros dos dígitos: %d%d", digito5,digito4);
        System.out.printf("\nPrimeros tres dígitos: %d%d%d", digito5,digito4,digito3);
        System.out.printf("\nPrimeros cuatro dígitos: %d%d%d%d", digito5,digito4,digito3,digito2);
        System.out.printf("\nNúmero completo: %d%d%d%d%d", digito5,digito4,digito3,digito2,digito1);
        System.out.println("");
    }
    
    //El propósito de este método es leer un dato de la consola
    public static int LeerDatoEnterodeConsola(){
        int numero1 = 0;
        Scanner dato = new Scanner(System.in);
        System.out.println("Digite el número de 5 cifras: ");
        numero1=dato.nextInt();
        return numero1;
    }
    
}
