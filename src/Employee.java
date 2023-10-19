class Employee {
    private static int counter = 1;
    private int id;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + fullName + ", Department: " + department + ", Salary: " + salary;
    }

    public static Employee[] employeeStorage = new Employee[10];

    public static void addEmployee(Employee employee) {
        for (int i = 0; i < employeeStorage.length; i++) {
            if (employeeStorage[i] == null) {
                employeeStorage[i] = employee;
                break;
            }
        }
    }

    public static void printAllEmployees() {
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = employeeStorage[0];
        for (Employee employee : employeeStorage) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = employeeStorage[0];
        for (Employee employee : employeeStorage) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int count = 0;
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                count++;
            }
        }
        return totalSalary / count;
    }

    public static void printAllNames() {
        for (Employee employee : employeeStorage) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 1, 5000);
        Employee employee2 = new Employee("Jane Smith", 2, 6000);
        addEmployee(employee1);
        addEmployee(employee2);

        printAllEmployees();
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("Employee with minimum salary: " + findMinSalaryEmployee().toString());
        System.out.println("Employee with maximum salary: " + findMaxSalaryEmployee().toString());
        System.out.println("Average Salary: " + calculateAverageSalary());
        printAllNames();
    }
}