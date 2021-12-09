package Lesson2;

public class Order {
    private int numOrder;
    private String nameClient;
    private int numItem;
    private String nameItem;

    //Getter and Setter

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    //Конструкторы

    public Order(){

    }

    public Order(int numOrder, String nameClient, int numItem, String nameItem){
        this.numOrder = numOrder;
        this.nameClient = nameClient;
        this.numItem = numItem;
        this.nameItem = nameItem;
    }

}
