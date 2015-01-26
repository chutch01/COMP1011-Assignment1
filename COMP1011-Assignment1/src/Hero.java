/**
 * 
 * @author chutc_000
 * @program Description: Assignment to make a hero do some basic functions
 * @version:0.1
 * Assignment 1 Worth 10%
 * due Jan 30th
 */
public class Hero {
//private variables
	
	private int strength;
	private int speed;
	private int health;
	
//public variables	
	public String name;

//constructor
public Hero(String name){
	this.name = name;
	generateAbilities();
}

//public methods
public void fight() {

}





//private methods
private void generateAbilities(){
	this.strength = (int)(Math.random() * 100 +1);
	this.speed = (int)(Math.random() * 100 +1);
	this.health = (int)(Math.random() * 100 +1);
}

private void hitAttempt(){
	
}

private void hitDamage(){
	
}








}