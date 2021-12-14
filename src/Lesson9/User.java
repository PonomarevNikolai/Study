package Lesson9;

public class User {
    private  String name="";

    public  String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
