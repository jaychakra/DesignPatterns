package Observer.Imp1;

public class WeatherStation {
    private CurrentConditionDisplay currentConditionDisplay;
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ThirdPartyDisplay thirdPartyDisplay;

    WeatherStation() {
        currentConditionDisplay = new CurrentConditionDisplay();
        forecastDisplay = new ForecastDisplay();
        statisticsDisplay = new StatisticsDisplay();
        thirdPartyDisplay = new ThirdPartyDisplay();
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

    void measurementsChanged() {
        double t = getTemperature();
        double p = getPressure();
        double h = getHumidity();

        currentConditionDisplay.update(t, p, h);
        forecastDisplay.update(t, p, h);
        statisticsDisplay.update(t, p, h);
        thirdPartyDisplay.update(t, p, h);
    }
}
