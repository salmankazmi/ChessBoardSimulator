package com.chessboard.objects;

public class PieceFactory {
    public static ChessPiece getChessPiece(String type){
        switch(type) {
            case "Rook":
                return new Rook();
            case "King":
                return new King();
            case "Queen":
                return new Queen();
            case "Bishop":
                return new Bishop();
            case "Horse":
                return new Horse();
            case "Pawn":
                return new Pawn();
            default:
                return null;
        }
    }
}
