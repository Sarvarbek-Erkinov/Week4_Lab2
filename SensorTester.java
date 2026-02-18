import java.util.Scanner;

public class SensorTrester {
    static void main(String[] args) {
        double collectTemp = 0;
        Scanner input = new Scanner(System.in);
        double[] listTemp = new double[5];

        for(int i = 0; i < listTemp.length; i++){
            double sampleTemp = input.nextInt();
            input.nextLine();
            Sensor sample = new Sensor("Tashkent", sampleTemp);
            listTemp[i] = sample.getReading();
        }

        for (int i = 0; i < listTemp.length; i++){
            collectTemp += listTemp[i];
        }

        System.out.println("Average Temp: " + collectTemp/listTemp.length);


    }
}
