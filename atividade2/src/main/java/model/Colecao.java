package src.main.java.model;
import src.main.java.interfaces.ItemEmprestavel;

public class Colecao implements ItemEmprestavel {
    private String proprietario;
    private String qtItens;

    public Colecao(String proprietario, String qtItens) {
        this.proprietario = proprietario;
        this.qtItens = qtItens;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getItens() {
        return this.qtItens;
    }

    public void setItens(String qtItens) {
        this.qtItens = qtItens;
    }

    @Override
    public void descricao() {
        System.out.println("Proprietário: " + this.proprietario);
        System.out.println("Quantidade de Itens: : " + this.qtItens);
    }
 
}
