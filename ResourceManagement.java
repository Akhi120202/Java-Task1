import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceManagement {
    private Lock resourceLock = new ReentrantLock();
    private int resource = 0;

    public void acquireResource() {
        resourceLock.lock();
        try {
            // Simulate some resource acquisition logic
            resource++;
            System.out.println("Resource acquired. Total resources: " + resource);
        } finally {
            resourceLock.unlock();
        }
    }

    public void releaseResource() {
        resourceLock.lock();
        try {
            // Simulate some resource release logic
            resource--;
            System.out.println("Resource released. Total resources: " + resource);
        } finally {
            resourceLock.unlock();
        }
    }
}
