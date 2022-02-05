package Lesson06.online.HW6.Models;

public class Counting {
 protected String name;//имя кота
 protected int run;//кот умеет бегать
 protected int swim;//кот умеет плавать
 protected int maxRun;//max пробег кота
 protected int maxSwim;//max может проплыть кот
 protected int currentRun;
 protected int currentSwim;



 public Counting(String name, int run, int swim, int maxRun, int maxSwim, int currentRun) {

  this.name = name;
  this.run = run;
  this.swim = swim;
  this.maxRun = maxRun;
  this.currentRun = 0;
  this.maxSwim = maxSwim;
 }

 //собака и кот умеют бегать
 public void run() {
  System.out.println(name + " ran");
 }

 //пробежка кота и собаки
 public void jogging(int countRun) {
  if (currentRun + countRun < maxRun) {
   currentRun += countRun;
   System.out.println(name + " successfully ran " + countRun + " metra(ov)");
  } else {
   System.out.println("Not enough distance");
  }
 }
}

