public class Brasil extends UmPais {


    public Brasil() {
        super();
    }

    public Brasil(String iso31661, String nome, double populacao, float dimencaokm2) {
        super(iso31661, nome, populacao, dimencaokm2);
    }

    public void status() {
        this.setIso31661("BRA");
        this.setNome("Brasil");
        this.setPopulacao(200);
        this.setDimencaokm2(70);
    }



    @Override
    public double densidadePopulacional() {
        setPopulacao(500);
        setDimencaokm2(200);
        System.out.println("esse Pais possui " + getPopulacao()/ getDimencaokm2() + " Pessoa por km" );
        return 0;
    }
}
