import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        int idade = 2; //concatenacao "%d""
        System.out.println(idade);
        double x = 10.23522;
        System.out.printf("%.2f%n", x); //o printf serve para formatação de varíaveis, %n é quebra de linha
        System.out.println("abc");
        Locale.setDefault(Locale.US); //serve para trocar a localidade do sistema, ou seja agora vai puxar um ponto ao inves de virgula
        System.out.printf("Meu piru está coçando %.2f\n", x); //é possivel concatenar igual em C, usando %f
        System.out.printf("%.2f%n", x); //o printf serve para formatação de varíaveis, %n é quebra de linha

        String nome = "Maria"; //concatenacao "%s""
        double renda = 1650.50; //concatencao "%f"

        System.out.printf("A pessoa %s com idade igual a %d recebe o salario %.2f", nome, idade, renda);
    }
}
