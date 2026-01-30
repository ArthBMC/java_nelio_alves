package section17.IntroducingMap.firstImpression;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new LinkedHashMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "40028922");

        cookies.remove("email");
        cookies.put("phone", "1233213123");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("email"));
        System.out.println("Key's value: " + cookies.get("phone"));

        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()){
            System.out.println(key + ":" + cookies.get(key));
        }



    }
}
