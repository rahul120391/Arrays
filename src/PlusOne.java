import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int value = digits[digits.length-1]+1;
        if(value<10){
            digits[digits.length-1] = value;
            return digits;
        }
        else{
            int[] newArray = new int[digits.length+1];
            int j = newArray.length-1;
            int carry = 1;
            for (int i = digits.length-1;i>=0;i--) {
                value = digits[i]+carry;
                if(value>9){
                    newArray[j] = 0;
                    carry = 1;
                }
                else{
                    carry = 0;
                    newArray[j] = value;
                }
                j--;
            }
            if(carry==1){
                newArray[0] = 1;
                return newArray;
            }
            else{
                j = 1;
                while (j< newArray.length){
                    digits[j-1] = newArray[j];
                    j++;
                }
                return digits;
            }
        }
    }
    public static void main(String[] args){
        int[] A = {8,9,9,9};
        int[] B = plusOne(A);
        System.out.println(Arrays.toString(B));
    }
}
