import java.util.Scanner;

public class Array_01index {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n= scanner.nextInt();
        int []a=new int[n];
        System.out.println("Enter your Array Element:");
        for (int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("Your Array is: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter that element of Array which one you want to get index:");
        int index=scanner.nextInt();
        for (int i=0;i<a.length;i++){
            if(a[i]==index){
                System.out.println("The index of "+index+" is: "+i);
            }
        }
    }
}
