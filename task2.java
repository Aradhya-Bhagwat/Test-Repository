import java.util.*;
public class task2 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n;
            System.out.print("Enter number of elements in the array: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                System.out.print("Enter element " + (i + 1) + ": ");
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

    public static int[] addElement(int[] arr, int element, int pos) 
    {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i < n; i++, j++) 
        {
            if (j == pos) 
            {
                newArr[j++] = element;
            }
            newArr[j] = arr[i];
        }
        newArr[pos] = element;
        return newArr;
    }

    public static int[] removeElement(int[] arr, int pos) 
    {
        int n = arr.length;
        if (pos < 0 || pos >= n) 
        {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) 
        {
            if (i != pos) 
            {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}