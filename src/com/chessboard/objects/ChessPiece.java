package com.chessboard.objects;

import java.util.List;

public interface ChessPiece {
    List<String> calculatePosition(String rowPosition, int colPosition);
}
