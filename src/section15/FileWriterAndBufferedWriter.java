package section15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String [] {"Teste Linha 1", "Teste linha 2", "Teste linha 3"};
        String path = "/home/arth/Documentos/Java-Nelio/teste FileWriter.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line+"\n ");
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }




    }
}
