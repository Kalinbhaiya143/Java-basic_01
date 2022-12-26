import java.util.Scanner;

/*
public class Array_03D {
    public static void main(String[] args) {
        int[][][]a=new int[][][]{{{10,20},{30,40,50,60},{70,80,90}},{{110,120,130,140},{150,160,170,180}}};
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    //System.out.println(a[i][j][k]+" ");
                    //System.out.println(a[i][j][k]);
                    System.out.println(a[0][1]);
                }
                System.out.println(" ");
            }
        }
    }
}
 */
public class Array_03D {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of x-order:");
        int x= scanner.nextInt();
        System.out.println("Enter the size of y-order:");
        int y= scanner.nextInt();
        System.out.println("Enter the size of z-order:");
        int z=scanner.nextInt();
        int[][][]a=new int[x][y][z];
        System.out.println("Enter your exapected element:");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=scanner.nextInt();
                }
            }
        }
        System.out.println("According to you,some special index check:");
        System.out.println(a[0][0][0]);
        System.out.println(a[1][0][0]);
        System.out.println(a[2][0][0]);
        System.out.println(a[0][1][0]);
        System.out.println(a[1][1][0]);
        System.out.println(a[2][1][0]);
        System.out.println("Length of Array:"+a.length);
        System.out.println("Your Exapected output:");
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);
                }
            }
        }
    }
}

