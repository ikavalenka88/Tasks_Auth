package TaskSecond.dto;
public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Student (int id, String name, String surname, int age){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public Integer getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }
    public String toString(){
        return  String.format("ID: %s Name: %s Surname: %s Age: %s", id,name,surname,age);
    }
}
