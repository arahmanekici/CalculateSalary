public class Employee {
    String name;
    int salary, workHours, hireYear,bonus;
    double tax,raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        
    }

    public String getName() {
        return name;
    }

    
    public int getSalary() {
        return salary;
    }

    
    public int getHireYear() {
        return hireYear;
    }

    
    public int getWorkHours() {
        return workHours;
    }
    

    

}
