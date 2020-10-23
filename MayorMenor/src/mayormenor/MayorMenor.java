/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;
import java.util.Scanner; 
/**
 *
 * @author fafafarid
 */
public class MayorMenor {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Primer número:");
        int n1=scn.nextInt();
        System.out.println("Segundo número:");
        int n2=scn.nextInt();
        System.out.println("Tercer número:");
        int n3=scn.nextInt();
        System.out.println("Cuarto número:");
        
        int mayor=n1;
        int menor=n1;
        
        if (mayor<n2){
            mayor=n2;
        }
        if (mayor<n3){
            mayor=n3;
        }
        
        if (menor>n2){
            menor=n2;
        }
        if (menor>n3){
            menor=n3;
        }
        
        System.out.println("El número mayor es: "+mayor);
        System.out.println("El número menor es: "+menor);
        
    }
    
}
