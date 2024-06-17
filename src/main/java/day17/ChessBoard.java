package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board){
        this.board = board;
    }

    public void print() {
        for (ChessPiece[] row : board) {
            for (ChessPiece piece : row) {
                System.out.print(piece);
            }
            System.out.println();
        }
    }

}
