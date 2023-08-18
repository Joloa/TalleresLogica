/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author 503
 */
public class Ejercicio2 {
    
    public static void main(String []args){
        
        /*2. Dados los lados de un rectángulo , calcular e imprimir el área y el perímetro.
        Datos: base y altura
        Realice el diagrama de flujo, el seudocódigo y el programa correspondiente a la solución de este problema. Pruebe la solución con un conjunto de datos adecuado.*/
        
        int base=20;
        int altura=10;
        int area= base*altura;
        int perimetro= (base*2)+(altura*2);
        System.out.println("El área es: " + area + "\nEl perímetro es: " + perimetro);

    }
    
}
