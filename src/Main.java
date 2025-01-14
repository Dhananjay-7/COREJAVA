import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskService {
    private ExecutorService executor = Executors.newFixedThreadPool(3);

    public void submitTask() {
        executor.submit(() -> {
            System.out.println("Task executed by: " + Thread.currentThread().getName());
        });
    }

    public void shutdownService() {
        executor.shutdown(); // Graceful shutdown
    }
}

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        service.submitTask();  // Submit short task
        service.submitTask();  // Submit another task
        service.shutdownService();  // Shut down the service
    }
}