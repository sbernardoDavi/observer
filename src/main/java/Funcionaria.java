import java.util.Observable;
import java.util.Observer;

public class Funcionaria implements Observer{
    public String nome;

    public String ultimaVenda;

    public Funcionaria(String nome){
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimaVenda() {
        return ultimaVenda;
    }

    public void setUltimaVenda(String ultimaVenda) {
        this.ultimaVenda = ultimaVenda;
    }

    public void vender(Loja loja){
        loja.addObserver(this);

    }

    public void update(Observable loja, Object arg1) {
        this.ultimaVenda = this.nome + ", venda feita na " + loja.toString();
    }



}
