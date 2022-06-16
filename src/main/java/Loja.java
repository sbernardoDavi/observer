import java.util.Observable;

public class Loja extends Observable {

    private String nomeLoja;
    private String cidade;
    private String endereco;
    private Integer numero;

    public Loja(String nomeLoja, String cidade, String endereco, Integer numero) {
        this.nomeLoja = nomeLoja;
        this.cidade = cidade;
        this.endereco = endereco;
        this.numero = numero;
    }

    public void efetuarVenda(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Loja{" +
                "Nome=" + nomeLoja +
                ", Cidade=" + cidade +
                ", Endereco='" + endereco + '\'' +
                ", Numero='" + numero + '\'' +
                '}';
    }
}
