import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 implements Runnable{

    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss.SSS");

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " --> Hello World: " + dateFormatter.format(new Date()));
    }
}
