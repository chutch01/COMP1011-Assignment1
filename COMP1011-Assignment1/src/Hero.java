/**
 * 
 * @author chutc_000
 * @program Description: Assignment to make a hero do some basic functions
 * @version:0.1
 * Assignment 1 Worth 10%
 * due Jan 30th
 * date modified: Jan 27th
 */
public class Hero {
//private variables
	
	private int strength;
	private int speed;
	private int health;
	private int hit;
	private int hitAmount;
	
//public variables	
	public String name;

//constructor
public Hero(String name){
	this.name = name;
	generateAbilities();
}

//public methods

/*
 * public method that will let the hero fight, and run the hitAttempt method
 * 
 */
public void fight() {
	
	hitAttempt();
}
/*
 * public method that will print out the hero's stats
 */
public void showAbilites(){
System.out.println("+++++++++++++++++++");
System.out.println("Strength: " + this.strength);
System.out.println("Speed: " + this.speed);
System.out.println("Health: " + this.health);
System.out.println("+++++++++++++++++++");
}

//private methods
/*
 * private method that will generate the ability stats
 */
private void generateAbilities(){
	this.strength = (int)(Math.random() * 100 +1);
	this.speed = (int)(Math.random() * 100 +1);
	this.health = (int)(Math.random() * 100 +1);
}
/*
 * private method that will attempt to make a hit. if it does,
 * run the damage amount, if not, print a "miss" message
 */
private void hitAttempt(){
	this.hit = (int)(Math.random()*100 +1);
	
	if (hit >= 80){
		System.out.println(this.name + " successfully hit the target!");
		hitDamage();
	}
	
	if (hit < 80){
		System.out.println(this.name + " missed!");
	}
}
/*
 * private method that calculates the damage done
 */
private void hitDamage(){
	
	this.hitAmount = (int)(Math.random()*6 +1) * this.strength;
	System.out.println("You hit for " + this.hitAmount + " damage!");

}








}