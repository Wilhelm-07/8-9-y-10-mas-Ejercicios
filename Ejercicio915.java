//5.24 (Programa para imprimir rombos) s Escriba una aplicación que imprima la siguiente figura de rombo. 
//     Puede utilizar instrucciones de salida que impriman un solo asterisco (*), un solo espacio o un solo 
//     carácter de nueva línea. Maximice el uso de la repetición (con instruccionesforanidadas), y minimice 
//     el número de instrucciones de salida.

public class Ejercicio524

{         
    private int extension = 9;

    public void Imprime()
    {    
        
        for ( int i = 1; i <= ((extension/2) + 1); i ++ )
        {   
                
            for ( int  k = 1; k <= extension / 2 - i + 1; k++ )
            System.out.printf(" ");
                                        
            for ( int j = (extension / 2) - i + 2; j <= (extension / 2) + i; j++ )  
            System.out.printf("*");
            System.out.printf("\n"); 
            
        }   

        for ( int l = 1; l <= extension / 2; l++ )
        {    
        
            for( int m = 1; m <= l; m++ )
            {   
                System.out.printf(" "); 
            }     

            for (int n = l + 1; n <= extension - l  ; n++)
            System.out.printf("*");

                
            System.out.println();
        }    

    }   
}      