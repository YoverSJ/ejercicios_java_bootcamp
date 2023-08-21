import java.util.Scanner;

public class EjercicioSeis {
    
    public static void main(String[] args) {
        
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
            
        }
        
        sc.close();

    }

}
