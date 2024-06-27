package Day9;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {7,3,8,5,1};

        System.out.println("Original Array - ");
        printArr(arr);

        //Bubble Sort
        System.out.println("\nBubble Sort - ");
        bubbleSort(arr);

        //Selection Sort
        System.out.println("\nSelection Sort - ");
        selectionSort(arr);

        //Insertion Sort
        System.out.println("\nInsertion Sort - ");
        insertionSort(arr);
    }       

    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public static void bubbleSort(int arr[]) {
        //placing greater elem at end
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }

    public static void selectionSort(int arr[]) {
        //placing smaller elem at start
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // 1 swap at each iteration
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int currentElem = arr[i];
            int j = i-1;
            //to make space for new sorted element
            while (j >= 0 && currentElem < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            //to place sorted element
            arr[j+1] = currentElem;
        }
        printArr(arr);
    }
}