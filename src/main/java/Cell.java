public class Cell {

    boolean ALIVE = true;
    boolean DEAD = false;

    public Cell(){

    }
    public Cell(int x, int y) {


    }

    int cellState(int boardState) {

        if (boardState == 1) return 1;
        else return 0;

    }

    boolean isDEAD(int i) {
        if (i == 0) ;
        return DEAD;
    }

    boolean isALIVE(int i) {
        if (i == 1) ;
        return ALIVE;
    }

    public int neighboursCount(int[][] board, int x, int y) {

        int neighboursCount = 0;

        if (board[x + 1][y] == 1) ;
        neighboursCount++;

        if (board[x - 1][y] == 1) ;
        neighboursCount++;

        if (board[x][y + 1] == 1) ;
        neighboursCount++;

        if (board[x][y - 1] == 1) ;
        neighboursCount++;

        if (board[x + 1][y + 1] == 1) ;
        neighboursCount++;

        if (board[x + 1][y - 1] == 1) ;
        neighboursCount++;

        if (board[x - 1][y + 1] == 1) ;
        neighboursCount++;

        if (board[x - 1][y - 1] == 1) ;
        neighboursCount++;


        return neighboursCount;

    }
}
