import java.util.Scanner;
class arrdecasc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int[] arr=new int[n];
    int i,j,temp;
    System.out.println("please enter elements in the array");
    for(i=0;i<n;i++){
     arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("Sorted arr in increasing order:-");
    for(j=0;j<n;j++){
        System.out.println(arr[j]);
    }
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

    }
    System.out.println("sorted arr in decreasing order-");
    for(j=0;j<n;j++){
    System.out.println(arr[j]);
    }
}
}
