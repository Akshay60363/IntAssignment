package main.task;
import java.time.LocalTime;

public class CreateTask {
    public static Task CreateTask(LocalTime endTime, LocalTime startTime, String priority, String desc){
        
        return new Task(desc , startTime ,priority , endTime );
    }
}
