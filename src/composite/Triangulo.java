package composite;
public class Triangulo implements Forma{
    @Override
    public void desenho(String preencherCor) {
        System.out.println("Desenhando triângulo com a cor " + preencherCor);
    }
}
