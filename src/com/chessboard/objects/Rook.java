package com.chessboard.objects;

import com.chessboard.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Rook implements ChessPiece {

    @Override
    public List<String> calculatePosition(String rowPosition, int colPosition) {
        int row = Utils.getRowNumber(rowPosition);
        int col = colPosition;
        List<Integer> rowNumbers = Utils.getRowNumbers();
        List<String> possibleMoves = new ArrayList<>();

        for (int i : rowNumbers) {
            if (i == row) {
                for (int j = 1; j <= 8; j++) {
                    if (j != col) {
                        possibleMoves.add(String.format("%s%s,", Utils.getRowLetter(i), j));
                    }
                }
            } else {
                possibleMoves.add(String.format("%s%s,", Utils.getRowLetter(i), col));
            }
        }
        return possibleMoves;
    }
}
