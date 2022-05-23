public class Test {
    public static void main(String[] args) {
//        Thread t1 =  new Thread(new Task2(5));
//        Thread t2 =  new Thread(new Task2(10));
//        Thread t3 =  new Thread(new Task2(15));
//        t1.start();
//        t2.start();
//        t3.start();

        for (int i = 0; i < 30; i+=3) {
            new Thread(new Task2(i)).start();
        }
    }
}
