package section15;

import java.io.File;
import java.util.Scanner;

public class ManipulatingFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String srtPath = in.nextLine();

        File path = new File (srtPath);

        File[] files = path.listFiles(File::isFile);
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders:");
        for (File folder : folders){
            System.out.println(folder);
        }
        System.out.println("\nFiles:");
        for (File file : files){
            System.out.println(file);
        }

        boolean success = new File(srtPath + "/subDirectory").mkdir();
        System.out.println("Directory created successfully: "+ success);
        in.close();
    }
}
