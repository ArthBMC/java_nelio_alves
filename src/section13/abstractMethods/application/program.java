package section13.abstractMethods.application;

import section13.abstractMethods.entities.Circle;
import section13.abstractMethods.entities.Color;
import section13.abstractMethods.entities.Rectangle;
import section13.abstractMethods.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the number of shapes: ");
        int n = in.nextInt();
        in.nextLine();

        List<Shape> list = new ArrayList<>();
        for (int i = 0; i<n; i++){
            System.out.println("Shape #"+(i+1)+" data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char rorc = in.next().charAt(0);
            in.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(in.nextLine());
            if (rorc == 'r'){
                System.out.print("Width: ");
                Double width = in.nextDouble();
                System.out.print("Height: ");
                Double height = in.nextDouble();
                Rectangle rectangle = new Rectangle(color, width, height);
                list.add(rectangle);
            } else if (rorc == 'c'){
                System.out.print("Radius: ");
                Double radius = in.nextDouble();
                Circle circle = new Circle(radius, color);
                list.add(circle);
            }
        }
        System.out.println("SHAPE AREAS:");
        for (Shape s: list){
            System.out.printf("%.2f%n", s.area());
        }

    }
}
