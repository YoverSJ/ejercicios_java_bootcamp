import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10 * 100);
            System.out.println("El elemento " + i + " es: " + array[i]);
        }
        
        sc.close();

    }

}
