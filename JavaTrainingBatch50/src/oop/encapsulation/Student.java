package oop.encapsulation;

//encapsulated class
public class Student {

    //hidden or private data members
    private String name;
    private int age;
    private int id = 12345;
    private String email;
    private char gender;
    private int level;

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
