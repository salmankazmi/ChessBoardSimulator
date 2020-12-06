package com.chessboard.objects;

import com.chessboard.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class King implements ChessPiece {
    @Override
    public List<String> calculatePosition(String rowPosition, int colPosition) {
        int row = Utils.getRowNumber(rowPosition);
        int col = colPosition;
        List<String> possibleMoves = new ArrayList<>();

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (row - i != 0) {
                    if (col - j > 0 && col - j <= 8) {
                        if (!((row - i) == row && (col - j) == col)) {
                            possibleMoves.add(String.format("%s,", Utils.getRowLetter(row - i) + (col - j)));
                        }
                    }
                }
            }
        }
        return possibleMoves;
    }
}
