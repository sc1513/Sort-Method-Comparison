package sort;

public class Sort {
	
	
	
	
	public static int myarray1[] = {1,2,30,4,5,6,7,22,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,17,22,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,22,9,10,11,2,13,4,15,16,17,18,19,20,1,2,3,2,5,6,7,22,9,10,11,12,13,14,15,1,17,18,19,20,1,2,3,4,5,6,7,22,9,10,7,12,13,14,15,16,17,18,19,20};
	public static int myarray2[] = {20,2,-3,4,5,-7,6,8,9,10,-11,12,13,-14,15,16,17,18,-19,1};
	public static int myarray3[] = {1000,200,30,423,5343,6234,744,8323,9234,1044,1241,1232,1323,1344,154,146,2317,318,319,20};
	public static int myarray4[] = {1000,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	public static int myarray5[] = {1,2,30,4,5,6,7,22,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,17,22,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,22,9,10,11,2,13,4,15,16,17,18,19,20,1,2,3,2,5,6,7,22,9,10,11,12,13,14,15,1,17,18,19,20,1,2,3,4,5,6,7,22,9,10,7,12,13,14,15,16,17,18,19,20};
	public static int myarray6[] = {20,2,-3,4,5,-7,6,8,9,10,-11,12,13,-14,15,16,17,18,-19,1};
	public static int myarray7[] = {1000,200,30,423,5343,6234,744,8323,9234,1044,1241,1232,1323,1344,154,146,2317,318,319,20};
	public static int myarray8[] = {1000,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	public static int myarray9[] = {1,2,30,4,5,6,7,22,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,17,22,9,10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,22,9,10,11,2,13,4,15,16,17,18,19,20,1,2,3,2,5,6,7,22,9,10,11,12,13,14,15,1,17,18,19,20,1,2,3,4,5,6,7,22,9,10,7,12,13,14,15,16,17,18,19,20};
	public static int myarray10[] = {20,2,-3,4,5,-7,6,8,9,10,-11,12,13,-14,15,16,17,18,-19,1};
	public static int myarray11[] = {1000,200,30,423,5343,6234,744,8323,9234,1044,1241,1232,1323,1344,154,146,2317,318,319,20};
	public static int myarray12[] = {1000,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	
	// INSERTION SORT METHOD
	// might need to re think if I need a return array statement
	public static void insertionSort (int [] list) {
			int j = 0;
			int temp = 0;
			
			for (int i = 0; i < list.length; ++i ) {
			j = i;
				while ( j > 0 && list[j] < list[j -1]) {
					temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
					--j;
				}
			}
	}
	
	public static int partition(int arr[], int low, int high) {
		        int pivot = arr[high];  
		        int i = (low - 1); // index of smaller element 
		        for (int j = low; j < high; j++) 
		        { 
		            // If current element is smaller than the pivot 
		            if (arr[j] < pivot) 
		            { 
		                i++; 
		  
		                // swap arr[i] and arr[j] 
		                int temp = arr[i]; 
		                arr[i] = arr[j]; 
		                arr[j] = temp; 
		            } 
		        } 
		  
		        // swap arr[i+1] and arr[high] (or pivot) 
		        int temp = arr[i + 1]; 
		        arr[i + 1] = arr[high]; 
		        arr[high] = temp; 
		  
		        return i + 1; 
		    } 
	
	public static void quickSort(int [] arr, int  low, int high) {
			
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(arr, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            quickSort(arr, low, pi -1); 
	            quickSort(arr, pi + 1, high); 
	        } 
	    } 
	
	
	// MERGE SORT METHOD
	
	
	public static void Merge (int [] numbers, int i, int j, int k) {
		   int mergedSize = k - i + 1;                
		   int mergePos = 0;                          
		   int leftPos = 0;                         
		   int rightPos = 0;                          
		   int [] mergedNumbers = new int[mergedSize];   // Dynamically allocates temporary array
		                                         // for merged numbers
		   
		   leftPos = i;                           // Initialize left partition position
		   rightPos = j + 1;                      // Initialize right partition position
		   
		   // Add smallest element from left or right partition to merged numbers
		   while (leftPos <= j && rightPos <= k) {
		      if (numbers[leftPos] <= numbers[rightPos]) {
		         mergedNumbers[mergePos] = numbers[leftPos];
		         ++leftPos;
		      }
		      else {
		         mergedNumbers[mergePos] = numbers[rightPos];
		         ++rightPos;
		         
		      }
		      ++mergePos;
		   }
		   
		   // If left partition is not empty, add remaining elements to merged numbers
		   while (leftPos <= j) {
		      mergedNumbers[mergePos] = numbers[leftPos];
		      ++leftPos;
		      ++mergePos;
		   }
		   
		   // If right partition is not empty, add remaining elements to merged numbers
		   while (rightPos <= k) {
		      mergedNumbers[mergePos] = numbers[rightPos];
		      ++rightPos;
		      ++mergePos;
		   }
		   
		   // Copy merge number back to numbers
		   for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
		      numbers[i + mergePos] = mergedNumbers[mergePos];
		   }
		}

		public static void mergeSort(int [] numbers, int i, int k) {
		   int j = 0;
		   
		   if (i < k) {
		      j = (i + k) / 2;  // Find the midpoint in the partition
		      
		      // Recursively sort left and right partitions
		      mergeSort(numbers, i, j);
		      mergeSort(numbers, j + 1, k);
		      
		      // Merge left and right partition in sorted order
		      Merge(numbers, i, j, k);
		   }
		}

	
	
	
	// NANO SECOND METHOD
	public static void nanoSecondInsertion (int [] list) {
	
		// Start Nano time
		
				long startTime = System.nanoTime();
				insertionSort(list);
				long estimatedTime = System.nanoTime() - startTime;
				
				System.out.print(estimatedTime);
				System.out.println(" Nano Seconds.");
				System.out.print("(" + list[0]);
				for (int i = 1; i < list.length; ++i) {
					System.out.print(", " + list[i]);
					
				}
				System.out.println(")");
	}
	
	public static void nanoSecondQuick (int [] list, int low, int high) {
		
		// Start Nano time
		
		long startTime = System.nanoTime();
		quickSort(list, 0, list.length -1);
		long estimatedTime = System.nanoTime() - startTime;
		
		System.out.print(estimatedTime);
		System.out.println(" Nano Seconds.");
		System.out.print("(" + list[0]);
		for (int i = 1; i < list.length; ++i) {
			System.out.print(", " + list[i]);
			
		}
		System.out.println(")");
		
		
	}
	
	//polymorphism for nanoSecond
	
	public static void nanoSecondMerge (int [] list, int a, int b) {
		

		// Start Nano time
		
		long startTime = System.nanoTime();
		mergeSort(list, 0, list.length -1);
		long estimatedTime = System.nanoTime() - startTime;
		
		System.out.print(estimatedTime);
		System.out.println(" Nano Seconds.");
		System.out.print("(" + list[0]);
		for (int i = 1; i < list.length; ++i) {
			System.out.print(", " + list[i]);
			
		}
		System.out.println(")");
		
		
	}
	
	
	// MAIN METHOD
	
	public static void main(String[] args) {
		
		//Test Arrays
		
		System.out.println("Insertion Sort");
		//Insertion Sort
		nanoSecondInsertion(myarray1);
		nanoSecondInsertion(myarray2);
		nanoSecondInsertion(myarray3);
		nanoSecondInsertion(myarray4);
		
		System.out.println();
		System.out.println("Quick Sort");
		//Quick Sort
		nanoSecondQuick(myarray5, 1, myarray5.length - 1);
		nanoSecondQuick(myarray6, 1, myarray6.length - 1);
		nanoSecondQuick(myarray7, 1, myarray7.length - 1);
		nanoSecondQuick(myarray8, 1, myarray8.length - 1);
		
		System.out.println();
		System.out.println("Merge Sort");
		//Merge Sort
		nanoSecondMerge(myarray9, 0, myarray9.length - 1);
		nanoSecondMerge(myarray10, 0, myarray10.length - 1);
		nanoSecondMerge(myarray11, 0, myarray11.length - 1);
		nanoSecondMerge(myarray12, 0, myarray12.length - 1);
		
		
	

	}

}
