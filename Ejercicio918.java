//5.28 Describa, en general, cómo eliminaría las instrucciones continue de un ciclo en un programa, 
//     para reemplazarlas con uno de sus equivalentes estructurados. Use la técnica que desarrolló 
//     aquí para eliminar la instrucción continue del programa de la figura 5.14. 

public class Ejercicio528

{      
    public static void main(String args[])
    {      
        int cuenta;
        int centinela = 0;

        for ( cuenta = 1; cuenta <= 10 && 0 == centinela; cuenta++ )
        {   
            if ( cuenta == 5 )  
            centinela = 1;
        }   

        System.out.printf("\nSe uso centinela para omitir imprimir %d\n", cuenta );

    }      
}     

