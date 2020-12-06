package com.chessboard;

import com.chessboard.objects.ChessPiece;
import com.chessboard.objects.PieceFactory;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().runProgram();
    }

    private void runProgram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter type of Chess Piece and it\'s position in \'King D5\' format:");
        String userInput = sc.nextLine();
        String values[] = userInput.split(" ");
        generateOuput(values[0], values[1]);
    }

    private void generateOuput(String chessPiece, String position) {
        ChessPiece rook = PieceFactory.getChessPiece(chessPiece);
        String rowPosition = String.valueOf(position.charAt(0)).toUpperCase();
        Integer columnPosition = Character.digit(position.charAt(1), 10);
        List<String> possibleMoves = rook.calculatePosition(rowPosition,columnPosition);
        possibleMoves.forEach(System.out::print);
    }
}
