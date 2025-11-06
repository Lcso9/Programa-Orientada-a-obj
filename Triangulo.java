package br.edu.ifro.projeto1.formasgeometricas;

public class Triangulo {
    // Atributos
    double base;
    double altura;
    double lado1, lado2, lado3;
    double area;
    double perimetro;

    // Construtor
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos próprios
    void calcularArea() {
        this.area = (base * altura) / 2;
    }

    void calcularPerimetro() {
        this.perimetro = lado1 + lado2 + lado3;
    }

    void imprimir() {
        System.out.println("=== Triângulo ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("----------------------------");
    }
}