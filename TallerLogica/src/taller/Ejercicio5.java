/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author Steffany
 */
import java.util.Scanner;

public class Ejercicio5 {
    
    static Scanner leer = new Scanner(System.in);
    
    static double saldo= 1160000;
    
    static int opc;
    
    static int banco;
    
    static int fund;
    
    static double dcto;
    
    static boolean salir;
    
    
    
    public static void main(String []args){        
        
    /*5. Escriba un programa que le permita a un cliente de un banco navegar con distintas opcines , 
        dependiendo de la transacción que requiera:​

            Consultar saldo​

            Realizar transferencia ​

            Cambiar clave​

            Bloquear producto​

            Realizar donación}*/
       
    
        do {
            menu();
        }while (salir == false);     
        
          
               
    }
    
    public static void menu(){
    
        System.out.println("------------------------");
        System.out.println("Bienvenido a su banco!\nPara comenzar digite la opcion de la operacion que desea realizar:\n "
        + "1. Consultar saldo\n 2. Realizar transferencia\n 3. Cambiar clave\n 4. Bloquear producto\n 5. Realizar donacion\n 6. Salir\n");
        opc = leer.nextInt();
        
        switch (opc){
            
            case 1: 
                System.out.println("Su saldo actual es: " + saldo);
                
                break;
                
            case 2:
                System.out.println("Los bancos con los que tenemos convenio para realizar transferencias son:\n 1. Banquito\n"
                + " 2. Para la Gente\n 3. Money Cash\n 4. Banco Efectivo\n 5. Volver al menu principal\n 6. Salir\n Digite una opcion:");
                    banco = leer.nextInt();
                    if(banco >=1 && banco<=4){
                        System.out.println("Ingrese el número de cuenta del producto al que desea transferir:");
                        int prod=leer.nextInt();
                          
                        System.out.println("Ingrese el valor a transferir");
                        double dcto = leer.nextDouble();
                            if (dcto >=10000 && dcto <=saldo){
                                System.out.println("La transferencia se realizo exitosamente. Su nuevo saldo es: " + nuevoSaldo(dcto));                                                       
                            }else if (dcto <10000 && dcto <=saldo){
                                System.out.println("El valor minimo para transferir son 10000. Vuelva a intentarlo");                  
                            }else{
                                System.out.println("No tiene saldo disponible. Ingrese otro valor");
                            }
                    }else if(banco == 5){
                        salir=false;    
                    }else if(banco == 6){
                        System.out.println("Hasta luego.");
                        salir=true;                    
                    }else{System.out.println("Opcion no valida. Vuelva a intentarlo");                       
                    }
                break;
                
            case 3:
                System.out.println("Ingrese la contraseña anterior");
                int cont=leer.nextInt();
                System.out.println("Ingrese la nueva contraseña");
                int contNue=leer.nextInt();
                    if (cont !=contNue){
                        System.out.println("El cambio se realizo exitosamente");                       
                    }else {
                        System.out.println("Las contraseñas son iguales, no se pudo realizar el cambio");                    
                    }
                break;
                
            case 4:
                System.out.println("Ingrese el numero de cuenta del producto que desea bloquear");
                long prod=leer.nextLong();
                System.out.println("Ingrese de nuevo el numero de cuenta del producto que desea bloquear");
                long prod2=leer.nextLong();
                    if(prod == prod2) {
                        System.out.println("El número de cuenta " + prod + " fue bloqueado exitosamente");
                    }else{
                        System.out.println("Los numeros de cuenta no coinciden, no se efectuo el bloqueo. Valide nuevamente.");
                    }               
                break;
                            
            case 5:
                System.out.println("Las fundaciones con las que tenemos convenio para donaciones son:\n 1. Huellitas con amor\n 2. Mujeres empoderadas\n"
                + " 3. Hombres engañados y abandonados\n 4. Rescatando animalitos\n 5. Amor es amor LGBTIQ+\n 6. Volver al menu principal\n 7. Salir\n Digite una opcion: ");
                    fund = leer.nextInt();
                    if (fund >=1 && fund<=5){
                        System.out.println("Digite el valor que desea donar");
                        dcto = leer.nextDouble();
                            if (dcto >=10000 && dcto <=saldo){
                                System.out.println("La donacion se realizo exitosamente. Su nuevo saldo es: " + nuevoSaldo(dcto));                           
                            }else if (dcto <10000 && dcto <=saldo){
                                System.out.println("El valor minimo para donar son 10000. Vuelva a intentarlo");
                            }else{
                                System.out.println("No tiene saldo disponible. Ingrese otro valor");
                            }        
                    }else if(fund == 6){
                        salir=false;         
                    }else if(fund == 7){
                        System.out.println("Hasta luego.");
                        salir=true;
                    }else{
                        System.out.println("Opcion no valida. Vuelva a intentarlo");        
                    }
                break;
                
            case 6: 
                System.out.println("Hasta luego.");
                salir=true;
                break;
                
            default:
                System.out.println("Digite una opción válida");
                
        }   
    
    }    
    
    public static double nuevoSaldo(double dcto){
        
        double saldoNuevo= saldo - dcto;
        
        saldo= saldoNuevo;
        
        return saldoNuevo;
        
        
        
    }
    
}
