public class Ac {
    private boolean isOn;
    private int temperature = 16;
    public void toggleOn() {
        if (isOn){
           isOn=false;
        }
        else {
           isOn = true;
        }

        }


        //isOn = !isOn;




    public boolean isOn() {
        return isOn;
    }

    public void increaseTemperature(int degree) {


       if (degree > 0 && degree < 15){
            temperature = temperature + degree;
        }
        else if(degree > 15) {
            temperature = 30;
        }

        }




   public void decreaseTemperature(int degree) {
        if  (temperature ==30 ||temperature < 30){
            temperature = temperature - degree;
        }
        else if(temperature - degree < 16 || temperature ==16){
            temperature = 16;
        }
    }


    public int getTemperature() {
        return temperature;
    }
}


