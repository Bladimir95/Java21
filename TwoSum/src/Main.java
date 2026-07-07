import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Dado un arreglo de enteros nums y un entero target, devuelve los índices de dos números cuya suma sea igual a target*/
        int [] nums = {2,11,7,15};
        int target = 9;

        System.out.println(Arrays.toString(TwoSum.twoSum(nums, target)));
    }
}