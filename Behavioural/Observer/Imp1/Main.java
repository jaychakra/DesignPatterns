package Behavioural.Observer.Imp1;

public class Main {

    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();

        ws.measurementsChanged();
        ws.measurementsChanged();

    }
}
