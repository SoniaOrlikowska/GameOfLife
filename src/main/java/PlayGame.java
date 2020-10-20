public class PlayGame {

    public static void main(String[] args) {

        int[][] initialStateBoard = new InitialState().getInitialStateBoard();
        int[][] playBoard;

        playBoard = initialStateBoard;

        Cell cell = new Cell();
        Rules rules = new Rules(cell);

        for (int i = 1; i < playBoard.length - 1; i++) {
            for (int j = 1; j < playBoard[i].length - 1; j++) {
                System.out.print(playBoard[i][j] + " ");

                int cellState = cell.cellState(playBoard[i][j]);
                if (rules.firstRule(cellState, i, j, playBoard)) playBoard[i][j] = 0;

            }
            System.out.println();
        }
        System.out.println("");

        for (int k = 1; k < playBoard.length - 1; k++) {
            for (int p = 1; p < playBoard.length - 1; p++) {
                System.out.print(playBoard[k][p] + " ");

            }
            System.out.println();
        }


    }

}



