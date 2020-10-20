public class Cell {

    boolean ALIVE = true;
    boolean DEAD = false;

    public Cell() {

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

    public int[][] neighboursCount(int[][] board, int cellx, int celly ) {
        NeighboursCounter neighboursCounter = new NeighboursCounter();

        return neighboursCounter.getNeighboursBoard();

    }
}
