package Nabludatel;

public class Display implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public Display(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registrationObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temp + " " + humidity + " " + pressure);
    }

    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.temp = weatherData.getTemp();
        this.pressure  = weatherData.getPressure();
        display();
    }
}
