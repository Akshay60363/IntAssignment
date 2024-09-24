package main;


import java.time.LocalTime;
import main.scheduler.Scheduler;
import main.task.Task;



public class ApplicationRunner {
    public static void main(String[] args) {
        Scheduler man = Scheduler.getInstance();
        Task t1 = new Task("jogging", LocalTime.of(9 , 30), "High", LocalTime.of(9 , 40));
        System.out.println(man.addTask(t1));
        man.displayTasks();
        System.out.println(man.viewTask());
    }
}
