/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Steffany
 */
public class Ejercicio4 {
    
    public static void main(String []args){
        
        /*4. En una concesionaria automotriz se tiene información sobre las ventas realizadas a lo largo del ultimo mes. 
        Se conoce el total de las ventas y el precio de venta de cada unidad. 
        También se conoce que la concecionaria paga una comisión a sus vendedores de acuerdo con el precio de la unidad.​

        Si el precio <= 100000, la comisión es del 1.5%​

        Si precio > 100000 y precio <= 250000, la comisión es del 1.8%​

        Si precio > 250000 , la comisión es del 2.3%​    ​

        Datos :​        ​

        n= numero de automóviles vendidos​

        Precio: es el precio de la venta i (1<= i <= n) y precio > 0.​        ​

        Realice un diagrama de flujo y escriba el programa que resuelva el problema. 
        De ser necesario pruebe la solución con un conjunto de datos adecuados.​*/
        
        Scanner leer= new Scanner (System.in);
        
        int n=25;
        
        int precio;       
        
        int i=0; 
        
        while (i<=25){
            
            i++;
             
        System.out.println("Ingrese el precio de la venta realizada");
        precio = leer.nextInt();
        double comision= ((precio*1.5)/100);
        double comision1= ((precio*1.8)/100);
        double comision2= ((precio*2.3)/100);
        
        
            if (precio <= 100000){
                System.out.println("La comisión de la venta # " + i + " será de: $" + comision);
                System.out.println("---------------------------------------------");
            }else if (precio > 100000 && precio <= 250000){
                System.out.println("La comisión de la venta # " + i + " será de: $" + comision1);
                System.out.println("---------------------------------------------");
            }else if (precio > 250000){
                System.out.println("La comisión de la venta # " + i + " será de: $" + comision2);
                System.out.println("---------------------------------------------");
            }else{
                System.out.println("Ingrese un valor válido");
            }              
        
        }
        
    }
    
}
    

