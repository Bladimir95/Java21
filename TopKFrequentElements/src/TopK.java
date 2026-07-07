import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK {
    public static int [] top(int[] nums, int k){
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num, 0) +1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            if (heap.size() < k){
                heap.offer(entry);
            }else if(entry.getValue() > heap.peek().getValue()){
                heap.poll();
                heap.offer(entry);
            }
        }
        int[] result = new int[k];

        for (int i = k-1; i >= 0; i--) {
            result[i] = heap.poll().getKey();
        }

        return result;
    }
}
