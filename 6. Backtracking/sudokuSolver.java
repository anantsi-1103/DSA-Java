public class sudokuSolver {

    public static boolean sudokoSolv(int sudoku1[][], int row, int col) {
        if (row == 9) {
            return true;
        }

        // calculate for next cell
        int nextRow = row;
        int nextCol = col + 1;

        if(col + 1 == 9){
            nextRow = row +1;
            nextCol = 0;
        }

        // cell already filled
        if(sudoku1[row][col] != 0){
            return sudokoSolv(sudoku1, nextRow, nextCol);
        }

        // kaam
        for(int digit = 0 ; digit <= 9 ; digit++){
            if(isSafe(sudoku1, row, col, digit)){
                sudoku1[row][col] = digit;
                if(sudokoSolv(sudoku1, nextRow, nextCol)){
                    return true;
                    // exist krtha hai solution
                }
                sudoku1[row][col]= 0; // backtrack
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku1[][], int row, int col, int digit) {
        // column check
        for (int i = 0; i < 9; i++) {
            if (sudoku1[i][col] == digit) {
                return false;
            }
        }

        // row check
        for (int j = 0; j < 9; j++) {
            if (sudoku1[row][j] == digit) {
                return false;
            }
        }

        // cell check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku1[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku1[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku1[][] = {
                { 9, 1, 3, 0, 0, 0, 5, 0, 0 },
                { 6, 0, 7, 0, 0, 0, 0, 2, 4 },
                { 0, 5, 0, 0, 8, 0, 0, 7, 0 },
                { 0, 7, 9, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 2, 0, 9, 0, 0, 4, 3 },
                { 0, 0, 0, 0, 0, 4, 0, 9, 0 },
                { 0, 4, 0, 0, 0, 1, 9, 0, 0 },
                { 7, 0, 6, 0, 0, 9, 0, 0, 5 },
                { 0, 0, 1, 0, 0, 6, 4, 0, 7 }
        };

        if(sudokoSolv(sudoku1, 0, 0)){
            System.out.println("Solution Exist");
            printSudoku(sudoku1);
        }
        else{
            System.out.println("Soltution not Exist");
        }

    }
}
