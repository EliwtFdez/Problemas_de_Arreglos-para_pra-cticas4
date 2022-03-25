import java.util.Scanner;

/*

Se tiene un Arreglo de “N” posiciones que almacenará datos enteros (positivos y negativos) 
y se debe hacer lo siguiente:

 Que calcule la suma total.
 Que calcule el producto total. 
 Que calcule la diferencia total.


*/

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int [] ArrayN = new int [5];

        int i,suma = 0, multiplicacion = 1;
   

        for ( i = 0; i < ArrayN.length; i++)
        {
        System.out.println("Ingrese datos:   ");
        ArrayN [i] = teclado.nextInt();
        }

        for ( i = 0; i< ArrayN.length; i++) 
        {
            suma = suma + ArrayN[i];
            multiplicacion = multiplicacion * ArrayN [i];
        }

        int diferencia = ArrayN[0];
        for (i = 1; i < ArrayN.length; i++)
        {
         diferencia = diferencia - ArrayN[i];
        }

        System.out.println("\n");
        System.out.println("La suma total:  ---->"+suma);
        System.out.println("La producto total:  ---->"+multiplicacion);
        System.out.println("La diferencia total:  ---->"+diferencia);

    }
}
