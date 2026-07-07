import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complemento = target - nums[i];
            //En este ejemplo la llave es el numero y el valor el indice
            if(map.containsKey(complemento)){
                return new int[] {map.get(complemento), i};
            }

            //Si no está el elemento lo guardamos ya vanzamos de posición
            map.put(nums[i], i);
        }

        return new int[]{};//Nunca debería llegar aqui
    }
}
