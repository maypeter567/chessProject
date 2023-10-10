package chess.pieces;

import chess.ChessGame;
import chess.ChessPieceImp;
import chess.ChessPositionImp;

public class Knight  extends ChessPieceImp {
    public Knight(String color) {
        this.myType = PieceType.KNIGHT;
        if (color == "w") {
            this.myColor = ChessGame.TeamColor.WHITE;
        } else if (color == "b") {
            this.myColor = ChessGame.TeamColor.BLACK;
        }
    }
}
