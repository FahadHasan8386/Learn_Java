abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
   
    void play() {
        System.out.println("Glockenspiel is playing melodious tunes.");
    }

   
    void tune() {
        System.out.println("Tuning the Glockenspiel for optimal sound.");
    }
}

class Violin extends Instrument {
  
    void play() {
        System.out.println("Violin is producing beautiful classical music.");
    }
    void tune() {
        System.out.println("Tuning the Violin strings for perfect pitch.");
    }
}

public class Number9 {
    public static void main(String[] args) {
        
        Glockenspiel glockenspiel = new Glockenspiel();
        glockenspiel.tune();
        glockenspiel.play();

        Violin violin = new Violin();
        violin.tune();
        violin.play();
    }
}
