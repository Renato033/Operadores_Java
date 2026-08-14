package flaamingo.aprendendo.basic;

public class operadoresParte03 {

    public static void main(String[] args) {
        /*
        tem que ter uma das opcões desejadas
         */

        byt idade = 20;
        boolean isCNH = true;

        boolean isEstaNaLeiParaDirigir = idade >= 18 && isCNH == true;

        System.out.println(isEstaNaLeiParaDirigir);
    }
}
