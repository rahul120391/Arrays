import java.util.Arrays;

public class mergeArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m+n];
        int i = 0;
        int j = 0 ;
        int index = 0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                newArray[index++] = nums1[i++];
            }
            else if(nums2[j]<nums1[i]){
                newArray[index++] = nums2[j++];
            }
            else{
                newArray[index++] = nums1[i++];
            }
        }
        while(i<m){
            newArray[index++] = nums1[i++];
        }
        while(j<n){
            newArray[index++] = nums2[j++];
        }
        for(i = 0;i<newArray.length;i++){
            nums1[i] = newArray[i];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args){
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};
        merge(A,3,B,3);
    }
}
