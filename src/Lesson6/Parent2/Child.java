package Lesson6.Parent2;

import java.io.IOException;

public class Child extends Parent {

    protected static String name="null";

    public static void setName() throws IOException {
        System.out.println("Enter name: ");
        Child.name = inPutInfo();

    }

    @Override
    public void outPut() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + years);
    }
}
