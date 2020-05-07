package Behavioural.Observer.Imp1;

class StatisticsDisplay {
    private  double temperature;
    private  double pressure;
    private  double humidity;
    private  static String name = "Statistics Display";

    void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    private void display() {
        System.out.println("[" + name + "]: ");
        System.out.println("Temperature (" + this.temperature + ") degree C");
        System.out.println("Pressure (" + this.pressure + ") pascals");
        System.out.println("Humidity (" + this.humidity + ") gm3");
    }
}
