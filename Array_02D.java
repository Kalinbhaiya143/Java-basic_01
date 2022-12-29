import java.util.Scanner;

public class Array_02D {
    public static void main(String[] args) {
        int[][]a=new int[][]{{ 10,20},{30,40,50,60},{70,80,90}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

/*
public class Array_02D {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of n-order:");
        int n= scanner.nextInt();
        System.out.println("Enter the size of m-order:");
        int m= scanner.nextInt();
        int[][]a=new int[n][m];
        System.out.println("Enter your exapected element:");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("According to you,some special index check:");
        System.out.println(a[0][0]);
        System.out.println(a[1][0]);
        System.out.println(a[2][0]);
        System.out.println("Length of Array:"+a.length);
        System.out.println("Your Exapected output:");
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
 */