package Observer.Imp2;

import Observer.Imp2.types.Observer;

public class Main {

    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Observer currentConditionDisplay = new CurrentConditionDisplay(ws);

        ws.measurementsChanged();
        ws.measurementsChanged();

        new ForecastDisplay(ws);
        new ThirdPartyDisplay(ws);
        new StatisticsDisplay(ws);

        ws.measurementsChanged();
    }
}
