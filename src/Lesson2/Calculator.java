package Lesson2;

public class Calculator {

    //Класс с перегруженными методами для работы с double, long, int

    //Сумма

    public  int getSum(int intA, int intB){
        return intA+intB;
    }
    public  double getSum(double doubleA,double doubleB){
        return doubleA+doubleB;
    }
    public  long getSum(long longA,long longB){
        return longA+longB;
    }

    //Деление

    public  int getDiv(int intA,int intB){
        return intA/intB;
    }
    public  double getDiv(double doubleA,double doubleB){
        return doubleA/doubleB;
    }
    public  long getDiv(long longA,long longB){
        return longA/longB;
    }

    //Умножение

    public  int getMul(int intA,int intB){
        return intA*intB;
    }
    public   double getMul(double doubleA, double doubleB){
        return doubleA*doubleB;
    }
    public  long getMul(long longA,long longB){
        return longA*longB;
    }

    //Вычитание

    public  int getSub(int intA,int intB){
        return intA-intB;
    }
    public  double getSub(double doubleA,double doubleB){
        return doubleA-doubleB;
    }
    public  long getSub(long longA,long longB){
        return longA-longB;
    }
}
