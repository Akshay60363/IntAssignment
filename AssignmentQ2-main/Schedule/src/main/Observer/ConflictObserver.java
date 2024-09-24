package main.Observer;

public class ConflictObserver implements Observer{

    @Override
    public void update(String messege) {
        System.out.println("Conflict Alert: " +messege);
    }
    
}
