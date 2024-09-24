package main.task;

import java.time.LocalTime;

public class Task {
    private  LocalTime startTime;
    private  LocalTime endTime;
    private String priority;
    private String desc;

    public Task(String desc, LocalTime endTime, String priority, LocalTime startTime) {
        this.desc = desc;
        this.endTime = endTime;
        this.priority = priority;
        this.startTime = startTime;
    }
    

    


    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}

