package Bai1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees ={
                new OfficeEmployee("Nhân viên 1", 25, 22),
                new TechnicalEmployee("Nhân viên 2", 28, 160, 15),
                new OfficeEmployee("Nhân viên 3", 30, 20),
                new TechnicalEmployee("Nhân viên 4", 26, 170, 20)
        };
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}
