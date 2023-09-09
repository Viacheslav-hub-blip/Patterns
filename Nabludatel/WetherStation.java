package Nabludatel;

public class WetherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display display = new Display(weatherData);

        weatherData.setMeasurements(80, 65, 10);

    }
}
