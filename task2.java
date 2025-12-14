import java.util.*;
public class task2 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n;
            System.out.println("Enter number of elements in the array: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                System.out.println("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            sc.close();
        }
    }
    
}
