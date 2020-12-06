package com.chessboard.objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * The queen can be moved any number of unoccupied squares in a straight
 * line vertically, horizontally, or diagonally.
 * The Queen is a combination of Rook and Bishop
 */
public class Queen implements ChessPiece {
    @Override
    public List<String> calculatePosition(String rowPosition, int colPosition) {
        List<String> possibleMoves = new ArrayList<>();
        List<String> rookMovement = new Rook().calculatePosition(rowPosition, colPosition);
        List<String> bishopMovement = new Bishop().calculatePosition(rowPosition, colPosition);

        Set<String> union = new HashSet<>(rookMovement);
        union.addAll(bishopMovement);
        possibleMoves.addAll(union);
        return possibleMoves;
    }
}
