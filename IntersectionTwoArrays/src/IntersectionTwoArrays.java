import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class IntersectionTwoArrays {
    public static HashSet<Integer> intersection(int[] nums1, int[] nums2){
        HashSet<Integer> interseccion = new HashSet<>();
        HashSet<Integer> hashNums2 = new HashSet<>();
        for (int num : nums2) {
            hashNums2.add(num);
        }

        for (int num : nums1){
            if (hashNums2.contains(num)) interseccion.add(num);
        }

        return interseccion;
    }
}
