package Map;

import java.util.HashMap;
import java.util.Map;

public class Cars {
    public static void main(String[] args) {
        HashMap <String,Integer> cars = new HashMap<>();
        cars.put("BMW",1990);
        cars.put("Toyota",2003);
        cars.put("Mercedes",1996);
        cars.put("Honda",2006);
        cars.put("Subaru",2003);
        System.out.println("Марка:" + "Год выпуска:");
        for (Map.Entry<String, Integer> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
