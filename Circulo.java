

public class Circulo {
    // Atributos
    double raio;
    double area;
    double perimetro;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos próprios
    void calcularArea() {
        this.area = Math.PI * raio * raio;
    }

    void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * raio;
    }

    void imprimir() {
        System.out.println("=== Círculo ===");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + String.format("%.2f", area));
        System.out.println("Perímetro: " + String.format("%.2f", perimetro));
        System.out.println("----------------------------");
    }
}