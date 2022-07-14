public class Main {
    public static void main(String[] args) {

        Brasil brasil = new Brasil();
        brasil.status();
        System.out.println("O codigo iso do Pais é : " +brasil.getIso31661());
        System.out.println("Nome do Pais: " + brasil.getNome());
        System.out.println("População de: " + brasil.getPopulacao() + "habitantes");
        System.out.println("A area do Pais é de :" + brasil.getDimencaokm2() + "²");
        brasil.densidadePopulacional();
        brasil.vizinho();
    }
}
