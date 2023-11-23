abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    
    void eat() {
        System.out.println("Athlete eats a balanced and nutritious diet.");
    }

    void exercise() {
        System.out.println("Athlete engages in intense and regular exercise.");
    }
}

class LazyPerson extends Person {
    
    void eat() {
        System.out.println("LazyPerson eats whatever is convenient without much consideration.");
    }

    void exercise() {
        System.out.println("LazyPerson avoids exercise and prefers a sedentary lifestyle.");
    }
}

public class Number8 {
    public static void main(String[] args) {
       
        Athlete athlete = new Athlete();
        athlete.eat();
        athlete.exercise();

        LazyPerson lazyPerson = new LazyPerson();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
