package Assignment3;
class Prb6
{
   

static void thirdLargest(int arr[], 
                         int arr_size) 
{ 
    /* There should be  
    atleast three elements */
    if (arr_size < 3) 
    { 
        System.out.println(" Invalid Input "); 
        return; 
    } 
  
    // Find first  
    // largest element 
    int first = arr[0]; 
    for (int i = 1; 
             i < arr_size ; i++) 
        if (arr[i] > first) 
            first = arr[i]; 
  
    // Find second  
    // largest element 
    int second = Integer.MIN_VALUE; 
    for (int i = 0;  
             i < arr_size ; i++) 
        if (arr[i] > second &&  
            arr[i] < first) 
            second = arr[i]; 
  
    // Find third 
    // largest element 
    int third = Integer.MIN_VALUE; 
    for (int i = 0;  
             i < arr_size ; i++) 
        if (arr[i] > third &&  
            arr[i] < second) 
            third = arr[i]; 
  
    System.out.println("The third Largest : " + third); 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 24,54,31,16,82,45,67};
    int n = arr.length; 
    thirdLargest(arr,n);
    
}
}