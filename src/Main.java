public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAll();
        System.out.println();
        employeeBook.remove(3);
        employeeBook.printAll();
        employeeBook.add(new Employee("Vano Vanov Vanovich",2, 31000));
        employeeBook.updateSalary("vano vanov Vanovich", 35000);
        employeeBook.updateDepartment("vano vanov Vanovich", 3);
        System.out.println();
        employeeBook.printAll();
        System.out.println("Общие затраты на запралаты в месяц " +  employeeBook.totalSalary() + " рублей");
        System.out.println(employeeBook.minSalary());
        System.out.println(employeeBook.maxSalary());
        System.out.println(employeeBook.averageSalary());
        employeeBook.printAllNames();
        employeeBook.increaseByAmount(0.1);
        employeeBook.printAll();
        System.out.println();
        System.out.println(employeeBook.minSalary(1));
        System.out.println();
        System.out.println(employeeBook.maxSalary(2));
        System.out.println();
        System.out.println(employeeBook.totalSalary(2));
        System.out.println();
        System.out.println(employeeBook.averageSalary(2));
        System.out.println();
        employeeBook.increaseByAmount(0.1,1);
        employeeBook.printAll();
        System.out.println();
        employeeBook.printAll(4);
        System.out.println();
        employeeBook.printEmployeeMinSalary(30000);
        System.out.println();
        employeeBook.printEmployeeMaxSalary(50000);
        System.out.println();
        employeeBook.printAllByDepartment();
    }
}
