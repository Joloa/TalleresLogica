/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author 503
 */
public class Ejercicio3 {
    
    public static void main(String []args){
        
        /*3. Considere que se dispone de la producción de carbón ( en toneladas) de los últimos 12 meses. Con estos datos se quiere calcular e imprimir el promedio anual de toneladas.
            Datos: podCarbon1, podCarbon2…podCarbon12.
            Realice el diagrama de flujo y el programa correspondiente. Pruebe con un conjunto de datos adecuados.*/

        /*FORMA1*/
        
            int podCarbon1=50;
            int podCarbon2=75;
            int podCarbon3=45;
            int podCarbon4=30;
            int podCarbon5=53;
            int podCarbon6=60;
            int podCarbon7=58;
            int podCarbon8=59;
            int podCarbon9=76;
            int podCarbon10=42;
            int podCarbon11=49;
            int podCarbon12=51;
                        
            int promedio= ((podCarbon1+podCarbon2+podCarbon3+podCarbon4+podCarbon5+podCarbon6+podCarbon7+podCarbon8+podCarbon9+podCarbon10+podCarbon11+podCarbon12)/12);
            
            System.out.println("El promedio anual de la producción del carbón es: " + promedio);
            
        
        /* FORMA2 ARRAY*/
        
            int [] podCarbon = {50, 75, 45, 30, 53, 60, 58, 59, 76, 42, 49, 51};
                 
            int size= podCarbon.length;
            int promedio1= (podCarbon[0]+podCarbon[1]+podCarbon[2]+podCarbon[3]+podCarbon[4]+podCarbon[5]+podCarbon[6]+
            podCarbon[7]+podCarbon[8]+podCarbon[9]+podCarbon[10]+podCarbon[11])/12;
            
            System.out.println("La cantidad de meses de la producción son: " + size);
            System.out.println("El promedio anual de la producción de carbón es: lo " + promedio1);
            
        
    }
    
}
