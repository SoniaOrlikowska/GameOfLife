public class NeighboursCounter {


    InitialState initialState = new InitialState();
    int[][] board = initialState.getInitialStateBoard();
    int[][] neighboursBoard = new int[board.length][board.length];


    public NeighboursCounter() {

        //initial matrix
        System.out.println("Initial matrix");
        for (int x = 0; x <= board.length - 1; x++) {
            for (int y = 0; y <= board.length - 1; y++) {
                System.out.print(board[x][y] + " ");
            }
            System.out.println("");
        }

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                //green square
                if (x > 0 && x < board.length - 1 && y > 0 && y < board.length - 1) {
                    int neighboursCount = 0;
                    if (board[x + 1][y] == 1)
                        neighboursCount++;

                    if (board[x - 1][y] == 1)
                        neighboursCount++;

                    if (board[x][y + 1] == 1)
                        neighboursCount++;

                    if (board[x][y - 1] == 1)
                        neighboursCount++;

                    if (board[x + 1][y + 1] == 1)
                        neighboursCount++;

                    if (board[x + 1][y - 1] == 1)
                        neighboursCount++;

                    if (board[x - 1][y + 1] == 1)
                        neighboursCount++;

                    if (board[x - 1][y - 1] == 1)
                        neighboursCount++;

                    neighboursBoard[x][y] = neighboursCount;
                }

                //left border without corners
                if (x > 0 && x < board.length - 1 && y == 0) {
                    int neighboursCount2 = 0;

                    if (board[x + 1][y] == 1)
                        neighboursCount2++;

                    if (board[x - 1][y] == 1)
                        neighboursCount2++;

                    if (board[x][y + 1] == 1)
                        neighboursCount2++;

                    if (board[x + 1][y + 1] == 1) {
                        neighboursCount2++;
                    }

                    if (board[x - 1][y + 1] == 1)
                        neighboursCount2++;

                    neighboursBoard[x][y] = neighboursCount2;
                }
                //right border without corners
                if (x > 0 && x < board.length - 1 && y == board.length - 1) {
                    int neighboursCount3 = 0;

                    if (board[x + 1][y] == 1)
                        neighboursCount3++;

                    if (board[x - 1][y] == 1)
                        neighboursCount3++;

                    if (board[x][y - 1] == 1)
                        neighboursCount3++;

                    if (board[x + 1][y - 1] == 1)
                        neighboursCount3++;

                    if (board[x - 1][y - 1] == 1)
                        neighboursCount3++;

                    neighboursBoard[x][y] = neighboursCount3;
                }

                //top border without corners
                if (x == 0 && y > 0 && y < board.length - 1) {
                    int neighboursCount4 = 0;

                    if (board[x + 1][y] == 1)
                        neighboursCount4++;

                    if (board[x][y + 1] == 1)
                        neighboursCount4++;

                    if (board[x][y - 1] == 1)
                        neighboursCount4++;

                    if (board[x + 1][y + 1] == 1) {
                        neighboursCount4++;
                    }
                    if (board[x + 1][y - 1] == 1)
                        neighboursCount4++;

                    neighboursBoard[x][y] = neighboursCount4;

                }
                //top border without corners
                if (x == board.length - 1 && y > 0 && y < board.length - 1) {
                    int neighboursCount5 = 0;

                    if (board[x - 1][y] == 1)
                        neighboursCount5++;

                    if (board[x][y + 1] == 1)
                        neighboursCount5++;

                    if (board[x][y - 1] == 1)
                        neighboursCount5++;

                    if (board[x - 1][y + 1] == 1)
                        neighboursCount5++;

                    if (board[x - 1][y - 1] == 1)
                        neighboursCount5++;

                    neighboursBoard[x][y] = neighboursCount5;

                }

                // top left corner
                if ((x == 0 && y == 0)) {
                    int neighboursCount6 = 0;

                    if (board[x + 1][y] == 1)
                        neighboursCount6++;

                    if (board[x][y + 1] == 1)
                        neighboursCount6++;

                    if (board[x + 1][y + 1] == 1)
                        neighboursCount6++;

                    neighboursBoard[x][y] = neighboursCount6;

                }

                // bottom left corner
                if ((x == 0 && y == board.length - 1)) {
                    int neighboursCount7 = 0;

                    if (board[x + 1][y] == 1)
                        neighboursCount7++;

                    if (board[x][y - 1] == 1)
                        neighboursCount7++;

                    if (board[x + 1][y - 1] == 1)
                        neighboursCount7++;

                    neighboursBoard[x][y] = neighboursCount7;
                }

                // top right corner
                if ((x == board.length - 1 && y == 0)) {
                    int neighboursCount8 = 0;

                    if (board[x - 1][y] == 1)
                        neighboursCount8++;

                    if (board[x][y + 1] == 1)
                        neighboursCount8++;

                    if (board[x - 1][y + 1] == 1)
                        neighboursCount8++;

                    neighboursBoard[x][y] = neighboursCount8;
                }

                // bottom right corner
                if ((x == board.length - 1 && y == board.length - 1)) {
                    int neighboursCount9 = 0;

                    if (board[x - 1][y] == 1)
                        neighboursCount9++;

                    if (board[x][y - 1] == 1)
                        neighboursCount9++;

                    if (board[x - 1][y - 1] == 1)
                        neighboursCount9++;

                    neighboursBoard[x][y] = neighboursCount9;
                }

            }
        }
        System.out.println(" ");
        System.out.println("Neighbours matrix");
        for (int v = 0; v <= board.length - 1; v++) {
            for (int n = 0; n <= board.length - 1; n++) {
                System.out.print(neighboursBoard[v][n] + " ");
            }
            System.out.println("");

        }
    }

    public int[][] getNeighboursBoard() {
        return neighboursBoard;
    }
}