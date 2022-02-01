package Lesson05.online.models;

public class Employee {
    private String name;//ФИО
    private String post;//должность
    private String email;//email
    private String phone;//телефон
    private int salary;//зарплата
    private int age;//возраст


    public Employee(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }
}

