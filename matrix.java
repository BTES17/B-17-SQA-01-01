 import java.util.Scanner;
public class twoD {
public static void main (String[] args) {

Scanner scanner = new Scanner (System.in);

System.out.println("Enter matrix 1: ");
int [][] matrix = new int [4][3];
for(int i=0;i<4;i++) 
{
for(int j=0;j<3;j++)
{
matrix [i][j] = scanner.nextInt();
}
for(i=0;i<4;i++)
{
 for(int j=0;j<3;j++)
{
System.out.println(matrix[i][j]);
}}
}
}
} 