package Lesson06.online.HW6;

import Lesson06.online.HW6.Models.Counting;

public class Dog extends Counting {

 //   private String name;//имя собаки
//    private int run;//собака умеет бегать
//    private int swim;//собака умеет плавать
 //   private int maxRun;//max пробег собаки
//    private int maxSwim;//max может проплыть собака
 //   private int currentRun;

    //создаем конструктор

    public Dog(String name, int run, int swim, int maxRun, int maxSwim, int currentRun, int currentSwim) {
        super(name, run, swim, maxRun, maxSwim, currentRun);

        this.name = name;
        this.run = run;
        this.swim = swim;
        this.maxRun = maxRun;
        this.currentRun = 0;
        this.currentSwim = 0;
        this.maxSwim = 10;

    }
    //собака пробежала
 //   public void run() {
  //      System.out.println(name + " ran");
 //   }
    //собака max может пробежать
    public void maxRun() {
        System.out.println(name + " can run maximum" + " 500 m");
    }
    //собака проплыла
    public void swim() {
        System.out.println(name + "can swim");
    }
    //собака max может проплыть
    public void maxSwim(int countSwim) {
        if (currentSwim + countSwim < maxSwim) {
            currentSwim += countSwim;
            System.out.println(name + " successfully swim " + countSwim + " metra(ov)");

        } else {
            System.out.println(name + " drowned");

        }



    }
    //пробежка собаки
 //   public void jogging(int countRun) {
 //       if (currentRun + countRun < maxRun) {
 //           currentRun += countRun;
 //           System.out.println(name   + " successfully ran " + countRun + " metra(ov)");
//        } else {
 //           System.out.println("Not enough distance");
 //       }
    }





