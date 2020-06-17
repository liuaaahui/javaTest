package model;

public class Student {

    private String name;
    private int age;
    // true:female  false:male
    private boolean gender;
    private int idNumber;

    public Student(String name, int age, boolean gender, int idNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}