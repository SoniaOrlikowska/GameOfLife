public class Rules {

    Cell cell = new Cell();

    public Rules(Cell cell) {
        this.cell = cell;
    }

    //Any live cell with fewer than two live neighbours dies, as if by underpopulation
    boolean firstRule(int cellValue, int x, int y, int[][] board) {

        if (cell.isALIVE(cellValue) && cell.neighboursCount(board, x, y) < 2) {
            return cell.DEAD;
        } else return cell.ALIVE;

    }

    //Any live cell with two or three live neighbours lives on to the next generation.
    boolean secondRule(int cellValue, int x, int y, int[][] board) {

        if (cell.isALIVE(cellValue) && (cell.neighboursCount(board, x, y) == 2 || cell.neighboursCount(board, x, y) == 3)) {
            return cell.ALIVE;
        } else return cell.ALIVE;
    }

    //Any live cell with more than three live neighbours dies, as if by overpopulation.
    boolean thirdRule(int cellValue, int x, int y, int[][] board) {
        if (cell.isALIVE(cellValue) && cell.neighboursCount(board, x, y) > 3) {
            return cell.DEAD;
        } else return cell.ALIVE;

    }

    //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
    boolean fourthRule(int cellValue, int x, int y, int[][] board) {
        if (cell.isDEAD(cellValue) && cell.neighboursCount(board, x, y) == 3) {
            return cell.ALIVE;
        } else return cell.DEAD;
    }

}
