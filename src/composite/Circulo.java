package composite;

public class Circulo implements Forma {
    @Override
    public void desenho(String preencherCor) {
        System.out.println("Desenhando círculo com a cor " + preencherCor);
    }
}
