package section15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBufferedReader {
    public static void main(String[] args) {

        String path = "/home/arth/Documentos/Java-Nelio/Arquivo de teste para leitura.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine(); //lê 1 linha do arquivo, se estiver em branco retorna null

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.print("Error: "+e.getMessage());
        }
        finally {
           try {
               if (br != null) {
                   br.close();
               }
               if (fr != null) {
                   fr.close();
               }
           }catch (IOException e){
               e.getStackTrace();
           }
        }



    }
}
