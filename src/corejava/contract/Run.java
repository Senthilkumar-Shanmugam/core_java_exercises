package corejava.contract;

class Parent1 {
    int value;
    void validate() {
        value = value + 10;
    }
}
 
class Child1 extends Parent1 {
    void validate() {
        super.validate();
        value = value - 2;
    }
}
 
public class Run {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.validate();
        System.out.println(child.value);
    }
}
