public class PartTimeEmployee extends Employee{
    @Override
    void calculateSalary()
    {
        System.out.println("Calculate Salary Part");
    }

    @Override
    void generateReport()
    {
        System.out.println("Report PartTime");
    }
}
