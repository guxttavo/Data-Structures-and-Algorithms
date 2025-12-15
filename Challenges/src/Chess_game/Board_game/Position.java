package Chess_game.Board_game;

public class Position {

    public int row;
    public int col;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
