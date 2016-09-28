package corejava.contract;

class Mammal {
    void eat(Mammal m) {
        System.out.println("Mammal eats food");
    }
}
class Cattle extends Mammal {
	//@Override
    void eat(Cattle c) {
        System.out.println("Cattle eats hay");
    }
}

class Horse extends Cattle {
	//@Override
    void eat(Horse h) {
        System.out.println("Horse eats hay");
    }
}
public class OverridingTypeTest {
    public static void main(String[] args) {
        Mammal h = new Horse();
        Cattle c = new Horse();
        c.eat(h);
    }
}