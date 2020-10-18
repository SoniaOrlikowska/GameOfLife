public class InitialState{

    int[][] initialStateBoard = new int[400][400];

    public InitialState() {

        initialStateBoard[100][100] = 1;
        initialStateBoard[110][100] = 1;
        initialStateBoard[120][100] = 1;
    }

    public int[][] getInitialStateBoard() {
        return initialStateBoard;
    }
}