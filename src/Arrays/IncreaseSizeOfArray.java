package Arrays;

public class IncreaseSizeOfArray {
    public static void main(String[] args) {
        int[] A = {45,12,56,89,47,66,36};
        int[] B = new int[2*A.length];
        System.arraycopy(A, 0, B, 0, A.length);
        for (int x:B)
            System.out.print(x+" ");
    }
}
