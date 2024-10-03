import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int removeElement1(int[] nums, int val) {
        int k = 0; // Counter for the elements that are not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Move valid elements to the front

            }
        }

        Arrays.sort(nums, 0, k); // Sort only the part that contains the remaining elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        return k; // Return the number of remaining elements
    }

    public static void printArr(int[] nums){
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;

        Main main=new Main();
        main.removeElement1(nums,val);
    }
}