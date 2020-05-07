package Observer.Imp2;

import Observer.Imp2.types.Observer;
import Observer.Imp2.types.Subject;

import java.util.HashSet;

class WeatherStation implements Subject {
    private HashSet<Observer> observers;
    WeatherStation() {
        observers = new HashSet<>();
    }

    private double getTemperature() {
        return Math.random() * 100;
    }

    private double getHumidity() {
        return Math.random() * 100;
    }

    private double getPressure() {
        return Math.random() * 100;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers) {
            o.update(this.getTemperature(), this.getPressure(), this.getHumidity());
        }
    }

    void measurementsChanged() {
        this.notifyObserver();
    }
}
