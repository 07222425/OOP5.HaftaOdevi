import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LargestRowColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        Random random = new Random();
        System.out.println("The random array is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> maxRows = new ArrayList<>();
        ArrayList<Integer> maxCols = new ArrayList<>();
        int maxRowCount = -1;
        int maxColCount = -1;

        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRows.clear();
                maxRows.add(i);
            } else if (rowCount == maxRowCount) {
                maxRows.add(i);
            }
        }

        for (int j = 0; j < n; j++) {
            int colCount = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxCols.clear();
                maxCols.add(j);
            } else if (colCount == maxColCount) {
                maxCols.add(j);
            }
        }

        System.out.print("The largest row index: ");
        for (int i = 0; i < maxRows.size(); i++) {
            System.out.print(maxRows.get(i) + (i < maxRows.size() - 1 ? ", " : ""));
        }
        System.out.println();

        System.out.print("The largest column index: ");
        for (int i = 0; i < maxCols.size(); i++) {
            System.out.print(maxCols.get(i) + (i < maxCols.size() - 1 ? ", " : ""));
        }
        System.out.println();
    }
}