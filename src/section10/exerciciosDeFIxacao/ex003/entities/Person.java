package section10.exerciciosDeFIxacao.ex003.entities;

public class Person {
    private String name;
    private int age;
    private double height;


    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight (){
        return this.height;
    }

    public String getName (){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
