import java.util.Scanner;

public class PrintUpperMatrix {
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
        for(int k=0;k<n;k++){
            int i=0;
            int j=k;
            while(i<n && j<n){
                System.out.print(matrix[i][j]+" ");
                i++;
                j++;
            }
            System.out.println();
        }
        sc.close();
      
    }
}
