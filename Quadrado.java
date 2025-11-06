package br.edu.ifro.projeto1.formasgeometricas;

public class Quadrado {
    // Atributos
    double lado;
    double area;
    double perimetro;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos próprios
    void calcularArea() {
        this.area = lado * lado;
    }

    void calcularPerimetro() {
        this.perimetro = lado * 4;
    }

    void imprimir() {
        System.out.println("=== Quadrado ===");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("----------------------------");
    }
}