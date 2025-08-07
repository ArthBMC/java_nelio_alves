package section8.exercicioTrianguloComPoo.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

public double calculoArea (){
        double perimetro = (a + b + c) / 2;

        double area = Math.sqrt(perimetro * (perimetro - a) * (perimetro - b) * (perimetro - c));

        System.out.printf("Area do triangulo 1: %.4f \n", area);

        return area;
    }
}
