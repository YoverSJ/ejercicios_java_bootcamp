import java.util.Scanner;

public class EjercicioSiete {
    
    public static void main(String[] args) {
        
        int num = 0;
        int res = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        if (num == 0) {
            res = 1;
        } else {

            for (int i = 1; i <= num; i++) {
                res = res * i;
            }

        }

        System.out.println("El resultado es: " + res);

        sc.close();

    }
    
}
