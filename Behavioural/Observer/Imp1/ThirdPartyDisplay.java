package Behavioural.Observer.Imp1;

class ThirdPartyDisplay {
    private  double temperature;
    private  double pressure;
    private  double humidity;
    private  static String name = "TP Display";

    void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    private void display() {
        System.out.print("[" + name + "]: ");
        System.out.print("Temperature (" + this.temperature + ") degree C, ");
        System.out.print("Pressure (" + this.pressure + ") pascals, ");
        System.out.println("Humidity (" + this.humidity + ") gm3");
    }
}
