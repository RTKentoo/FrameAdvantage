package com.frameadvantage.main;

public class Attack {
	
	private String name;
	
	private boolean knockdown;
	
	private int startup;
	private int active;
	private int recovery;
	private int onBlock;
	private int onHit;
	private int damage;
	private int stun;
	private int reach;
	
	public Attack() {
		
	}
	
	public Attack(String name, int startup, int active, int recovery, int onHit, int onBlock, boolean knockdown) {
		this.name = name;
		this.startup = startup;
		this.active = active;
		this.recovery = recovery;
		this.onHit = onHit;
		this.onBlock = onBlock;
		this.knockdown = knockdown;
	}
	
	public String getName() {
		return name;
	}
	public boolean isKnockDown() {
		return knockdown;
	}
	public int getStartup() {
		return startup;
	}
	public int getActive() {
		return active;
	}
	public int getRecovery() {
		return recovery;
	}
	public int getDamage() {
		return damage;
	}
	public int getStun() {
		return stun;
	}
	public int getReach() {
		return reach;
	}
	public boolean getKnockdown() {
		return knockdown;
	}
	
}
