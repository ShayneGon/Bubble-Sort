package bubble.sort;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size = input.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number to go into the list");
            num[i] = input.nextInt();
        }
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1; j++) {
                int temp = num[j+1];
                if (num[j] > temp){
                    num[j+1] = num[j];
                    num[j] = temp;
                }
            }
        }System.out.println(Arrays.toString(num));
    }
    
}
