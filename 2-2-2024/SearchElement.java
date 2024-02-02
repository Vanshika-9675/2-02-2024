import java.util.Scanner;

/**
 * SearchElement
 */
public class SearchElement {

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
        
        System.out.println("Enter the element to be searched:");
        int x= sc.nextInt();
        
        boolean flag = false;
       int i=0;
       int j=m-1;
       while (i<n && j>=0) {
           if(matrix[i][j]==x){
             flag=true;
             break;
           }
           if(matrix[i][j]>x){     
            j--;
           }
           else if(matrix[i][j]<x){
            i++;
           }
       } 
        System.out.println(flag);
        sc.close();
    }
}