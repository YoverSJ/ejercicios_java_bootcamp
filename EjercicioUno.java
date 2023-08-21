import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        

        double totalDinero = 0;
        int horasTrabajo = 0; // > 40 horas extra
        int totaHorasExtra = 0; // total de horas extra
        int horasExtraDoble = 0; // se paga el doble
        int horasExtraTriple = 0; // se paga el triple

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese horas de trabajo: ");
        horasTrabajo = sc.nextInt();
            
        totaHorasExtra = horasTrabajo - 40;
            
        totalDinero = (40 * 40);// dinero base

        if (totaHorasExtra <= 8) {
            totalDinero = totalDinero + ((totaHorasExtra * 2) * 40);
        }

        if (totaHorasExtra > 8) {
            horasExtraTriple = totaHorasExtra - 8;
            horasExtraDoble = totaHorasExtra - horasExtraTriple;
            totalDinero = totalDinero + ((horasExtraDoble * 2) * 40) + ((horasExtraTriple * 3) * 40);
        }

        System.out.println("Total dinero: " + totalDinero);

        sc.close();

    }

}