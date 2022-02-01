package Lesson05.online.models;

public class HW5 {
    public static void main(String[] args) {
//создание объекта person и заполнение полей класса Employee
        Employee person = new Employee();
        person.name = "Ivanov Ivan Ivanovich";
        person.post = "Ingeneer";
        person.email = "ivanov@mail.com";
        person.phone = "+79998887755";
        person.salary = 30000;
        person.age = 45;

        person.infoPerson();





    }
}
// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
class Employee {
    String name;//ФИО
    String post;//должность
    String email;//email
    String phone;//телефон
    int salary;//зарплата
    int age;//возраст
    void infoPerson(){
        System.out.println("Информация о сотруднике: " + name + post + email + phone + salary + age);
    }


}
