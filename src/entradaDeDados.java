import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name;
        name = input.next();
        System.out.printf("Prazer em conhece-lo %s!\n", name);

        int age;
        System.out.print("Quantos anos voce tem? ");
        age = input.nextInt();
        System.out.printf("Voce tem %d anos.\n", age);

        double salario;
        System.out.print("Quanto voce recebe? ");
        salario = input.nextDouble();
        System.out.printf("Voce recebe $ %.2f. \n", salario);

        char gender;
        System.out.println("Qual seu genero? ");
        gender = input.next().charAt(0);
        System.out.println(gender);

        input.close();
    }
}
