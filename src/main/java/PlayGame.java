public class PlayGame {

    int[][] initialStateBoard = new InitialState().getInitialStateBoard();
    int[][] playBoard;

    public PlayGame() {

        playBoard = initialStateBoard;

        Cell cell = new Cell();
        Rules rules = new Rules(cell);

        for (int i = 0; i < initialStateBoard.length; i++) {
            for (int j = 0; j < initialStateBoard.length; j++) {
                int cellState = cell.cellState(playBoard[i][j]);

                if (rules.firstRule(cellState, i, j, playBoard)){
                  playBoard[i][j] = 0;

                    }
                }
            }

        }
    }

