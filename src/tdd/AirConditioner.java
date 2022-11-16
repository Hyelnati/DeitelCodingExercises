package tdd;

public class AirConditioner {
    private boolean turnOff;
    private boolean turnOn;
    private int temperature;


    public boolean getTurnOff() {
        return turnOff;
    }

    public void setTurnOff(boolean power) {
        turnOff = power;
        if (turnOff) {
            turnOn = false;
        }
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean power) {
        turnOn = power;
        if (turnOn) {
            turnOff = false;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int degrees) {
        if (turnOn && degrees >= 16 && degrees <= 30) {
            temperature = degrees;
        }

    }

    public void increaseTemperature(int degrees) {
        if (turnOn && temperature + degrees <= 30) {
            temperature = temperature + degrees;
        } else if (temperature + degrees > 30) {
            temperature = 30;
        }
    }

    public void decreaseTemperature(int degrees) {
        if (turnOn && temperature - degrees >= 16) {
            temperature = temperature - degrees;
        } else if (temperature - degrees < 16) {
            temperature = 16;
        }
    }
}

