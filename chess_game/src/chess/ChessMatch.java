package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { //regras do jogo
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8); //nessa classe que eu digo que é 8x8
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){ //retornar peças de xadrez
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows();i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j); //downcasting
			}
		}
		return mat;
	}
	
	private void initialSetup() {//coloca as peças no tabuleiro
		board.placePiece(new Rook(board,Color.WHITE), new Position (2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}

}
