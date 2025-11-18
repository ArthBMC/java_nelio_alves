package section10.exerciciosDeFIxacao.ex003.util;

import section10.exerciciosDeFIxacao.ex003.entities.Person;

public class Calculator {
    public static double sumHeight;
    public static double negativeSum;
    private static int count = 0;
    public static int num;
    public static String[] minorPerson;


    public static void numberOfPeople(int n){
        num = n;
        minorPerson = new String[num];
    }
    public static void personSum (Person person){
        sumHeight += person.getHeight();
        if (person.getAge() < 16 ){
            negativeSum += 1;
            minorPerson[count] = person.getName();
        }
        count += 1;
    }

    public static double personAverage (double sum){
        return sum/count;
    }

    public static double percentage(){
        return negativeSum*100/count;
    }

    public static void minorNames() {
        for (int i = 0; i< minorPerson.length; i++) {
            if (minorPerson[i] != null) {
                System.out.println(minorPerson[i]);
            }
        }
    }


    @Override
    public String toString(){
        return "Average height "
                +String.format("%.2f\n",personAverage(sumHeight))+
                "People with less than 16 years old: "
                +String.format("%.1f%%",percentage());

        }

    }





