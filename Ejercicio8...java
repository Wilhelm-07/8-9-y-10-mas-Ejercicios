//4.18 (Calculadora de límite de crédito) Desarrolle una aplicación en Java que determine si alguno de los 
// clientes de una tienda de departamentos se ha excedido del límite de crédito en una cuenta. Para cada 
// cliente se tienen los siguientes datos: a) el número de cuenta. b) el saldo al inicio del mes. 
// c) el total de todos los artículos cargados por el cliente en el mes. d) el total de todos los créditos 
// aplicados a la cuenta del cliente en el mes. e) el límite de crédito permitido. El programa debe recibir 
// como entrada cada uno de estos datos en forma de números enteros, debe calcular el nuevo saldo 
// (=saldo inicial + cargos – créditos), mostrar el nuevo saldo y determinar si éste excede el límite de 
// crédito del cliente. Para los clientes cuyo límite de crédito sea excedido, el programa debe mostrar el 
// mensaje “Se excedio el limite de su credito”. 

import java.util.Scanner;

public class Ejercicio418

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        {     
            int cuenta = 1, saldoInicial,cargos,creditos, limiteCredito, nuevoSaldo;

            while( cuenta != 0 )
            {
                System.out.println("\n----------------------------------------------------------------------------");
                System.out.print("Numero de cuenta: ");
                cuenta = scan.nextInt();          
        
                System.out.print("Saldo al inicio del mes: ");
                saldoInicial = scan.nextInt();
              
                System.out.print("Total de los articulos cargados por el cliente en el mes: ");
                cargos = scan.nextInt();
              
                System.out.print("Total de los creditos aplicados a la cuenta del cliente en el mes: ");
                creditos = scan.nextInt();
            
                System.out.print("Limite de credito permitido: ");
                limiteCredito = scan.nextInt();
            
                //Calculo del nuevo saldo (=saldo inicial + cargos – créditos)
                nuevoSaldo = saldoInicial + cargos - creditos;
                
                System.out.println("----------------------------------------------------------------------------");      
                System.out.println("Nuevo saldo: " + nuevoSaldo);
           
                          
                if ( nuevoSaldo > limiteCredito)    
                {   
                    System.out.println("Se excedio el limite de su credito");  
                    System.out.println("----------------------------------------------------------------------------");
           
                    break; 
                }      
            }          
        }              
    }                  
}
                      