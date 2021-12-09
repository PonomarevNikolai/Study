package Lesson6.CarAndTrack;

public class Track extends Automobile {
    private int wheals = 8;
    private int maxWeight = 5;

    public void newWheels(int wheels) {
        this.wheals = wheels;
        System.out.println("новое значение в поле «количество колес» " + wheels);
    }
    public void wealsAndWeight(){
        System.out.println("Количество колес: "+wheals);
        System.out.println("Максимальный вес: "+maxWeight);
    }

    public Track(int w, String m, char c, float s, int wheals, int maxWeight) {
        super(w, m, c, s);
        this.wheals = wheals;
        this.maxWeight=maxWeight;

    }

    public Track() {

    }

}
