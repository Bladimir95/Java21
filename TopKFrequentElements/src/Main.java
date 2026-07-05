import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,2,5,1,2,4,4,4,3};
        int k = 2;
        System.out.println(Arrays.toString(TopK.top(nums, k)));
    }
}