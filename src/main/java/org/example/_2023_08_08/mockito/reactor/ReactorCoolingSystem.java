package org.example._2023_08_08.mockito.reactor;

public class ReactorCoolingSystem {

    private Thermometer thermometer;
    private double temperatureThreshold;
    private boolean on;

    public ReactorCoolingSystem() {
        on = false;
    }

    public void checkReactorCoolingSystem() {
        this.on = (thermometer.getTemperature() >= temperatureThreshold);
    }

    public boolean isOn() {
        return on;
    }

    public void setThermometer(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    public void setTemperatureThreshold(double temperatureThreshold) {
        this.temperatureThreshold = temperatureThreshold;
    }
}