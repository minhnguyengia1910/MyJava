package Bai1;

class OfficeEmployee extends Employee {
    private int workingDays;
    private static double luongmoingay = 100;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    @Override
    public double tinhLuong() {
        return workingDays * luongmoingay;
    }
}
