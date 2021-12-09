package Lesson6.Plane;

public class Plane {
    public class Wing{
        private int weight=0;

        public void setWeight(int weight) {
            this.weight = weight;
        }

      public void showWeight(){
          System.out.println("Вес крыла: " +weight);
      }
    }

}
