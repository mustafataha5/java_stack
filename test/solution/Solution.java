import java.util.ArrayList;
import java.util.HashMap ;
import java.util.PriorityQueue; 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap
            = new PriorityQueue<>();
 
        for (int num : nums) {
            minHeap.add(num);
        }
        int count = nums.length -1- k ; 
        int top = 0 ; 
        while (count > 0) {
             top = minHeap.poll();
            count--;
        }
 
        return top; 
        
        
        //  Arrays.sort(nums); 
        //  return nums[nums.length-k];
        
    }
}