package Bai1;

class TechnicalEmployee extends Employee {
    private int workingHours;
    private double luongmoigio;

    public TechnicalEmployee(String name, int age, int workingHours, double luongmoigio) {
        super(name, age);
        this.workingHours = workingHours;
        this.luongmoigio = luongmoigio;
    }

    @Override
    public double tinhLuong() {
        return workingHours * luongmoigio;
    }
}
