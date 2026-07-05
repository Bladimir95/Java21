import java.util.HashSet;

public class Duplicated {

    public static boolean duplicated(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }


}
