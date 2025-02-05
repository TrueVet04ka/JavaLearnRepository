

public class Main {
 
    public static void main(String[] args)
    {
        Employee work = new FullTimeEmployee();
        FullTimeEmployee work2 = new FullTimeEmployee();
        work.calculateSalary();
        work2.calculateSalary();

        Employee work3 = new PartTimeEmployee();
        PartTimeEmployee work4 = new PartTimeEmployee();
        work3.calculateSalary();
        work4.calculateSalary();
    }

   
}



