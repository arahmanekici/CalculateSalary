public class Main {


    public static void main(String[] args) {
       
        Employee tolga = new Employee("Tolga", 22000, 45, 2019);
        Employee volkan = new Employee("Volkan", 19000, 40, 2005);

        SalaryCalculator employeeInfoVolkan = new SalaryCalculator(volkan);
        SalaryCalculator employeeInfoTolga = new SalaryCalculator(tolga);
        employeeInfoVolkan.Run();
        employeeInfoTolga.Run();
       

        }

    
}
