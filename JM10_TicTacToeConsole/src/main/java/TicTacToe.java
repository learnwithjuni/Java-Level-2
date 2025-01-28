public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    // Initialize the board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current board
    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Place a mark at the cell specified by row and col
    public boolean placeMark(int row, int col) {
        if (row >= 0 && col >= 0 && row < 3 && col < 3) {
            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                return true;
            }
        }
        return false;
    }

    // Check if the board is full
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Check for a win
    public boolean checkForWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) ||
                    (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            return true;
        }

        return false;
    }

    // Change player
    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    // Getter for current player
    public char getCurrentPlayer() {
        return currentPlayer;
    }
}
