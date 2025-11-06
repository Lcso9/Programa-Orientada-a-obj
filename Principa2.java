

public class Principa2 {
    public static void main(String[] args) {
        System.out.println("=== ATIVIDADE 3 – Formas Geométricas 2D ===\n");

        Quadrado q = new Quadrado(5);
        q.imprimir();

        Circulo c = new Circulo(3.5);
        c.imprimir();

        Retangulo r = new Retangulo(4, 6);
        r.imprimir();

        Triangulo t = new Triangulo(4, 3, 4, 4, 4);
        t.imprimir();
    }
}