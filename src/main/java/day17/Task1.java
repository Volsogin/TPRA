package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] pieces1 = {
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK
        };
        ChessPiece[] pieces2 = {
                ChessPiece.PAWN_BLACK,
                ChessPiece.PAWN_BLACK,
                ChessPiece.PAWN_BLACK,
                ChessPiece.PAWN_BLACK,
                ChessPiece.ROOK_WHITE,
                ChessPiece.ROOK_WHITE,
                ChessPiece.ROOK_WHITE,
                ChessPiece.ROOK_WHITE
        };

        for (ChessPiece piece1 : pieces1) {
            System.out.print(piece1);
        }
        System.out.println("\nНаоборот");

        for (ChessPiece piece2 : pieces2) {
            System.out.print(piece2);
        }


    }
}