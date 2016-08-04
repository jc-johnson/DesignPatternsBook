package Observer_Pattern_Java;


import Observer_Pattern.CurrentConditionDisplay;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jordan on 8/3/2016.
 */
public class CurrentConditionsDisplay implements Observer{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }

}
