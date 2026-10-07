package Bai1;
//Bài 1

abstract class Employee {
    protected String name;
    protected int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract double tinhLuong();
    public void displayInfo(){
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Lương: " + tinhLuong());
    }
}
