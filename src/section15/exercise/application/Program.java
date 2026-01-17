package section15.exercise.application;

import section15.exercise.entities.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Enter the path: ");
        String strPath = in.nextLine();

        File path = new File(strPath);

        List<Products> listProducts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line;
            while((line = br.readLine()) != null){
                String[] parts = line.split(",");
                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                Products product = new Products(name, price, quantity);
                product.totalValue();
                listProducts.add(product);
            }
            
            boolean success = new File (path.getParent() + "/out").mkdir();
            String nPath = path.getParent() + "/out/summary.csv";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(nPath))){
                for (Products list : listProducts){
                    bw.write(list.getName() + "," + String.format(Locale.US,"%.2f",list.getTotal()));
                    bw.newLine();
                }

                System.out.println(nPath + " Created!");

            }catch (IOException e){
                System.out.println("Error writing the file: " + e.getMessage());
            }

        }catch (IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }

        in.close();
    }
}
