
import java.util.*;

/**
 *
 */
public class Professor extends Pessoa {
    private String titulacao;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void profTitulacao(String nome){
        System.out.println(nome);
        System.out.println(titulacao);
    }

}