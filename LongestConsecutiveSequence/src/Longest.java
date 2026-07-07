import java.util.HashSet;

public class Longest {
    public static int longest(int[] nums){
        if (nums.length == 0) return 0;

        HashSet<Integer> noRpit = new HashSet<>();
        for(int num: nums){
            noRpit.add(num);
        }
        int totalMax = 1;
        int currentMax;
        int currentNum;
        for(int num: noRpit){
            currentMax = 1;
            currentNum = num;
            if(!noRpit.contains(num-1)){
                while(noRpit.contains(currentNum+1)){
                    currentMax++;
                    currentNum++;
                }
                totalMax = Math.max(totalMax, currentMax);
            }

        }
        return totalMax;
    }
}
