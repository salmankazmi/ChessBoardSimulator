package com.chessboard.objects;

import com.chessboard.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Horse implements ChessPiece {
    @Override
    public List<String> calculatePosition(String rowPosition, int colPosition) {
        int row = Utils.getRowNumber(rowPosition);
        int col = colPosition;
        List<String> possibleMoves = new ArrayList<>();

        /**
         * possibilities array for house movement
         */
        int[] rowStepsArray = new int[]{ 2, 2, -2, -2, 1, 1, -1, -1 };
        int[] colStepsArray = new int[]{ -1, 1, 1, -1, 2, -2, 2, -2 };

        /**
         * horse movement formula
         * (row + rowStep[i], col + colStep[i])s
         */
        for (int i = 0; i <= 7; i++) {
            int estimatedRowPosition = row + rowStepsArray[ i ];
            int estimatedColumnPosition = col + colStepsArray[ i ];

            /**
             * validate estimated position.
             * position must in between 1 to 8 for column and A to H for Row
             */

            if ((estimatedRowPosition > 0 && estimatedRowPosition <= 8 ) &&
                            ( estimatedColumnPosition > 0 && estimatedColumnPosition <= 8 )) {
                possibleMoves.add(String.format("%s,", Utils.getRowLetter(estimatedRowPosition) + estimatedColumnPosition));
            }
        }

        return possibleMoves;
    }
}
