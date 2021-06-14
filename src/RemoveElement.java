
public class RemoveElement {

    public static void swap(int[] A,int start,int end){
        int temp = A[start];
        A[start] = A[end];
        A[end] = temp;
    }

    public static int removeElement(int[] nums, int val) {
        int j;
        int i;
        for(i = 0;i<nums.length;i++){
            if(nums[i] == val) {
                j = i+1;
                while (j<nums.length && nums[j] == nums[i]){
                    j++;
                }
                if(j>nums.length-1){
                    return i;
                }
                swap(nums,i,j);
            }
        }
        return i;
    }

    public static void main(String[] args){
        int[] A = {2};
        int k = removeElement(A,3);
        System.out.println("count = " +k);
    }
}
