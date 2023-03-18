public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private final long id;
    static int count = 1;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }
    public String getFullName() { return fullName; }
    public int getDepartment() { return department; }
    public double getSalary() { return salary; }
    public long getId() { return id; }
    public void setDepartment(int department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "ФИО сотрудника " + fullName + ", Отдел № " + department + ", Зарплата " + salary + " рублей, id " + id;
    }
}
