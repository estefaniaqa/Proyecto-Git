/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia8;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;
import java.util.Scanner;


/**
 *
 * @author ESTEFANIA
 */
public class Ejercicio1Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       byte opcion;
        CuentaBancariaServicios ServicioCuenta = new CuentaBancariaServicios();
        CuentaBancaria cuenta = ServicioCuenta.crearCuenta();
       
        do {            
            System.out.println("Ingrese la opcion deseada: \n1-Ingresar dinero \n2-Retirar dinero \n3-Extraccion rapida \n4-Consultar saldo \n5-Consultar datos \n6-SALIR");
           opcion = leer.nextByte();
           switch(opcion){
               case 1: ServicioCuenta.ingresar(cuenta);break;
               case 2: ServicioCuenta.retirar(cuenta);break;
               case 3: ServicioCuenta.extraccionRapida(cuenta);break;
               case 4: ServicioCuenta.consultarSaldo(cuenta);break;
               case 5: ServicioCuenta.consultarDatos(cuenta);break;
               case 6: System.out.println("ADIOS");break;
               default: System.out.println("Opcion incorrecta, vuelva a intentar");break;
               
               
           }
         
        } while (opcion!=6);
    }
    
}
