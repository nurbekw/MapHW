import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Car,CarInfo> cars = new HashMap<>();
        cars.put(new Car(1,"Ferrari"),new CarInfo(1990,"Ferrari GTO 240",1999999,"Red"));
        Set<Map.Entry<Car,CarInfo>> entrySet = cars.entrySet();
        for (Map.Entry<Car, CarInfo> entry:entrySet) {
            System.out.println(entry);
        }

    }
}