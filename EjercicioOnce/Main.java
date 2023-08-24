package EjercicioOnce;

public class Main {
 
    public static void main(String[] args) {
        
        System.out.println("CIRCULO");
        Figura circulo = new Circulo("rojo", true, 3);
        System.out.println(circulo.laFiguraEstaLleno());
        System.out.println("AREA: " + circulo.calcularArea());
        System.out.println("PERIMETRO: " + circulo.calcularPerimetro() + "\n");
        

        System.out.println("RECTANGULO");
        Figura rectangulo = new Rectangulo("verde", true, 4, 2);
        System.out.println(rectangulo.laFiguraEstaLleno());
        System.out.println("AREA: " + rectangulo.calcularArea());
        System.out.println("PERIMETRO: " + rectangulo.calcularPerimetro() + "\n");

        System.out.println("TRIANGULO");
        Figura triangulo = new Triangulo("azul", true, 2, 3, 4);
        System.out.println(triangulo.laFiguraEstaLleno());
        System.out.println("PERIMETRO: " + triangulo.calcularPerimetro());
        System.out.println("AREA: " + triangulo.calcularArea() + "\n");
        

    }
    
}
