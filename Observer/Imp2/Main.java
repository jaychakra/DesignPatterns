package Observer.Imp2;

public class Main {

    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        ws.registerObserver(new CurrentConditionDisplay());


        ws.measurementsChanged();
        ws.measurementsChanged();

        ws.registerObserver(new ForecastDisplay());
        ws.registerObserver(new ThirdPartyDisplay());
        ws.registerObserver(new StatisticsDisplay());

        ws.measurementsChanged();
    }
}
