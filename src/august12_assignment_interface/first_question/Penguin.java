package august12_assignment_interface.first_question;

public class Penguin implements Birds,Swimmable
{

    @Override
    public void feed()
    {
        System.out.println("Penguins are carnivores: they feed on fish, squid, crabs, krill and other seafood they catch while swimming.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Penguins use a variety of vocalizations to communicate with each other, including trumpeting, braying, and honking.");

    }

    @Override
    public void swim()
    {
        System.out.println("Penguins swim underwater at speeds of up to 15 to 25 miles per hour");

    }

    @Override
    public void fly()
    {
        System.out.println("Penguins are a group of aquatic flightless birds");

    }
}
