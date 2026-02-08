package section19.fixationExercise.entities;

public class Product {
    private String name;

    private String email;

    private Double salary;
    public Product(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.email = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return email;
    }
}
