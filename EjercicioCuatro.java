import java.util.Scanner;

public class EjercicioCuatro {
    
    public static void main(String[] args) {
        
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
        
        sc.close();

    }

}
