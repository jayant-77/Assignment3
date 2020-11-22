package Assignment3;
class Prb4
{
    
         
    
    public static void main(String args[])
    {
        int temp=0;
       int arr1[]= {139,5,35,14,90};
        int n1 =arr1.length;
        
        int arr2[]= {88,67,35,14,-12};
        int n2 =arr2.length;
        
        int arr3[]= {65,14,129,34,7};
        int n3 =arr3.length;
        
      //  array(arr1,arr2,arr3,n1,n2,n3);
        
        for (int i=0;i<n1;i++)
        {
            for (int j=i+1;j<n1;j++)
            {
                //array in Ascending order
        while(arr1[i]>arr1[j])
        {
            temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
           // System.out.println("Output :Ascending");
        }
        
            
         //array in Descending order
         while(arr2[i]<arr2[j])
        {
            temp=arr2[i];
            arr2[i]=arr2[j];
            arr2[j]=temp;
        }
           while(arr3[i]<n3)
        {
            temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
        }
        
            }
        }
          System.out.print("Output : Ascending"+" ");
       for (int i=0;i<n1;i++)
        {
            System.out.print(arr1[i]+" ");
           // System.out.print("Output : Ascending");
        }
       System.out.println();
       System.out.print("Output : Descending"+" ");
       for (int i=0;i<n1;i++)
        {
            System.out.print(arr2[i]+" ");
           // System.out.print("Output : Ascending");
        }
        System.out.println();
        System.out.print("Output : Random"+" ");
       for (int i=0;i<n1;i++)
        {
            System.out.print(arr3[i]+" ");
           // System.out.print("Output : Ascending");
        }
    }
}
