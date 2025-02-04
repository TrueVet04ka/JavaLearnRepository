public class Dog extends Animal {
    private String breed;
    private boolean vaccinated;

    Dog()
    {
        breed = "Dvornyaaga";
        vaccinated = false;
}
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setVaccinated(boolean vaccinated)
    {
        this.vaccinated = vaccinated;
    }

    public String getBredd()
    {
        return breed;
    }
    public boolean getVaccinated()
    {
        return vaccinated;
    }

    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("AWOOOOOOOOOOO");
    }

}
