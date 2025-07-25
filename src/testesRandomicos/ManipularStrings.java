package testesRandomicos;

public class ManipularStrings {
    public static void main(String[] args) {
        String nome = "Arthur Barbosa ";

        String lowerCase = nome.toLowerCase(); //minusculo
        String upperCase = nome.toUpperCase(); //maiusculo
        String withoutSpace = nome.trim(); //tira os espaços dos cantos da String
        String substring = nome.substring(2); //aqui ele começa a ser escrito a partir de uma delimitação
        String substringLimit = nome.substring(2, 9); //aqui tem a mesma delimitação da linha de cima, porem é a partir e até.
        String replace = nome.replace('a', 'y'); //aqui ele troca todos os "a" por "y" (igual o substituir do excel)
        int i = nome.indexOf("a");
        int j = nome.lastIndexOf("a");

        String[] vetor = nome.split(" "); //usa o espaço em branco como separador (pode ser qualquer coisa)


        System.out.println("Original: -" + nome + "-");
        System.out.println("Minusculo: -" + lowerCase + "-");
        System.out.println("Maiusculo: -" + upperCase + "-");
        System.out.println("Sem espaço: -" + withoutSpace + "-");
        System.out.println("A partir de 'r': -" + substring + "-");
        System.out.println("A partir de 'r': -" + substringLimit + "- até 'B'");
        System.out.println("Substituir 'a' por 'y': -" + replace + "-" );
        System.out.println("Primeira aparição: -"+ i + "- última aparição: -" + j);
        System.out.println("Palavra 1: -"+ vetor[0]);
        System.out.println("Palavra 2: -"+ vetor[1]);

    }


}
