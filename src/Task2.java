import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable{

    private long sleepTime;
    private String taskId;
    private static int counter = 0;
    private static SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss.SSS");

    public Task2(long sleepTime) {
        this.sleepTime = sleepTime;
        this.taskId = "TaskID-" + ++counter;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
//        System.out.println(threadName + " --> Hello World-" + taskId + " starts at: " + dateFormatter.format(new Date()));
        System.out.println(threadName + " --> " + taskId + " starts at: " + dateFormatter.format(new Date()));
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " --> " + taskId + " ends at: " + dateFormatter.format(new Date()));
    }
}
