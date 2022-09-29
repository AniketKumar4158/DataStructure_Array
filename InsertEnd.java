import java.util.Scanner;

public class InsertEnd{
    
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        System.out.println("Enter " +limit+" number of array");
        for(int i = 0; i<limit; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your output");
        for(int i=0;i<limit;i++){
            System.out.print(arr[i] + " ");
        }

        
        insertEnd(arr,limit);
    }
    private static void insertEnd(int [] arr , int j){
        Scanner sc= new Scanner(System.in);
        if(arr.length <= j){
            System.out.println("Sorry I can't Insert Element because array size full");
            System.exit(0);
        }
        System.out.println("Input number");
    
        arr[j+1]= sc.nextInt();
        arr[j]= arr[j+1];
        // System.out.println(arr[j+1]);
        System.out.println("Yours new array is:");
        for(int i=0;i<=j;i++){
            System.out.print(arr[i] +" ");
        }
    }
}