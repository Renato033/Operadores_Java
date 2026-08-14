package flaamingo.aprendendo.introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // byte : -126 a 127
        // short : -32.762 a 32.767
        short idade = 130;
        int municipio = 114000000;
        long contaBancaria = 9999999999999999L;
        float salario = 15000.66F;
        double teste = 25000.50;
        char primeiraLetraDoNome = 'R';
        boolean vaiEstudarNasFerias = false;
        System.out.println("Minha idade é " + idade);
        System.out.print("São Paulo  (SP): mais de " + municipio + " milhões de moradores .");
        System.out.print("Minha conta bancaria daqui a 5 anos"  + contaBancaria);
    }

}
