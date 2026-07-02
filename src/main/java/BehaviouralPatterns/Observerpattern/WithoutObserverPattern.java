package BehaviouralPatterns.Observerpattern;

class DisplayDevice{

    public void showTemp(float temp){
        System.out.println("Current Temp "+temp);
    }
}

 class WeatherStation{
    private float temperature;
    private  DisplayDevice displayDevice;

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

     public void setTemperature(float temperature) {
         this.temperature = temperature;
     }

     public void notifyDevice(){
        displayDevice.showTemp(temperature);
     }

 }

public class WithoutObserverPattern {
    public static void main(String[] args) {

        DisplayDevice ds=new DisplayDevice();
        WeatherStation ws=new WeatherStation(ds);
        //This is a tight coupling between Device and Station
        ws.setTemperature(45);
        ws.notifyDevice();
    }


}
