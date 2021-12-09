package Lesson6.Parent2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parent {
    protected static Integer years = 0;

    public static String inPutInfo() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public void setYears() {
        System.out.println("Enter years: ");
        try {
            this.years = Integer.parseInt(inPutInfo());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void outPut() {
        System.out.println("Возраст: " +years);
    }
}
