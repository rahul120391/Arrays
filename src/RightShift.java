import java.util.*;

public class RightShift {

    private static void swap(int[] A,int start,int end){
        int temp;
        while(start<end){
            temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }

    }
    public static int[] solution(int[] A, int K) {
        int size = A.length;
        if(size == 0 || size ==1 || size==K || K == 0){
            return A;
        }
        int index = K%size;
        swap(A,size-index,size-1);
        swap(A,0,size-index-1);
        swap(A,0,size-1);
        return A;
    }

    public static int solution1(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        Stack<Integer> st = new Stack<>();
        for (int e:A) {
            st.add(e);
        }
        int element = 0;
        while (!st.isEmpty()){
            int top= st.pop();
            if(!st.isEmpty() && st.peek()==top){
                st.pop();
                continue;
            }
            else{
                element = top;
            }
            break;
        }
        return element;
    }

    public static void main(String[] args){
      int[] A = {9,3,9,3,9,7,9};
      Arrays.sort(A);
      int element = solution1(A);
      int a = 123;
      System.out.println(element);
    }
}
