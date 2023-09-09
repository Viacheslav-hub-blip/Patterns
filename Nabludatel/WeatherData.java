package Nabludatel;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }


    public float getPressure() {
        return pressure;
    }


    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registrationObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void measrementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float tem, float humidity, float pressure) {
        this.temp = tem;
        this.humidity = humidity;
        this.pressure = pressure;
        measrementChanged();
    }

}
