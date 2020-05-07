package Behavioural.Observer.Imp2;

import Behavioural.Observer.Imp2.types.Display;
import Behavioural.Observer.Imp2.types.Observer;

class ForecastDisplay implements Observer, Display {

    private  double temperature;
    private  double pressure;
    private  double humidity;
    private  static String name = "Forecast Display";

    private WeatherStation weatherStation;

    ForecastDisplay(WeatherStation ws) {
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
        System.out.println("##############################################");
        System.out.print("[" + name + "]: ");
        System.out.print("Temperature (" + this.temperature + ") degree C, ");
        System.out.print("Pressure (" + this.pressure + ") pascals, ");
        System.out.println("Humidity (" + this.humidity + ") gm3 ");
        System.out.println("##############################################");
    }
}
