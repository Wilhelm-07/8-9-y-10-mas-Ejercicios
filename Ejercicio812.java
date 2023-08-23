//5.14 (Programa modificado del interés compuesto) o Modifique la aplicación de interés compuesto de la figura
//      5.6, repitiendo sus pasos para las tasas de interés del 5, 6, 7, 8, 9 y 10%. Use un ciclofor para 
//      variar la tasa de interés. 

public class Ejercicio514

{      
    private double monto;
    private double principal = 1000;

    public void Interes()
    {      
        for(double tasa = 0.05; tasa <= 0.1; tasa += 0.01 )
        {  
            System.out.printf("\n%s%20s", "Anio", "Monto en deposito");
            System.out.printf(" para una tasa de interes del: %.2f\n", tasa);

            for( int anio = 1; anio <= 10; anio++ )
            {  
                monto = principal * Math.pow( 1.0 + tasa, anio );
                System.out.printf("%4d%,20.2f\n", anio, monto);
            }  
        }   
    }      
}           