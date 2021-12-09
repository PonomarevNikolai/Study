package Lesson6.Bank;

public class Client extends Human {
    private String nameOfBank = "";

    public Client(String firstName, String secondName, String nameOfBank) {
        super(firstName, secondName);
        this.nameOfBank = nameOfBank;
    }
    public void outInformation(){
        System.out.println("Имя: " + super.getFirstName());
        System.out.println("Фамилия: "+super.getSecondName());
        System.out.println("Название банка: " + nameOfBank);
    }
}
