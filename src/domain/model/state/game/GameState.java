package domain.model.state.game;

import domain.model.Game;

/**
 * 
 * @author Sander Willems
 *
 */

public interface GameState {
	
	public void proceed(Game g);

}
