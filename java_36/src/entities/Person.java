package entities;

public class Person {

    private double height;
    private String gender;

    public Person(double height, String gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return this.height;
    }

    public String getGender() {
        return this.gender;
    }

}
