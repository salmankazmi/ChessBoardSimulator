package com.chessboard.objects;

import com.chessboard.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Bishop implements ChessPiece{
    @Override
    public List<String> calculatePosition(String rowPosition, int colPosition) {
        int row = Utils.getRowNumber(rowPosition);
        int col = colPosition;
        List<String> possibleMoves = new ArrayList<>();

        for (int i = 1; i <= row; i++) {
            if (row - i > 0) {
                possibleMoves.add(String.format("%s,", Utils.getRowLetter(row - i) + ( col + i )));
            }
        }

        for (int i = 1; i <= ( 8 - col ); i++) {
            if (( row + i ) <= 8) {
                possibleMoves.add(String.format("%s,", Utils.getRowLetter(row + i) + ( col + i )));
            }
        }

        for (int i = 1; i <= ( 8 - row ); i++) {
            if (( col - i ) > 0) {
                possibleMoves.add(String.format("%s,", Utils.getRowLetter(row + i) + ( col - i )));
            }
        }

        for (int i = row; i >= 0; i--) {
            if (col - i > 0 && col - i != col) {
                possibleMoves.add(String.format("%s,", Utils.getRowLetter(row - i) + ( col - i )));
            }
        }
        return possibleMoves;
    }
}
