package Lesson6.Plane;

public class Main {
    public static void main(String[] args) {
        Plane plane=new Plane();
        Plane.Wing wing1=plane.new Wing();
        Plane.Wing wing2=plane.new Wing();
        wing1.setWeight(10);
        wing2.setWeight(20);
        wing1.showWeight();
        wing2.showWeight();

    }
}
