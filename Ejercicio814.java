//4.26 ¿Qué es lo que imprime el siguiente programa?
// Ejercicio 4.26: Misterio3.java 2 
public class Ejercicio426 
{ 
    public static void main(String[] args) 
    { 
        int fila = 10; 

        while (fila >= 1)       
        { 
            int columna = 1; 

            while (columna <= 10) 
            { 
                System.out.print(fila % 2 == 1 ? "<" : ">"); 
                ++columna;           
            } 
            --fila; 
            System.out.println(); 
        } 
    } 
} // fin de la clase Misterio3