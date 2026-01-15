package section15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        String path = "/home/arth/Documentos/Java-Nelio/Arquivo de teste para leitura.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine(); //lê 1 linha do arquivo, se estiver em branco retorna null

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.print("Error: "+e.getMessage());
        }

    }
}
