package chess;

import boardgame.Board;

public class ChessMatch { //regras do jogo
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8); //nessa classe que eu digo que é 8x8
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

}
