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
            arr = sortArray(arr);
            System.out.println("Sorted Array : ");
            for (int i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }
    }

    //Impelemented Bubble Sort Algorithm
    public static int[] sortArray(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    } 
}