package Nabludatel;

public class newDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;

    private WeatherData weatherData;

    public newDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registrationObserver(this);
    }
    @Override
    public void display() {
        System.out.println("temp " + temp + " humidity " + humidity);
    }

    @Override
    public void update() {
        temp = weatherData.getTemp();
        humidity = weatherData.getHumidity();
        display();
    }
}
