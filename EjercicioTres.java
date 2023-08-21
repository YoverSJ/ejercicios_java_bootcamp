import java.util.Scanner;

public class EjercicioTres {
    
    public static void main(String[] args) {
        
        double pagoFijo = 0;
        int consumoAguaPotable = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrse consumo agua potable: ");
        consumoAguaPotable = sc.nextInt();

        if (consumoAguaPotable <= 50) {
            pagoFijo = 10;
        } else {

            if (consumoAguaPotable >= 51 && consumoAguaPotable <= 200) {
                pagoFijo = 10 + ((consumoAguaPotable - 50) * 0.5);
            } else {
                pagoFijo = 10 + ((consumoAguaPotable - 50) * 0.5) + ((consumoAguaPotable - 200) * 1.5);
            }
            
        }

        System.out.println("Pago fijo: " + pagoFijo);

        sc.close();

    }

}
