import java.util.*;

public class Lab10 {

    /**
     * Helper method for printing out arrays.
     * @param int[] arr Array of integers to print
     */
    public static void printArray(int[] arr) { // < shouldn't int[] be int[][]?
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	    
    }

    /**
     * Swap two elements in an array
     * @param int[] arr - the array
     * @param int index1 - the index of first element to swap
     * @param int index2 - the index of the second element to swap
     */

    public static void swap(int[] arr, int index1, int index2) {
    	if (index1 == index2) {
    		// Do nothing!
    	} 
    	else{
    		int tmp = arr[index1];
    		arr[index1] = arr[index2];
    		arr[index2] = tmp;
    	}
    }

    /**
     * Sort an array in ascending order using the Selection Sort algorithm
     * @param int[] arr - the array
     */
    
    public static void selectionSort(int[] arr) {
    	if (arr.length < 2) {
    		return;
    	}
    	int swapCounter = 0;
    	
    		for (int i = 0; i < arr.length - 1; i++) {
                
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                swap(arr, minIndex, i);
                System.out.println("Swapping " + arr[minIndex] + " with " + arr[i]);
                swapCounter++;
            }
            printArray(arr);
            System.out.println("Swaps: " + swapCounter);
            System.out.println();
        

    }
    
    public static int[] bubbleSort(int[] arr){
        int tmp;
        int swapCount = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                	System.out.println("Swapping " + arr[j-1] + " with " + arr[j]);
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    swapCount++;
                }
            }
            printArray(arr);
            System.out.println("Swaps: " + swapCount);
            System.out.println();
        }
        return arr;
    }
    
    public static int[][] deepCopy(int[][] arr){
    	int[][] newArr = arr;
    	/*
    	for(int j = 0; j < 5; j++){
    		for(int i = 0; i < arr[j].length -1; i++){
    			newArr[i][i] = arr[i][i];
    		}
    	}
    	*/
    	
    	return newArr;
    }

    public static void main(String[] args) {
    	int[][] a1 = { {8, 9, 5, 6, 4, 3},
		       {9, 0, 14, 13, 10, 8, 2, 1, 17, 18, 19, 201, 220, 235, 2},
		       {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200 },
		       {22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 1},
		       {20, 18, 13, 12, 11, 9, 6, 5, 4, 3, 2, 1, -87, -900, -9, -909, -911, -80, -44, -32, -1000} };
    	
    	int[][] a2 = deepCopy(a1);
    	///////////////////////////////////////////////////////////////
    	
    	System.out.println("Bubble Sort Iteration 1");
    	int[] bub = new int[a1[0].length];
    	for(int i = 0; i < bub.length; i++){
    		bub[i] = a1[0][i];
    	}
    	bubbleSort(bub);
    	
    	System.out.println();
    	
    	System.out.println("Bubble Sort Iteration 2");
    	int[] bub1 = new int[a1[1].length];
    	for(int i = 0; i < bub1.length; i++){
    		bub1[i] = a1[1][i];
    	}
    	bubbleSort(bub1);
    	
    	System.out.println();
    	
    	System.out.println("Bubble Sort Iteration 3");
    	int[] bub2 = new int[a1[2].length];
    	for(int i = 0; i < bub2.length; i++){
    		bub2[i] = a1[2][i];
    	}
    	bubbleSort(bub2);
    	
    	System.out.println();
    	System.out.println("Bubble Sort Iteration 4");
    	int[] bub3 = new int[a1[3].length];
    	for(int i = 0; i < bub3.length; i++){
    		bub3[i] = a1[3][i];
    	}
    	bubbleSort(bub3);
    	
    	System.out.println();
    	System.out.println("Bubble Sort Iteration 5");
    	int[] bub4 = new int[a1[4].length];
    	for(int i = 0; i < bub4.length; i++){
    		bub4[i] = a1[4][i];
    	}
    	bubbleSort(bub4);
    	
    	System.out.println();
    	
//////////////////////////////////////////////////////////////////////
    	
    		System.out.println("Selection Sort Iteration: 1");
    		int sel[] = new int[a2[0].length];
    		for(int i = 0; i < sel.length; i++){
    			sel[i] = a2[0][i];
    		}
    		selectionSort(sel);
    		
    		System.out.println("Selection Sort Iteration: 2");
    		int sel2[] = new int[a2[1].length];
    		for(int i = 0; i < sel2.length; i++){
    			sel2[i] = a2[1][i];
    		}
    		selectionSort(sel2);
    		
    		System.out.println("Selection Sort Iteration: 3");
    		int sel3[] = new int[a2[2].length];
    		for(int i = 0; i < sel3.length; i++){
    			sel3[i] = a2[2][i];
    		}
    		selectionSort(sel3);
    		
    		System.out.println("Selection Sort Iteration: 4");
    		int sel4[] = new int[a2[3].length];
    		for(int i = 0; i < sel4.length; i++){
    			sel4[i] = a2[3][i];
    		}
    		selectionSort(sel4);
    		
    		System.out.println("Selection Sort Iteration: 5");
    		int sel5[] = new int[a2[4].length];
    		for(int i = 0; i < sel5.length; i++){
    			sel5[i] = a2[4][i];
    		}
    		selectionSort(sel5);
    	

    }

    
}