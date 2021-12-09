package Lesson6.Plane2;

public class Main {
    public static void main(String[] args) {
        Plane plane=new Plane();
        plane.leftWing.setWeight(10);
        plane.rightWing.setWeight(20);
        plane.leftWing.showWeight();
        plane.rightWing.showWeight();
        Plane plane2=new Plane();
        plane2.leftWing.setWeight(11);
        plane2.rightWing.setWeight(21);
        plane2.leftWing.showWeight();
        plane2.rightWing.showWeight();


    }
}
