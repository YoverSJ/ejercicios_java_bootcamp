package EjercicioOnce;

public class Figura {
    
    private String color;
    private boolean estaLleno;

    public Figura(String color, boolean estaLleno) {
        this.color = color;
        this.estaLleno = estaLleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstaLleno() {
        return estaLleno;
    }

    public void setEstaLleno(boolean estaLleno) {
        this.estaLleno = estaLleno;
    }

    public String laFiguraEstaLleno(){
        if (estaLleno) {
            return "La figura tiene color " + color;
            
        } else {
            return "La figura no tiene color";
        }
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }
    
}
