/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author ESTEFANIA
 */
/*Metodo A: crear cuenta, se guarda datos del usuario en un objeto*/
public class CuentaBancariaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cliente = new CuentaBancaria();
    
        System.out.println("Ingrese nro de cuenta: ");
        cliente.setNumeroCuenta(leer.nextInt());
        
        System.out.println("DNI: ");
        cliente.setDniCliente(leer.nextLong());
        
        System.out.println("Saldo actual: ");
        cliente.setSaldoActual(leer.nextDouble());
        
        return cliente;
         }
/*B*/
        public void ingresar(CuentaBancaria cliente) {
        double cantidad;
        System.out.println("cuanto quiere ingresar?");
        cantidad = leer.nextDouble();
        cliente.setSaldoActual(cliente.getSaldoActual()+cantidad);
        System.out.println("su saldo es: "+cliente.getSaldoActual());
    }
//C
    public void retirar(CuentaBancaria cliente) {
       
        System.out.println("Ingrese la cantidad a retirar");
        double cantidad = leer.nextDouble();
        if(cantidad > cliente.getSaldoActual()) {
            cliente.setSaldoActual(0);
        } else {
            cliente.setSaldoActual(cliente.getSaldoActual()-cantidad);          
        }

    }
   //D
    public void  extraccionRapida(CuentaBancaria cliente) {
      double limite = cliente.getSaldoActual()*0.2;
      
        System.out.println("cuanto quiere retirar?, maximo 20%");
        double cantidad = leer.nextDouble();
        if(cantidad < limite) {
            System.out.println("retiro realizado con exito");
            System.out.println("lo que te quedó de tu saldo es: "+(cliente.getSaldoActual()-cantidad ));
         cliente.setSaldoActual(cliente.getSaldoActual()-cantidad);
        } else {
            System.out.println("te excediste");
        }
        
    }
    //E
    public void consultarSaldo(CuentaBancaria cliente) {
        System.out.println("Tu saldo actual es: "+ cliente.getSaldoActual()); 
        
    }
    //F 
    public void consultarDatos(CuentaBancaria cliente) {
            System.out.println("Su numero de cuenta es: "+cliente.getNumeroCuenta()+"\nSu numero de dni es: "+cliente.getDniCliente()+"\nSu saldo actual es: "+cliente.getSaldoActual());
        
    }
}
    
    