package ex2;

public class ElevatorSimulator {
    public static void main(String[] args) {
        Person person1 = new Person(1, 68);
        Person person2 = new Person(2, 120);
        Person person3 = new Person(3, 150);
        Person person4 = new Person(4, 128);
        Person person5 = new Person(5, 78);

        Elevator elevator = new Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person4);
//
        elevator.clear();

        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);

        elevator.start();
    }
}
