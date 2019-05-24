package com.frameadvantage.main;

import java.io.IOException;
import java.util.ArrayList;

import com.frameadvantage.calculation.FrameCalculator;
import com.frameadvantage.character.Balrog;
import com.frameadvantage.character.SFCharacter;
import com.frameadvantage.menu.Menu;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Menu menu = new Menu();
		FrameCalculator frameCalculation = new FrameCalculator();
		
		SFCharacter character = menu.characterSelectMenu();
		
		//testing
		ArrayList<Attack> moveList = character.createMoveList();
		ArrayList<Attack> knockdownMoveList = character.createKnockdownMoveList(moveList);
		
		Attack knockdownSelection = menu.knockdownMenu(knockdownMoveList);
		
		
		
		
	}		

}
