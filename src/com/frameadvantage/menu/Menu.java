package com.frameadvantage.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.frameadvantage.character.Balrog;
import com.frameadvantage.character.SFCharacter;
import com.frameadvantage.main.Attack;

public class Menu {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	SFCharacter character;
	
	public SFCharacter characterSelectMenu() {
		
		System.out.println("1.  Abigail");
		System.out.println("2.  Akuma");
		System.out.println("3.  Alex");
		System.out.println("4.  Balrog (Boxer)");
		System.out.println("5.  Birdie");
		System.out.println("6.  Blanka");
		System.out.println("7.  Cammy");
		System.out.println("8.  Chun-Li");
		System.out.println("9.  Cody");
		System.out.println("10. Dhalsim");
		System.out.println("11. Ed");
		System.out.println("12. Falke");
		System.out.println("13. F.A.N.G");
		System.out.println("14. G");
		System.out.println("15. Guile");
		System.out.println("16. Ibuki");
		System.out.println("17. Juri");
		System.out.println("18. Kage");
		System.out.println("19. Karin");
		System.out.println("20. Kent");
		System.out.println("21. Kolin");
		System.out.println("22. Laura");
		System.out.println("23. M.Bison(Dictator)");
		System.out.println("24. Menat");
		System.out.println("25. Nash");
		System.out.println("26. Necalli");
		System.out.println("27. Rashid");
		System.out.println("28. R. Mika");
		System.out.println("29. Ryu");
		System.out.println("30. Sagat");
		System.out.println("31. Sakura");
		System.out.println("32. Urien");
		System.out.println("33. Vega (Claw)");
		System.out.println("34. Zangief");
		System.out.println("35. Zeku");
		
		
		System.out.print("Enter Fighter Selection by Number: ");
		int characterSelect = 0;
		
		try {
			characterSelect = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		switch(characterSelect) {

			case 4: 
				character = new Balrog("Balrog");
				System.out.println("---------------------------------------------");
				System.out.println("\nCharacter Selected: " + character.getName());
				System.out.println("\n----------------------------------------------");
				break;
				
			default:
				System.out.println("Coming Soon!");
		}
		
		return character;
	}
	
	public Attack knockdownMenu(ArrayList<Attack> knockdownMoveList) throws NumberFormatException, IOException {
		
		System.out.print("\nChoose your one of your character's KD moves for frame kill to meaty.");
		
		for(Attack knockdownAttack : knockdownMoveList) {
			int selectionNumber = 1;
			System.out.println("\n" + selectionNumber + ".  " + knockdownAttack.getName());
			selectionNumber++;
		}
		
		System.out.print("Selection: ");
		int numberInput = Integer.parseInt(reader.readLine());
		
		Attack knockdownSelection = knockdownMoveList.get(numberInput - 1);
		
		return knockdownSelection;	
	}
	
}
