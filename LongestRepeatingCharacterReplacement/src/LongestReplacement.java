import java.util.Collections;
import java.util.HashMap;

public class LongestReplacement {
    public static int longest(String s, int k){
        HashMap<Character, Integer> count = new HashMap<>();

        int left = 0;
        int maxFrequency = 0;
        int result = 0; //Ventana más grande posible

        for (int right = 0; right < s.length(); right++) {

            // 1. Agregar s.charAt(right) al mapa
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0)+1);

            // 2. Actualizar maxFrequency
            maxFrequency = Math.max(maxFrequency,count.get(s.charAt(right)));


            // 3. Mientras la ventana sea inválida:
            while ((right-left+1) - maxFrequency > k ) {

                // quitar s.charAt(left)
                count.put(s.charAt(left), count.get(s.charAt(left))-1);
                // mover left
                left++;
            }


            // 4. Actualizar resultado
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
