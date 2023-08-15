package august12_assignment_interface.first_question;

public class Lion implements Animal
{

    @Override
    public void feed()
    {
        System.out.println("Lion is a carnivores");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Lion roars");

    }

}
