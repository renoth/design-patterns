import de.renoth.strategy.BrabbleBehaviour;
import de.renoth.strategy.Person;
import de.renoth.strategy.QuietBehaviour;

public class Main {

    public static void main(String[] args) {
        System.out.println("Strategy Pattern.");

        System.out.println("Brabbling Person: ");
        Person brabbler = new Person();
        brabbler.setTalkBehaviour(new BrabbleBehaviour());
        brabbler.talk();

        System.out.println("Quiet Person: ");

        Person quietPerson = new Person();
        quietPerson.setTalkBehaviour(new QuietBehaviour());
        quietPerson.talk();
    }
}
