package Map;

import java.util.HashMap;

public class Cars {
    public static void main(String[] args) {
        HashMap <String,Integer> cars = new HashMap<>();
        cars.put("BMW",1990);
        cars.put("Toyota",2003);
        cars.put("Mercedes",1996);
        cars.put("Honda",2006);
        cars.put("Subaru",2003);
        System.out.println(cars.keySet());
        System.out.println(cars.values());
    }
}
