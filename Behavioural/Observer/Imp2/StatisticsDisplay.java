package Observer.Imp2;

import Observer.Imp2.types.Display;
import Observer.Imp2.types.Observer;

class StatisticsDisplay implements Observer, Display {
    private  double temperature;
    private  double pressure;
    private  double humidity;
    private  static String name = "Statistics Display";

    private WeatherStation weatherStation;

    StatisticsDisplay(WeatherStation ws) {
        this.weatherStation = ws;
        weatherStation.registerObserver(this);
    }

    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    public void display() {
        System.out.println("[" + name + "]: ");
        System.out.println("Temperature (" + this.temperature + ") degree C");
        System.out.println("Pressure (" + this.pressure + ") pascals");
        System.out.println("Humidity (" + this.humidity + ") gm3");
    }
}
