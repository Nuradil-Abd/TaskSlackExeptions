package java15.models;

public class Employee {
    private String name, job;
    private int age;

    public Employee() {
    }

    public Employee(String name,  int age,String job) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" +
                "name: " + name +
                ", age: " + age +
                ", job: " + job;
    }
}
