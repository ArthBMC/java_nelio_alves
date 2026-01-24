package section17.delimetedGenerics.application;

import section17.delimetedGenerics.entities.Product;
import section17.delimetedGenerics.services.CalculationService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        File path = new File("/home/arth/Documentos/Java-Nelio/Arquivo de teste para leitura.txt");

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(x);

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
