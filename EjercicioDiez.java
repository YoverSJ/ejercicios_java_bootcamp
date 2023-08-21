import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int intentos = 0;
        int aleatorio = (int)((Math.random()* 10) * 10);

        do {

            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();

            if (num > aleatorio) {
                System.out.println("Número demasiado alto, intenta nuevamente.");
            } else {
                System.out.println("Número demasiado bajo, intenta nuevamente.");
            }

            intentos++;

        } while (num != aleatorio);

        System.out.println("Felicidades haz adivinado el numero " + aleatorio + " en " + intentos + " intentos");

        sc.close();
        
    }
    
}
