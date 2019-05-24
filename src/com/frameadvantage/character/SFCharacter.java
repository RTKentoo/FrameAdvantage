package com.frameadvantage.character;

import java.util.ArrayList;

import com.frameadvantage.main.Attack;

public class SFCharacter {

	private String name;
	private int dash;
	private int forwardThrow;

	// Standing normals
	Attack standLightPunch 	= new Attack();
	Attack standMediumPunch = new Attack();
	Attack standHeavyPunch 	= new Attack();
	Attack standLightKick 	= new Attack();
	Attack standMediumKick 	= new Attack();
	Attack standHeavyKick 	= new Attack();
	
	// Crouch normals
	Attack crouchLightPunch = new Attack();
	Attack crouchMediumPunch = new Attack();
	Attack crouchHeavyPunch	= new Attack();
	Attack crouchLightKick 	= new Attack();
	Attack crouchMediumKick = new Attack();
	Attack crouchHeavyKick	= new Attack();
	
	public SFCharacter() {
		
	}
	
	public SFCharacter(String name) {
		this.name = name;
	}
	
	public ArrayList<Attack> createMoveList() {
		
		ArrayList<Attack> moveList 	= new ArrayList<>();

		moveList.add(standLightPunch);
		moveList.add(standMediumPunch);
		moveList.add(standHeavyPunch);
		moveList.add(standLightKick);
		moveList.add(standMediumKick);
		moveList.add(standHeavyKick);
		moveList.add(crouchLightPunch);
		moveList.add(crouchMediumPunch);
		moveList.add(crouchHeavyPunch);
		moveList.add(crouchHeavyPunch);
		moveList.add(crouchLightKick);
		moveList.add(crouchMediumKick);
		moveList.add(crouchHeavyKick);
		
		return moveList;
	}
	
	public ArrayList<Attack> createKnockdownMoveList(ArrayList<Attack> moveList) {
		
		ArrayList<Attack> knockdownMoveList = new ArrayList<>();
		
		for(Attack attack : moveList) {
			if(attack.getKnockdown() == true) {
				knockdownMoveList.add(attack);
			}
		}
		
		return knockdownMoveList;	
	}
	

	public int getDash() {
		return dash;
	}
	
	public int getForwardThrow() {
		return forwardThrow;
	}
	
	public String getName() {
		return name;
	}

	

}
