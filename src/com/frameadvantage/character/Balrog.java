package com.frameadvantage.character;

import java.util.ArrayList;

import com.frameadvantage.main.Attack ;

public class Balrog extends SFCharacter {
	
	private String name;
	
	private int dash = 17;
	private int forwardThrow = 16;
	
	// Standing normals
	Attack standLightPunch 	= new Attack("s.lp", 4, 2, 7, 5, 3, false);
	Attack standMediumPunch = new Attack("s.mp", 5, 4, 13, 2, 0, false);
	Attack standHeavyPunch 	= new Attack("s.hp", 12, 2, 19, 0, -3, false);
	Attack standLightKick 	= new Attack("s.lk", 3, 2, 8, 2, 1, false);
	Attack standMediumKick 	= new Attack("s.mk", 6, 3, 12, 5, 2, false);
	Attack standHeavyKick 	= new Attack("s.hk", 9, 3, 22, 7, 3, false);
	
	// Crouch normals
	Attack crouchLightPunch = new Attack("c.lp", 4, 3, 7, 4, 3, false);
	Attack crouchMediumPunch = new Attack("c.mp", 6, 3, 12, 4, 2, false);
	Attack crouchHeavyPunch	= new Attack("c.hp", 8, 5, 22, -1, -5, false);
	Attack crouchLightKick 	= new Attack("c.lk", 4, 3, 8, 4, 1, false);
	Attack crouchMediumKick = new Attack("c.mk", 7, 2, 17, 2, -2, false);
	Attack crouchHeavyKick	= new Attack("c.hk", 8, 2, 26, 0, -14, true);
	
	// moves that cause knockdown
	private int KnockdownRecoverStandHp = 16;
	private int KnockdownRecoverCrouchHp = 58;
	private int KnockdownRecoverCrouchHk = 22;
	private int KnockdownRecoverThrow = 16;
	private int KnockdownRecoverBackThrow = 12;
	private int KnockdownRecoverExDashPunch = 33;
	
	public Balrog() {
		
	}
	
	public Balrog(String name) {
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

	public int getKnockdownRecoverStandHp() {
		return KnockdownRecoverStandHp;
	}
	public int getKnockdownRecoverCrouchHp() {
		return KnockdownRecoverCrouchHp;
	}
	public int getKnockdownRecoverCrouchHk() {
		return KnockdownRecoverCrouchHk;
	}
	public int getKnockdownRecoverThrow() {
		return KnockdownRecoverThrow;
	}
	public int getKnockdownRecoverBackThrow() {
		return KnockdownRecoverBackThrow;
	}
	public int getKnockdownRecoverExDashPunch() {
		return KnockdownRecoverExDashPunch;
	}

	

}
