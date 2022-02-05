package Lesson06.online.HW6;

import Lesson06.online.HW6.Models.Counting;

public class Cat extends Counting {

  //  private String name;//имя кота
   // private int run;//кот умеет бегать
 //   private int swim;//кот умеет плавать
 //   private int maxRun;//max пробег кота
  //  private int maxSwim;//max может проплыть кот
 //   private int currentRun;

    //создаем конструктор

    public Cat(String name, int run, int swim, int maxRun, int maxSwim, int currentRun) {
        super(name, run, swim, maxRun, maxSwim,currentRun);

        this.name = name;
        this.run = run;
        this.swim = swim;
        this.maxRun = maxRun;
        this.currentRun = 0;
        this.maxSwim = maxSwim;
    }
    //кот пробежал
 //   public void run() {
 //     System.out.println(name + " run");
 //   }
    //кот max может пробежать
    public void maxRun() {
        System.out.println(name + " can run maximum" + " 200 m");
    }
    //кот не умеет плавать
    public void noSwim() {
        System.out.println(name + " can't swim");
    }

    //пробежка кота
 //   public void jogging(int countRun) {
 //       if (currentRun + countRun < maxRun) {
 //           currentRun += countRun;
//            System.out.println(name   + " successfully ran " + countRun + " metra(ov)");
 //       } else {
 //           System.out.println("Not enough distance");
 //       }


    }



