package br.edu.ifro.projeto1.formasgeometricas;

public class Retangulo {
    // Atributos
    double base;
    double altura;
    double area;
    double perimetro;

    // Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos próprios
    void calcularArea() {
        this.area = base * altura;
    }

    void calcularPerimetro() {
        this.perimetro = 2 * (base + altura);
    }

    void imprimir() {
        System.out.println("=== Retângulo ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("----------------------------");
    }
}