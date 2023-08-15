package august12_assignment_interface.first_question;

public class Monkey implements Animal,Cimbable
{

    @Override
    public void feed()
    {
        System.out.println("monkeys are omnivores animals");
    }

    @Override
    public void makeSound()
    {
        System.out.println("monkeys make chatter, gibber, whoop, screech sounds");
    }

    @Override
    public void climb()
    {
        System.out.println("monkeys can easily climb on trees");
    }
}
