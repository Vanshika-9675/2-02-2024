import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the No. of rows:");
        int n = sc.nextInt();
        
        System.out.println("Enter the No. of colums:");
        int m= sc.nextInt();
        
        System.out.println("Enter the matrix:");
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
   
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp.add(matrix[i][j]);
            }
        }
        Collections.sort(temp);
        System.out.println(temp);
        sc.close();
    }
}
