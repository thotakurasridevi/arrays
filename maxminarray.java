import java.util.Scanner;
 class maxminarray  {
    public static void main(String args[]) {
        int count, max, min, i,n;
        double Avg;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        Avg=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of elements");
        count = sc.nextInt();
        System.out.println(  "Number of array Elements:"+count);
         
        for(i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
   
        max = min = arr[0];
         
        for(i = 1; i < count; i++) {
          
            if(arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
                
        }
        for ( i = 0; i < n; i++) {
            sum += arr[i];
        }
 
         Avg = sum / n;
        
        System.out.println("Max Number : " + max);
        System.out.println("Min Number : " + min);
        System.out.println("Average of array : "+Avg);
    }
}
