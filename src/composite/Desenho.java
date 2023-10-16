package composite;

import java.util.ArrayList;
import java.util.List;

public class Desenho implements Forma{
    //coleção de formas
    private List<Forma> formas = new ArrayList<Forma>();
    @Override
    public void desenho(String preencherCor) {
        for(Forma frm : formas)
        {
            frm.desenho(preencherCor);
        }
    }
    //adicionando forma ao desenho
    public void add(Forma f){
        this.formas.add(f);
    }
    //removendo forma do desenho
    public void remove (Forma f){
        formas.remove(f);
    }
    //removendo todas as formas do desenho
    public void clear(){
        System.out.println("Limpando todas as formas do desenho");
        this.formas.clear();
    }
}
