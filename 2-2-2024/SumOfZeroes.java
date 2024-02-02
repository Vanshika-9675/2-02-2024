import java.util.Scanner;

public class SumOfZeroes {
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

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix[i][j]==0) {
                    if(i-1>=0 && matrix[i-1][j]==1){
                        count++;
                    }
                    if(i+1<n && matrix[i+1][j]==1){
                        count++;
                    }
                    if(j-1>=0 && matrix[i][j-1]==1){
                        count++;
                    }
                    if(j+1<m && matrix[i][j+1]==1){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
