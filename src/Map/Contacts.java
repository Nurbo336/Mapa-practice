package Map;

import java.util.HashMap;
import java.util.Map;
public class Contacts {
    public static void main(String[] args) {
        HashMap <String,Integer> contact = new HashMap<>();
        contact.put("Nurbol",703013282);
        contact.put("Mom",706881180);
        contact.put("Dad",708564848);
        contact.put("Brother",703414345);
        System.out.println("Имена: "+ "номера");
        for (Map.Entry<String, Integer> entry : contact.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
