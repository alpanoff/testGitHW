package Lesson05.online.models;

public class Employee {
        String name;//ФИО
        String post;//должность
        String email;//email
        String phone;//телефон
        int salary;//зарплата
        int age;//возраст
}
    //создаём конструктор
    public Employee(String name, String post, String email, String phone, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
