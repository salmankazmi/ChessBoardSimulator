package com.chessboard.objects;

import com.chessboard.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements ChessPiece {
    @Override
    public List<String> calculatePosition(String rowPosition, int colPosition) {
        int row = Utils.getRowNumber(rowPosition);
        int col = colPosition;
        List<String> possibleMoves = new ArrayList<>();

        if (col != 1 && col != 8) {
            possibleMoves.add(String.format("%s,", Utils.getRowLetter(row) + ( col + 1 )));
            possibleMoves.add(String.format("%s,", Utils.getRowLetter(row) + ( col - 1 )));
        }
        return possibleMoves;
    }
}
