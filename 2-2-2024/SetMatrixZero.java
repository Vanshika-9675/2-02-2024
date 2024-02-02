import java.util.Scanner;

/**
 * SetMatrixZero
 */
public class SetMatrixZero {

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
        boolean rows[] = new boolean[n];
        boolean col[]= new boolean[m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                  if(matrix[i][j]==0){
                      rows[i]= true;
                      col[j] = true;
                  }
            }
        }
        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(rows[i]){
                        matrix[i][j]=0;
                    }
                    if(col[j]){
                        matrix[i][j]=0;
                    }
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
       sc.close();
    }
}