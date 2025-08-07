package section8.exerciciosFIxacao.exercicio3.application;

import section8.exerciciosFIxacao.exercicio3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Student student1 = new Student();

        student1.setName(in.nextLine());
        student1.setGrade1(in.nextDouble());
        student1.setGrade2(in.nextDouble());
        student1.setGrade3(in.nextDouble());

        System.out.printf("FINAL GRADE = %.2f\n", student1.finalGrade());
        System.out.println(student1);
    }
}
