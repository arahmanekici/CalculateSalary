public class SalaryCalculator {
    private Employee employee;

    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    public double calculateTax() {
        if (employee.getSalary() > 1000) {
            return employee.getSalary() * 0.03;
        } else {
            return 0.0;
        }
    }

    public int calculateBonus() {
        if (employee.getWorkHours() > 40) {
            return ((employee.getWorkHours() - 40) * 30);
        } else {
            return 0;
        }
    }

    public int calculateRaiseSalary() {
        if (2021 - employee.getHireYear() < 10) {
            return (int) (employee.getSalary() * 0.05);
        } else if (2021 - employee.getHireYear() >= 10 && 2021 - employee.getHireYear() < 20) {
            return (int) (employee.getSalary() * 0.1);
        } else if (2021 - employee.getHireYear() >= 20) {
            return (int) (employee.getSalary() * 0.15);
        } else {
            return 0;
        }
    }

    public double calculateSalaryWithBonusAndTax(){

        return (employee.getSalary()+calculateBonus()-calculateTax());
    }



    

    public void Run() {

        String employeeInfo = "Employee Name: " + employee.getName() + "\n" +
                      "Salary : " + employee.getSalary() + "\n"+
                      "Hire Year : " + employee.getHireYear() + "\n" +
                      "Work Hours : " + employee.getWorkHours() + "\n" +
                      "Tax : " + calculateTax() + "\n" +
                      "Bonus : " + calculateBonus() + "\n" +
                      "Raise Salary : " + calculateRaiseSalary() + "\n"+
                      "Salary with Bonus and Tax: " + calculateSalaryWithBonusAndTax() + "\n"
                      
                      ;
                      System.out.println(employeeInfo);


    }
}
