import java.util.Calendar;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start(){
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long stop(){
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
