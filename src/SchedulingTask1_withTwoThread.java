import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulingTask1_withTwoThread {

    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss.SSS");

    public static void main(String[] args) throws InterruptedException{
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + " --> Main thread starts here..." + dateFormatter.format(new Date()));

        ScheduledExecutorService execService = Executors.newScheduledThreadPool(3);
        execService.schedule(new Task1(), 5, TimeUnit.SECONDS);
        execService.schedule(new Task1(), 20, TimeUnit.SECONDS);
        execService.shutdown();

        System.out.println(currentThreadName + " --> Main thread ends here..." + dateFormatter.format(new Date()));
    }
}

