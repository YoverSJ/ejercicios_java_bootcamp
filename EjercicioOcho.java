import java.util.Arrays;
import java.util.Scanner;

public class EjercicioOcho {
    
    public static void main(String[] args) {
        
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        int[] array = new int[num];
        
        for (int i = 0; i < num; i++) {
            
            array[i] = (int)((Math.random() * 10) * 10);
            
        }

        System.out.println(Arrays.toString(array));
        
        System.out.println("El numero mayor es: " + Arrays.stream(array).max().getAsInt());
        
        sc.close();

    }

}
