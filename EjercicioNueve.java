import java.util.Arrays;
import java.util.Scanner;

public class EjercicioNueve {
    
    public static void main(String[] args) {
        
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        int[] array = new int[num];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random()*10) * 10);
        }
        
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[num];

        for (int i = num - 1; i >= 0; i--) {
            array2[(num - 1) - i] = array[i];
        }

        System.out.println(Arrays.toString(array2));

        sc.close();

    }

}
