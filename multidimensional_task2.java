import java.util.Scanner;

public class multidimensional_task2 {
    public static void main(String[] args) {
        System.out.print("Please enter your Array row:");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        System.out.print("Please enter your Array column:");
        int column = scan.nextInt();

        int matrix[][] = new int[row][column];

        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){

                System.out.print("Enter your "+i+". Row Index "+j+". Column Index Value:" );
                matrix[i][j] = scan.nextInt();
            }

        }
        for (int i = 0; i<row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }
        int transpose[][] = new int[column][row];
        int a = 0;
        int k = 0;
        int m = 0;
        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }

        }
        System.out.println("The Inverse Array is Like this::::");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println();
        }
    }
    }
