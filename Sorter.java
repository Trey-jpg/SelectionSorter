class Sorter
{ 
    void sort(int[] arr) 
    { 
        int n = arr.length; 
  
        //for loop checks each bucket one by one 
        for (int i = 0; i < n-1; i++) 
        { 
            //Min in arr + repeat for finding mins least-greatest 
            int index = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[index]) 
                    index = j; 
            int temp = arr[index]; 
            arr[index] = arr[i]; 
            arr[i] = temp; 
        }
    }
    //printArray for Driver to read in arr
        void printArray(int[] arr) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    
}


