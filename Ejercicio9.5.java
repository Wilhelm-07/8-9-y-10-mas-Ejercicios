//4.33 (Múltiplos de 2 con un ciclo infinito) Escriba una aplicación que muestre en la ventana de comandos 
//     las potencias del entero 2 (es decir, 2, 4, 8, 16, 32, 64, etcétera). Su ciclo no debe terminar 
//     (es decir, debe crear un ciclo infinito). ¿Qué ocurre cuando ejecuta este programa? 

import java.util.Scanner;

public class Ejercicio433

{ 
    public void Imprime()
    { 
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nEste programa imprime todos los multiplos de 2 con un ciclo infinito.\n");
        int i = 1;

        while( i > 0)
        { 
            System.out.printf("\n%d", 2*i++);
        } 

    } 

} 