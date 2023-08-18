/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author Steffany
 */
public class Ejercicio7 {
    
    public static void main(String [] args){ 

        /*7. Realice un programa que cada vez que  salga el numero 5 incremente en 1 punto la variable poder 
        y cada vez que salga 3 disminuyan la variable vida. Implemente random para obtener números aleatorios.*/
        
        int vida= 5;
        
        int poder=0;
        
        int num=0;
                  
        while (vida != 0) {
            
            num= (int) (Math.random()* 100);
            
            System.out.println("El numero aleatorio que salio es: " + num);
            
            if (num==3){
                
                vida--; 
                
                System.out.println("Le queda: " + vida + " vidas");
                
            }else if (num==5){
                
                 poder++;
                
                 System.out.println("Has ganado: " + poder + " poderes");
                 
            } 
            
        }
        
    }
    
}
