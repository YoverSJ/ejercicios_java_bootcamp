import java.util.Scanner;

public class EjercicioDos {
    
    public static void main(String[] args) {
        
        int edad = 0;
        int regalo = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese edad usuario: ");
        edad = sc.nextInt();

        System.out.print("Inserte 1 si el usuario trajo regalo; caso contrario, inserte 0: ");
        regalo = sc.nextInt();

        if (edad >= 15) {

            if (regalo == 1) {
                System.out.println("El invitado si puede ingresar a la fiesta.");
            }else {
                System.out.println("El invitado no puede ingresar a la fiesta.");
            }

        } else {
            System.out.println("El invitado si puede ingresar a la fiesta.");
        }

        sc.close();

    }

}
