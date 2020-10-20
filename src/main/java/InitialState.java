public class InitialState{

    int[][] initialStateBoard = new int[40][40];

    public InitialState() {

        initialStateBoard[10][10] = 1;
        initialStateBoard[11][10] = 1;
        initialStateBoard[12][10] = 1;
    }

    public int[][] getInitialStateBoard() {
        return initialStateBoard;
    }
}