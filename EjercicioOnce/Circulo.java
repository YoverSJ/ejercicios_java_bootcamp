package EjercicioOnce;

public class Circulo extends Figura{

    private double radio;

    public Circulo(String color, boolean estaLleno, double radio) {
        super(color, estaLleno);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }


}
