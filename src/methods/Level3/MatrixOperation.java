package src.methods.Level3;
import java.util.Scanner;
public class MatrixOperation{
    public static int[][] createMatrix(int r,int c){
        int[][]mat=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)mat[i][j]=(int)(Math.random()*10);
        return mat;
    }
    public static int[][] addMatrix(int[][]a,int[][]b){
        int r=a.length,c=a[0].length;
        int[][]res=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    public static int[][] subtractMatrix(int[][]a,int[][]b){
        int r=a.length,c=a[0].length;
        int[][]res=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    public static int[][] multiplyMatrix(int[][]a,int[][]b){
        int r=a.length,c=b[0].length,n=a[0].length;
        int[][]res=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)for(int k=0;k<n;k++)res[i][j]+=a[i][k]*b[k][j];
        return res;
    }
    public static void printMatrix(int[][]mat){
        for(int[]row:mat){for(int val:row)System.out.print(val+" ");System.out.println();}
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and cols of first matrix: "); int r1=sc.nextInt(); int c1=sc.nextInt();
        System.out.print("Enter rows and cols of second matrix: "); int r2=sc.nextInt(); int c2=sc.nextInt();
        if(c1!=r2){System.out.println("Cannot multiply matrices");return;}
        int[][]mat1=createMatrix(r1,c1);
        int[][]mat2=createMatrix(r2,c2);
        System.out.println("Matrix 1:"); printMatrix(mat1);
        System.out.println("Matrix 2:"); printMatrix(mat2);
        System.out.println("Addition:"); printMatrix(addMatrix(mat1,mat1)); // Addition valid only if same size
        System.out.println("Subtraction:"); printMatrix(subtractMatrix(mat1,mat1));
        System.out.println("Multiplication:"); printMatrix(multiplyMatrix(mat1,mat2));
    }
}
