package corejava.contract;

class Job extends Thread {
    private Integer number = 0;
    public void run() {
        for (int i = 1; i < 1000000; i++) {
            number++;
        }
    }
    public Integer getNumber() {
        return number;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Job thread = new Job();
        thread.start();
        System.out.println(thread.getNumber());
    }
}
