package section17.introducingSet.fixationExercise.application;

import section17.introducingSet.fixationExercise.entities.Student;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in).useLocale(Locale.US)){

            Set<Student> studentSet = new HashSet<>();

            System.out.print("How many student for course A?");
            int nStudent = in.nextInt();
            for (int i = 0; i < nStudent; i++){
                int code = in.nextInt();
                studentSet.add(new Student(code));
            }
            System.out.print("How many student for course B?");
            nStudent = in.nextInt();
            for (int i = 0; i < nStudent; i++){
                int code = in.nextInt();
                studentSet.add(new Student(code));
            }
            System.out.print("How many student for course C?");
            nStudent = in.nextInt();
            for (int i = 0; i < nStudent; i++){
                int code = in.nextInt();
                studentSet.add(new Student(code));
            }

            System.out.println("Total students: " + studentSet.size());

        }catch (InputMismatchException e){
            System.out.print("Error: the student code should be a number.");
        }


    }
}
