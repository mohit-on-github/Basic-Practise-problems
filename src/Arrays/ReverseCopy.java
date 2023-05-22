package Arrays;

public class ReverseCopy {
    public static void main(String[] args) {
        int[] A = {45, 56, 21, 65, 34, 75, 94};
        int[] B = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];

        }
        for (int x : B) {
            System.out.print(x + " ");
        }
    }
}
