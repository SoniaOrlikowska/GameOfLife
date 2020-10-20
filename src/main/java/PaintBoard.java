import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

//todo
// 1. Warunki poczatkowe: pare randomowych punktów na mapie
// 2. Pierwszy krok: sprawdzam warunki dla istniejącej mapy, zamieniam komorki tam gdzie trzeba, zapisuję to jako nowy stan inicjalizacyjny
// 3. Powtarzam krok pierwszy n razy.


public class PaintBoard extends Canvas {
    public static void main(String[] args) {

        JFrame boardFrame = new JFrame("Game of Life");
        Canvas canvas = new PaintBoard();
        canvas.setSize(400, 400);
        boardFrame.add(canvas);
        boardFrame.pack();
        boardFrame.setVisible(true);

    }

    public void paint(Graphics g) {

        int[][] initialStateBoard = new InitialState().getInitialStateBoard();

        int[][] gameBoard = initialStateBoard;
        Cell cell = new Cell();

        for (int i = 1; i < initialStateBoard.length + 2; i++) {
            for (int j = 1; j < initialStateBoard.length + 2; j++) {

                if (gameBoard[i][j] == 1) g.fillRect(i, j, 10, 10);

            }
        }

    }

}
