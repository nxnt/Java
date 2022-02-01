public class StopWatch {
    
    private long startTime,endTime;
    public StopWatch() {

        startTime = System.nanoTime();
        endTime = System.nanoTime();
    }
    public void start() {

        startTime = System.nanoTime();
    }
    public void stop() {

        endTime = System.nanoTime();
    }
    public double getElapsedTime() {

        return (endTime  - startTime) / 10e6;
    }
}
