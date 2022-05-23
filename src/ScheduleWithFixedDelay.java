import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleWithFixedDelay {

    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss.SSS");

    public static void main(String[] args) throws InterruptedException{
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + " --> Main thread starts here..." + dateFormatter.format(new Date()));


        ScheduledExecutorService execService = Executors.newScheduledThreadPool(3);
        execService.scheduleWithFixedDelay(new Task2(0), 10, 5, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(20);
        execService.shutdown();

        System.out.println(currentThreadName + " --> Main thread ends here..." + dateFormatter.format(new Date()));
    }
}

