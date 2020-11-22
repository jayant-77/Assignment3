package Assignment3;
import java.util.*;
class Prb3
{
   
    
    public static void main(String args[])
    {
         int k,j;
        Scanner fc = new Scanner (System.in);
        System.out.println("Enter a starting number  =");
        int n = fc.nextInt();
        System.out.println("Enter a last number  =");
        int m = fc.nextInt();
        
       // int arr[]=new int [m];
        
        for(int i=n;i<=m;i++)
        
        {
            if (i%2 ==0)
               
            {
                k = i*i;
                
            }
            else
            {
                k= i*i*i;
                
            }
             System.out.print(k+" ");
        }
       //System.out.println(+j);
    }
}   

