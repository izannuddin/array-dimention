package ArrayOneDimensional;

public class Example1ZombieKiller {

	public static void main(String[] args) {
	System.out.println("Welcome to our zombie killer programm!!!!!)");
	
	String backpack[]={"Shotgun", "assault rifle"	, "sniper"};
	String zombies[]={"close-range", "mid-range", "long-range zombies"};	
	int zombiesHATE[]= {4,90,70,123,561};
	
	int zombiesNotHate[] = new int[4];
	zombiesNotHate[0]=1;
	zombiesNotHate[1]=10;
	zombiesNotHate[2]=100;
	zombiesNotHate[3]=1000;
	
	
	System.out.println("backpack items!");
	System.out.println(backpack[0]);
	System.out.println(backpack[1]);
	System.out.println(backpack[2]);
	
	
	System.out.println("zombies items!");
	System.out.println(zombies[0]);
	System.out.println(zombies[1]);
	System.out.println(zombies[2]);
	
	System.out.println("number zombie Hate");
	System.out.println(zombiesHATE[2]);
	
	System.out.println("number zombie NotHate");
	System.out.println(zombiesNotHate[1]);
	System.out.println(zombiesNotHate[2]);
	System.out.println(zombiesNotHate[3]);
	
	
	
	
	
	}

}
