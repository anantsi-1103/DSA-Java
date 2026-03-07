public class nqueens_one {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueen(char board[][], int row) {
        // base
        if (row == board.length) {
            return true;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueen(board, row + 1)) {
                    return true;
                } // function call

            }
            board[row][j] = 'x';
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("------- Chess Board --------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // intialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        if(nQueen(board, 0)){
            System.out.println("Solution is Exist");
            printBoard(board);
        }
        else{
            System.out.println("Solution not exist");
        }
    }

}
