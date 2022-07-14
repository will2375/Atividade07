import java.util.ArrayList;
import java.util.List;

public class UmPais {
    private String iso31661;
    private String nome;
    private double populacao;
    private float dimencaokm2;


    public UmPais(String iso31661, String nome, double populacao, float dimencaokm2) {
        this.iso31661 = iso31661;
        this.nome = nome;
        this.populacao = populacao;
        this.dimencaokm2 = dimencaokm2;
    }

    public UmPais() {

    }


    public String getIso31661() {
        return iso31661;
    }

    public void setIso31661(String iso31661) {
        this.iso31661 = iso31661;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public float getDimencaokm2() {
        return dimencaokm2;
    }

    public void setDimencaokm2(float dimencaokm2) {
        this.dimencaokm2 = dimencaokm2;
    }


    public double densidadePopulacional() {
        return 0;
    }

}
