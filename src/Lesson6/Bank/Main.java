package Lesson6.Bank;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Федор", "Рубцов", "Bank of America");
        Worker worker = new Worker("Bob", "Jonson", "Bank of America");

        System.out.println("Клиент: ");
        client.outInformation();

        System.out.println("Работник: ");
        worker.outInformation();
    }
}
