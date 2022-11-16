package tdd;

public class AutoBike {
    private boolean turnOff;
    private boolean turnOn;
    private int speed;
    private int gear;

    public void setTurnOff(boolean power) {
        turnOff = power;
        if (turnOff) {
            turnOn = false;
        }
    }
    public boolean getTurnOff(){
        return turnOff;
    }


    public  void setTurnOn( boolean power) {
        turnOn = power;
        if (turnOn) {
            turnOff = false;
        }
    }

    public boolean getTurnOn (){
        return turnOn;
    }


    public void setGear (int acceleration){
        if(turnOn && acceleration >= 1 && acceleration <= 4) {
            gear = acceleration;
        }
    }

    public int getGear(){
        return gear;
    }


}
