import java.util.Scanner;
import java.util.Arrays;


public class Que1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("put the value of matrix = ");
        int v = sc.nextInt();
        int [][] m = new int [v][v];               
        int n = m.length;
        
            for(int a = 0; a < v; a++) {
            for (int b=0; b<v; b++) {
                m[a][b] = sc.nextInt();
            }}
            int i =0;
            int j =0;
            int sum = 0;
            for( i = 0; i <m.length; i++) {
            for ( j= i; j<m[0].length; j++) {
                    if (i == j) {
                    sum =sum + m[i][j];
                    break;  
            }   
        }
            }for( i = 0; i <m.length; i++) {
            for ( j= 0; j<m[0].length; j++) {
                    if (i + j == m.length-1) {
                    sum =sum + m[i][j];
                    break;  
            } }  
        }   if (m.length %2 == 1) {
            i = m.length/2;
            sum =sum - m[i][i];
            }   
        System.out.println("sum = " + sum);
    }}
