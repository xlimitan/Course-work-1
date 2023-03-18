public class EmployeeBook {
    private Employee employees[] = new Employee[10];

    public EmployeeBook() {
        Employee employee1 = new Employee("Ivan Ivanov Ivanovich", 1, 40_000);
        Employee employee2 = new Employee("Roman Romanov Romanovich", 2, 36_000);
        Employee employee3 = new Employee("Oleg Olegov Olegovich", 3, 32_000);
        Employee employee4 = new Employee("Ivan Olegov Olegovich", 3, 47_000);
        Employee employee5 = new Employee("Roman Olegov Olegovich", 3, 57_000);
        Employee employee6 = new Employee("Oleg Romanov Romanovich", 5, 27_000);
        Employee employee7 = new Employee("Ivan Romanov Romanovich", 5, 17_000);
        Employee employee8 = new Employee("Oleg Ivanov Ivanovich", 4, 31_000);
        Employee employee9 = new Employee("Roman Ivanov Ivanovich", 1, 39_000);
        Employee employee10 = new Employee("Roman Ivanov Davidovich", 2, 35_000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;
    }
    public void printAll() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }
    public double totalSalary(){
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum+= employee.getSalary();
        }
        return sum;
    }
    public Employee minSalary(){
        double min = 150_000;
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    public Employee maxSalary(){
        double max = 0;
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    public int averageSalary () {
        int average = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            average+= employee.getSalary() / employees.length;
        }
        return average;
    }
    public void printAllNames () {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }
    public void increaseByAmount (double amount) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() * amount);
        }
    }
    public Employee minSalary(int department){
        double min = 50000.0;
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department)
                continue;
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    public Employee maxSalary(double department){
        double max = 0;
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department)
                continue;
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    public double totalSalary(double department){
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != department)
                continue;
            sum+= employee.getSalary();
        }
        return sum;
    }
    public double averageSalary (int department) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment()!= department) {
                continue;
            }
            sum+=employee.getSalary();
            count++;
        }
        if (count == 0){
            System.out.println("No person in department № " + department);
        }
        return sum/count;
    }
    public void increaseByAmount (double amount, int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment()!= department) {
                continue;
            }
            employee.setSalary(employee.getSalary() + employee.getSalary() * amount);
        }
    }
    public void printAll (int department){
        boolean hasEmployee = false;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment()!= department) {
                continue;
            }
            hasEmployee = true;
            System.out.println("ФИО сотрудника " + employee.getFullName() + ", Зарплата " + employee.getSalary() + " рублей, id " + employee.getId());
        }
        if (!hasEmployee){
            System.out.println("No Person");
        }
    }
    public void printEmployeeMinSalary (double salary){
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary()<salary){
                System.out.println("ФИО сотрудника " + employee.getFullName() + ", Зарплата " + employee.getSalary() + " рублей, id " + employee.getId());
            }
        }
    }
    public void printEmployeeMaxSalary (double salary){
        boolean hasEmployee = false;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary()>salary){
                System.out.println("ФИО сотрудника " + employee.getFullName() + ", Зарплата " + employee.getSalary() + " рублей, id " + employee.getId());
                hasEmployee = true;
            }
        }
        if (!hasEmployee){
            System.out.println("No Person in salary " + salary);
        }
    }
    public void add(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }
    public void remove(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if(employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }
    public void updateSalary(String fullName, double salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getFullName().equalsIgnoreCase(fullName)){
                employee.setSalary(salary);
            }
        }
    }
    public void updateDepartment(String fullName, int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getFullName().equalsIgnoreCase(fullName)){
                employee.setDepartment(department);
            }
        }
    }
    public void printAllByDepartment (){
        for (int i = 1; i < 6; i++) {
            System.out.println("Department № " + i);
            printAll(i);
        }
    }
}
