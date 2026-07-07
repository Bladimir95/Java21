import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group {
    public static List<List<String>> groupOfAnagrams(ArrayList<String> palabras){
        HashMap<String, List<String>> group = new HashMap<>();

        for(String palabra : palabras){
            char[] chars = palabra.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            }

            group.get(key).add(palabra);
        }

        return new ArrayList<>(group.values());
    }
}
