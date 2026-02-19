package src.methods.Level3;
import java.util.Scanner;
public class MatrixManipulation{
    public static int[][] createMatrix(int r,int c){
        int[][]mat=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)mat[i][j]=(int)(Math.random()*10);
        return mat;
    }
    public static int[][] transpose(int[][]mat){
        int r=mat.length,c=mat[0].length;
        int[][]res=new int[c][r];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)res[j][i]=mat[i][j];
        return res;
    }
    public static int determinant2x2(int[][]mat){
        return mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
    }
    public static int determinant3x3(int[][]mat){
        return mat[0][0]*(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])
                -mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])
                +mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0]);
    }
    public static double[][] inverse2x2(int[][]mat){
        double det=determinant2x2(mat);
        if(det==0){System.out.println("Inverse not possible"); return null;}
        double[][]res={{mat[1][1]/det,-mat[0][1]/det},{-mat[1][0]/det,mat[0][0]/det}};
        return res;
    }
    public static double[][] inverse3x3(int[][]mat){
        double det=determinant3x3(mat);
        if(det==0){System.out.println("Inverse not possible"); return null;}
        double[][]res=new double[3][3];
        res[0][0]=(mat[1][1]*mat[2][2]-mat[1][2]*mat[2][1])/det;
        res[0][1]=-(mat[0][1]*mat[2][2]-mat[0][2]*mat[2][1])/det;
        res[0][2]=(mat[0][1]*mat[1][2]-mat[0][2]*mat[1][1])/det;
        res[1][0]=-(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])/det;
        res[1][1]=(mat[0][0]*mat[2][2]-mat[0][2]*mat[2][0])/det;
        res[1][2]=-(mat[0][0]*mat[1][2]-mat[0][2]*mat[1][0])/det;
        res[2][0]=(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0])/det;
        res[2][1]=-(mat[0][0]*mat[2][1]-mat[0][1]*mat[2][0])/det;
        res[2][2]=(mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0])/det;
        return res;
    }
    public static void printMatrix(int[][]mat){
        for(int[]row:mat){for(int val:row)System.out.print(val+" ");System.out.println();}
    }
    public static void printMatrix(double[][]mat){
        if(mat==null)return;
        for(double[]row:mat){for(double val:row)System.out.printf("%.2f ",val);System.out.println();}
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and cols: "); int r=sc.nextInt(); int c=sc.nextInt();
        int[][]mat=createMatrix(r,c);
        System.out.println("Original Matrix:"); printMatrix(mat);
        System.out.println("Transpose:"); printMatrix(transpose(mat));
        if(r==2 && c==2){System.out.println("Determinant: "+determinant2x2(mat)); System.out.println("Inverse:"); printMatrix(inverse2x2(mat));}
        else if(r==3 && c==3){System.out.println("Determinant: "+determinant3x3(mat)); System.out.println("Inverse:"); printMatrix(inverse3x3(mat));}
        else System.out.println("Determinant and inverse only for 2x2 or 3x3");
    }
}
