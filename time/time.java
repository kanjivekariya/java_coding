package time;

public class time {
    public static long startTime() {
        return System.nanoTime();
    }

    public static long endTime(long start) {
        long end = System.nanoTime();
        return end - start;
    }
    
}
