/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author 503
 */
public class Ejercicio1 {
    
    public static void main(String []args){
        
        /*1. Realice las siguientes operaciones: */
        
         /* 3+8*5-6/3 */
        int rtdo1=(((3+8)*(5-6))/3);
        System.out.println("El resultado de: 3+8*5-6/3 es: " + rtdo1);
        System.out.println("----------------------------------------");
        
        /* 2.5*2*3-4/2+8 */
        double rtdo2=(((2.5*2)*(3-4))/(2+8));
        System.out.println("El resultado de: 2.5*2*3-4/2+8​ es: " + rtdo2);
        System.out.println("----------------------------------------");
        
        /* 2*(6-2.5)/3 */
        double rtdo3=((2*(6-2.5))/3);
        System.out.println("El resultado de: 2*(6-2.5)/3​ es: " + rtdo3);
        System.out.println("----------------------------------------");
        
        /* 25>18 */
        boolean mayor= 25>18;
        System.out.println("¿Es mayor: 25>18?: " + mayor);
        System.out.println("----------------------------------------");
        
        /* 3+2.5*4/3 != 4*5.2-3.8 */
        double ope1= ((3+2.5)*(4/3));
        System.out.println("El resultado de: 3+2.5*4/3 es: " + ope1);
        double ope2= ((4*5.2)-3.8);
        System.out.println("El resultado de: 4*5.2-3.8 es: " + ope2);
        boolean diferente= ope1 != ope2;
        System.out.println("¿Son diferentes?: " + diferente);
        System.out.println("----------------------------------------");
        
        /* (8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2) */
        double ope3= (((8.5/3.2)+(6.5-2.3))*(5/6)); 
        System.out.println("El resultado de: 8.5/3.2+6.5-2.3*5/6 es: " + ope3);
        boolean mayorIgual= ope3 >= 15.8;
        System.out.println(ope3 + " ¿Es mayor o igual a: 15.8?: " + mayorIgual);
        double ope4= ((81/4)+2);
        System.out.println("El resultado de: 81/4+2 es: " + ope4);
        boolean menor = 21.4 < ope4;
        System.out.println("¿21.4 es menor que: " + ope4 + "?: " +  menor);
        boolean y= mayorIgual && menor;
        System.out.println(mayorIgual + " && " + menor + " es: " + y);
        System.out.println("----------------------------------------");
    }
    
    
    
}
