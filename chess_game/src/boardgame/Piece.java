package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //mesmo que eu nao colocasse nada, ele ja colocaria como nulo
	}

	protected Board getBoard() { //classes no mesmo pacote e subclasses
		return board;
	}

	//não permito que meu board seja alterado
	
	

}
