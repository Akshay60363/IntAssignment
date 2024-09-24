import java.util.ArrayList;
import java.util.List;

interface WeatherStation {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
class concreteWeatherStation implements WeatherStation{
    private List<Observer>observers = new ArrayList<>();
    private int temp;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)o.update(temp);
    }
    public void setTemp(int temp){
        this.temp = temp;
        notifyObservers();
    }
    
    
    
}
interface  Observer{
    void update(int temp);
}
class Phone implements Observer{

    @Override
    public void update(int temp) {
        System.out.println("Updated "+temp);
    }
    
}

public class Weather{
    public static void main(String[] args) {
        concreteWeatherStation s = new concreteWeatherStation();
        Phone app = new Phone();
        s.addObserver(app); 
        s.setTemp(30);
    }
}

