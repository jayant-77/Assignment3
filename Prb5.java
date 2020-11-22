package Assignment3;
class Prb5
{
    public static void main(String args[])
    {
        int count =0,k=0;
        double n1 =45.286;
        double n2 =3.14159;
        
        while(n1!=((int)n1))
        {
            count++;
            n1 = n1*10;
        }   
        System.out.println("Output ="+count);
         
        
        while(n2!=((int)n2))
        {
            k++;
            n2=n2*10;
        }
        System.out.println("Output ="+k);
    }
}