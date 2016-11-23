package groupProject;

public class Player {
	//fields
	int gamesWon;
	int gamesLost;
	int playerSquaresDel;
	int opponentSquarsDel;
	
	//methods
	public void setGamesWon(int won){
		gamesWon = won;
	}
	
	public int getGamesWon(){
		return gamesWon;
	}
	
	public void setGamesLost(int lost){
		gamesLost = lost;
	}
	
	public int getGamesLost(){
		return gamesLost;
	}
	
	public void setPlayerSquaresDeleted(int playerDel){
		playerSquaresDel = playerDel;
	}
	
	public int getPlayerSquaresDeleted(){
		return playerSquaresDel;
	}

	public void setOpponentSquaresDeleted(int opponentDel){
		opponentSquarsDel = opponentDel;
	}
	
	public int getOpponentSquaresDeleted(){
		return opponentSquarsDel;
	}
}
