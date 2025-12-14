import java.util.*;

public class task2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int choice;

        do 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Sort Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    arr = sortArray(arr);
                    System.out.println("Array sorted successfully.");
                    break;

                case 2:
                    System.out.print("Enter element to insert: ");
                    int element = sc.nextInt();
                    System.out.print("Enter position (0-based index): ");
                    int pos = sc.nextInt();
                    arr = addElement(arr, element, pos);
                    System.out.println("Element inserted successfully.");
                    break;

                case 3:
                    System.out.print("Enter position to delete (0-based index): ");
                    int delPos = sc.nextInt();
                    arr = removeElement(arr, delPos);
                    System.out.println("Element deleted successfully.");
                    break;

                case 4:
                    displayArray(arr);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    // Bubble Sort
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

    // Insert element
    public static int[] addElement(int[] arr, int element, int pos) 
    {
        if (pos < 0 || pos > arr.length) 
        {
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr.length; i++, j++) 
        {
            if (j == pos) 
            {
                newArr[j++] = element;
            }
            newArr[j] = arr[i];
        }
        return newArr;
    }

    // Delete element
    public static int[] removeElement(int[] arr, int pos) 
    {
        if (pos < 0 || pos >= arr.length) 
        {
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) 
        {
            if (i != pos) 
            {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // Display array
    public static void displayArray(int[] arr) 
    {
        System.out.print("Array: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
