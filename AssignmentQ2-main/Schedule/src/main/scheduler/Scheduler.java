package main.scheduler;

import java.util.ArrayList;
import java.util.List;
import main.task.Task;




public class Scheduler {    
    private static   Scheduler instance;
    private List<Task>tasks = new ArrayList<>();
    


    
    public Scheduler() {
    }


    public static synchronized Scheduler getInstance(){
        if(instance == null) {
            instance = new Scheduler();
        }
    
    return instance;
}


    public String addTask(Task task){
        for(Task currTask : tasks){
            if(task.getStartTime().isBefore(currTask.getEndTime()) && task.getEndTime().isAfter(currTask.getStartTime())){
                return "Error "+currTask.getDesc();

            }
        }
        tasks.add(task);
        return "Task is added";
    }
    public  String removeTask(String desc){
        for(Task task : tasks){
            if(task.getDesc().equals(desc)){
                tasks.remove(task);
                return "Task removed";
            }
        }
        return "Error";
    }
    public List<Task> viewTask(){
        tasks.sort((task1 , task2)->task1.getStartTime().compareTo(task2.getStartTime()));
        return tasks;
    }
    public void displayTasks(){
        if(tasks.isEmpty())System.out.println("No tasks found");
    
    else{
        for(Task task : tasks){
            System.out.println(task.getStartTime()+"-"+task.getEndTime()+task.getPriority());
        }
    }
    }

}

