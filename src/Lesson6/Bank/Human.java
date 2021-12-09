package Lesson6.Bank;


public abstract class Human {
    private String firstName = "";
    private String secondName = "";

    public abstract void outInformation();

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
