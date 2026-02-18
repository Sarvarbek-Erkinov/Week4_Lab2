

public class Sensor {
    private String location;
    private double reading = 0.0;

    Sensor(String location, double reading){
        this.location = location;
        if(reading < 50.0 && reading > -50.0){
            this.reading = reading;
        }
    }

    public double getReading(){return reading;}

}
