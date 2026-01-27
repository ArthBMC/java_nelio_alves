package section17.equalsAndHashCode.introducing;

public class Program {
    public static void main(String[] args) {

        String a = "FB"; //exemplo de colisão de hash
        String b = "Ea"; //exemplo de colisão de hash

        System.out.println(a.equals(b)); //serve para comparar se os dois são iguais, retorna boolean

        System.out.println(a.hashCode()); // retorna a String convertida para hashcode
        System.out.println(b.hashCode());



    }
}
