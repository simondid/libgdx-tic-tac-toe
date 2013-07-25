package View;

import Sceene.GameScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.me.mygdxgame.MainClass;

public class WorldHandler {
	MainClass game;
	
	int[] positionItem =new int[9];

	
	public WorldHandler(MainClass game) {
		// TODO Auto-generated constructor stub
	this.game = game;
	Gdx.input.setInputProcessor(new InputProcessor(this));
	
	for(int i =0;i<positionItem.length;i++){
		positionItem[i] = 99;
	}

	}


	public void update(float dt) {
		// TODO Auto-generated method stub
		checkForWinner();
			
			
			
		
	}


	private void checkForWinner() {
		// TODO Auto-generated method stub
		if(positionItem[0]==0 &&positionItem[1]==1 && positionItem[2]==2 ){
			Gdx.app.log("winner", "player x wins");
		}
		if(positionItem[3]==3 &&positionItem[4]==4 && positionItem[5]==5 ){
			Gdx.app.log("winner", "player x wins");
		}
		if(positionItem[6]==6 &&positionItem[7]==7 && positionItem[8]==8 ){
			Gdx.app.log("winner", "player x wins");
		}
		if(positionItem[4]==4){
			if(positionItem[0]==0 && positionItem[8]==8){
				Gdx.app.log("winner", "player x wins");

			}
		}
		if(positionItem[4]==4){
			if(positionItem[2]==2 && positionItem[6]==6){
				Gdx.app.log("winner", "player x wins");

			}
		}
		if(positionItem[0]==0 &&positionItem[3]==3 && positionItem[6]==6 ){
			Gdx.app.log("winner", "player x wins");
		}
		if(positionItem[1]==1 &&positionItem[4]==4 && positionItem[7]==7 ){
			Gdx.app.log("winner", "player x wins");
		}
		if(positionItem[2]==2 &&positionItem[5]==5 && positionItem[8]==8 ){
			Gdx.app.log("winner", "player x wins");
		}
		
		// O checking 
		if(positionItem[0]==9 &&positionItem[1]==10 && positionItem[2]==11 ){
			Gdx.app.log("winner", "player y wins");
		}
		if(positionItem[3]==12 &&positionItem[4]==13 && positionItem[5]==14 ){
			Gdx.app.log("winner", "player y wins");
		}
		if(positionItem[6]==15 &&positionItem[7]==16 && positionItem[8]==17 ){
			Gdx.app.log("winner", "player y wins");
		}
		if(positionItem[4]==13){
			if(positionItem[0]==9 && positionItem[8]==17){
				Gdx.app.log("winner", "player y wins");

			}
		}
		if(positionItem[4]==13){
			if(positionItem[2]==11 && positionItem[6]==15){
				Gdx.app.log("winner", "player y wins");

			}
		}
		if(positionItem[0]==9 && positionItem[3]==12 && positionItem[6]==15 ){
			Gdx.app.log("winner", "player y wins");
		}
		if(positionItem[1]==10 &&positionItem[4]==13 && positionItem[7]==16 ){
			Gdx.app.log("winner", "player y wins");
		}
		if(positionItem[2]== 11 &&positionItem[5]==14 && positionItem[8]==17 ){
			Gdx.app.log("winner", "player y wins");
		}
	}


	public int[] getPositionItem() {
		return positionItem;
	}


	public void setPositionItem(int[] positionItem) {
		this.positionItem = positionItem;
	}


	
	
}