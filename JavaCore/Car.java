public class Car {

    private String brand;
    private String model;
    private int year;

    Car()
    {
        this.brand = "Default";
        this.model = "Model";
        this.year = 0000;
    }
    Car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }
    void SetFields(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void GetFields()
    {
        System.out.println(this.brand + "\n" + this.model+ "\n" + this.year );
    }
}
