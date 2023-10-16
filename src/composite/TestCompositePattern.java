package composite;

public class TestCompositePattern {
    public static void main(String[] args) {
        Forma tri = new Triangulo();
        Forma tri1 = new Triangulo();
        Forma cir = new Circulo();

        Desenho desenhando = new Desenho();
        desenhando.add(tri);
        desenhando.add(tri1);
        desenhando.add(cir);

        System.out.println("============================");

        desenhando.desenho("Vermelho");

        System.out.println("============================");

        desenhando.clear();

        System.out.println("============================");

        desenhando.add(tri);
        desenhando.add(cir);
        desenhando.desenho("Verde");

    }
}
