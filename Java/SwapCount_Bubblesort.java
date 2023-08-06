public class SwapCount_Bubblesort {
    // A function that takes an unsorted list of integers as input and returns the number of swap performed during bubble sort algorithm
public static int bubbleSort(int[] arr) {
    // Initialize a variable to store the number of swaps
    int swapCount = 0;
    // Get the length of the array
    int n = arr.length;
    // Loop through the array from the first element to the second last element
    for (int i = 0; i < n - 1; i++) {
      // Loop through the array from the first element to the last element minus i
      for (int j = 0; j < n - i - 1; j++) {
        // Compare the current element with the next element
        if (arr[j] > arr[j + 1]) {
          // Swap the elements if they are in the wrong order
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          // Increment the swap count by one
          swapCount++;
        }
      }
    }
    // Return the swap count
    return swapCount;
  }
  

    
}
