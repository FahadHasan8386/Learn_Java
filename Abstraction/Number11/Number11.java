abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    
    void fly() {
        System.out.println("Eagle soars through the sky with majestic wings.");
    }

    
    void makeSound() {
        System.out.println("Eagle screeches loudly, echoing through the mountains.");
    }
}

class Hawk extends Bird {
    
    void fly() {
        System.out.println("Hawk glides gracefully, riding the air currents.");
    }

   
    void makeSound() {
        System.out.println("Hawk emits a distinctive cry while circling in the sky.");
    }
}

public class Number11 {
    public static void main(String[] args) {
        
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();

        Hawk hawk = new Hawk();
        hawk.fly();
        hawk.makeSound();
    }
}
