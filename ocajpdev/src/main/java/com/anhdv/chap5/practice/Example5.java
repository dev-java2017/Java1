package com.anhdv.chap5.practice;

public class Example5 {
	public static void main(String[] args) {
		Food food = new Food();
		Meat meat = new Meat();
		Gum gum = new Gum();
		System.out.print(food instanceof Chewable);
		System.out.print(food instanceof Food);
		System.out.print(meat instanceof Eatable);
		System.out.print(gum instanceof Eatable);
		System.out.print(gum instanceof Chewable);
	}
}
interface Chewable {}
interface Eatable extends Chewable{}
class Food implements Eatable { }
class Meat extends Food {}
class Gum implements Chewable{}
