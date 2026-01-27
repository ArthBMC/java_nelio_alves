package section17.equalsAndHashCode.hashcodePersonalizado.application;

import section17.equalsAndHashCode.hashcodePersonalizado.entities.Client;

public class Program {
    public static void main(String[] args) {


        Client c1 = new Client("Pedro", "pedro@gmail.com");
        Client c2 = new Client("Pedro", "pedro@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

    }
}
