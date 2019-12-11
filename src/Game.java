import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		System.out.println("You enter a house to a hallway, the door locks behind you.");
		System.out.println("You have to find another way out.");
		First();
	}		
	public static void First() {
		Scanner one = new Scanner(System.in);
		System.out.println("The door is to your South and locked...");
		System.out.println("Which way are you going to go? East or west:");
		char mOne = one.next().charAt(0);
		
		if (mOne == 'W') {
			Eighth();
		}
		else if (mOne == 'E') {
			Second();
		}
		else if (mOne == 'w') {
			Eighth();
		}
		else if (mOne == 'e') {
			Second();
		}
		else if (mOne == '?') {
			Twelth();
		}
			else {
				System.out.println("Please enter East or West.");
				First();
			}
	}
	public static void Second() {
		Scanner two = new Scanner(System.in);
		System.out.println("You come to door along the hallway.");
		System.out.println("Which way are you going to go? East, West or North through the door:");
		char mTwo = two.next().charAt(0);
		
		if (mTwo == 'W') {
			First();
		}
		else if (mTwo == 'w') {
			First();
		}
		else if (mTwo == 'E') {
			System.out.println("You turn the coner.");
			Fourth();
		}
		else if (mTwo == 'e') {
			System.out.println("You turn the coner.");
			Fourth();
		}
		else if (mTwo == 'N') {
			Third();
		}else if (mTwo == 'n') {
			Third();
		}
			else {
				System.out.println("Please enter East, West or North.");
				Second();
			}
	}
	public static void Third() {
		Scanner three = new Scanner(System.in);
		System.out.println("You are in a room.");
		System.out.println("In the room which way do you look? Left, Right, or South to exit the room:");
		char mThree = three.next().charAt(0);
		
		if (mThree == 'L') {
			System.out.println("You see the number 7 written on the wall.");
			System.out.println("Do you look around more or leave? Left, Right, or South to exit:");
			Third();
		}
		else if (mThree == 'l') {
			System.out.println("You see the number 7 written on the wall.");
			System.out.println("Do you look around more or leave? Left, Right, or South to exit:");
			Third();
		}
		else if (mThree == 'R') {
			System.out.println("You see nothing.");
			Third();
		}
		else if (mThree == 'r') {
			System.out.println("You see nothing.");
			Third();
			}
		else if (mThree == 'S') {
			Second();
		}
		else if (mThree == 's') {
			Second();
		}
		else {
			System.out.println("Please enter Left Right or South.");
			Third();
		}
	}
	public static void Fourth() {
		Scanner four = new Scanner(System.in);
		System.out.println("You come to two closet doors on either side of the hallway.");
		System.out.println("Do you open doors or continue on?");
		System.out.println("East (through the door), West (through the door), North, or South:");
		char mFour = four.next().charAt(0);
		
		if (mFour == 'E') {
			System.out.println("Nothing inside.");
			Fourth();
		}
		else if (mFour == 'e') {
			System.out.println("Nothing inside.");
			Fourth();
		}
		else if (mFour == 'W') {
			System.out.println("Nothing inside.");
			Fourth();
		}
		else if (mFour == 'w') {
			System.out.println("Nothing inside.");
			Fourth();
		}
		else if (mFour == 'N') {
			Fifth();
		}else if (mFour == 'n') {
			Fifth();
		}
		else if (mFour == 'S') {
			System.out.println("You turn the coner (West).");
			Second();
		}else if (mFour == 's') {
			System.out.println("You turn the coner (West).");
			Second();
		}
			else {
				System.out.println("Please enter East, West, South, North.");
				Fourth();
			}
	}
	public static void Fifth() {
		Scanner five = new Scanner(System.in);
		System.out.println("You come to a closet in the hallway.");
		System.out.println("Do you open  door or continue on?");
		System.out.println("West (through the door), North, or South:");
		char mFive = five.next().charAt(0);
		
		if (mFive == 'W') {
			System.out.println("Nothing inside.");
			Fifth();
		}
		else if (mFive == 'w') {
			System.out.println("Nothing inside.");
			Fifth();
		}
		else if (mFive == 'N') {
			Sixth();
		}
		else if (mFive == 'n') {
			System.out.println("Nothing inside.");
			Sixth();
		}
		else if (mFive == 'S') {
			Fourth();
		}
		else if (mFive == 's') {
			Fourth();
		}
			else {
				System.out.println("Please enter West, North, or South.");
				Fifth();
			}
	}
	public static void Sixth() {
		Scanner two = new Scanner(System.in);
		System.out.println("You come to door at the coner of the hallway.");
		System.out.println("what do you do? West, East (open door), or South:");
		char mTwo = two.next().charAt(0);
		
		if (mTwo == 'W') {
			System.out.println("You turn down the hallway.");
			Seventh();
		}
		else if (mTwo == 'w') {
			System.out.println("You turn down the hallway.");
			Seventh();
		}
		else if (mTwo == 'E') {
			System.out.println("Nothing inside.");
			Sixth();
		}
		else if (mTwo == 'e') {
			System.out.println("Nothing inside.");
			Sixth();
		}
		else if (mTwo == 'S') {
			Fifth();
		}else if (mTwo == 's') {
			Fifth();
		}
			else {
				System.out.println("Please enter West, East, or South.");
				Sixth();
			}	
	}
	public static void Seventh() {
		Scanner seven = new Scanner(System.in);
		System.out.println("You're at the end of the hallway, you see two doors.");
		System.out.println("what do you do? South (open door), North (open door) , or East (down hallway):");
		char mSeven = seven.next().charAt(0);
		
		if (mSeven == 'N') {
			System.out.println("You see the number 4 written on the wall.");
			Seventh();
		}
		else if (mSeven == 'n') {
			System.out.println("You see the number 4 written on the wall.");
			Seventh();
		}
		else if (mSeven == 'S') {
			System.out.println("You see nothing in the room.");
			Seventh();
		}
		else if (mSeven == 's') {
			System.out.println("You see nothing in the room.");
			Seventh();
			}
		else if (mSeven == 'E') {
			Sixth();
		}
		else if (mSeven == 'e') {
			Sixth();
		}
		else {
			System.out.println("Please enter North, South, or east.");
			Seventh();
		}
	}
	public static void Eighth() {
		Scanner eight = new Scanner(System.in);
		System.out.println("You come to a closet in the hallway.");
		System.out.println("Do you open  door or continue on?");
		System.out.println("North (Look in door), East, or West:");
		char mEight = eight.next().charAt(0);
		
		if (mEight == 'N') {
			System.out.println("Nothing inside.");
			Eighth();
		}
		else if (mEight == 'n') {
			System.out.println("Nothing inside.");
			Eighth();
		}
		else if (mEight == 'W') {
			System.out.println("You turn a corner(North).");
			Ninth();
		}
		else if (mEight == 'w') {
			System.out.println("You turn a corner(North).");
			Ninth();
		}
		else if (mEight == 'E') {
			First();
		}
		else if (mEight == 'e') {
			First();
		}
			else {
				System.out.println("Please enter West, North, or South.");
				Eighth();
			}
	}
	public static void Ninth() {
		Scanner nine = new Scanner(System.in);
		System.out.println("You come to door along the hallway.");
		System.out.println("Which way are you going to go? East(Through the door), South or North:");
		char mNine = nine.next().charAt(0);
	
		if (mNine == 'N') {
			System.out.println("You turn a corner(East).");
			Eleventh();
		}
		else if (mNine == 'n') {
			System.out.println("You turn a corner(East).");
			Eleventh();
		}
		else if (mNine == 'E') {
			System.out.println("You go through the door.");
			Tenth();
		}
		else if (mNine == 'e') {
			System.out.println("You go through the door.");
			Tenth();
		}
		else if (mNine == 'S') {
			Eighth();
		}else if (mNine == 's') {
			Eighth();
		}
			else {
				System.out.println("Please enter East, North or South.");
				Ninth();
			}
	}
	public static void Tenth() {
		Scanner ten = new Scanner(System.in);
		System.out.println("You are in a room.");
		System.out.println("In the room which way do you look? North, South, or West to exit the room:");
		char mTen = ten.next().charAt(0);
		
		if (mTen == 'N') {
			System.out.println("You see the number 9 written on the wall.");
			System.out.println("Do you look around more or leave? North, South, or West to exit:");
			Tenth();
		}
		else if (mTen == 'n') {
			System.out.println("You see the number 9 written on the wall.");
			System.out.println("Do you look around more or leave? North, South, or West to exit:");
			Tenth();
		}
		else if (mTen == 'S') {
			System.out.println("You see nothing.");
			Tenth();
		}
		else if (mTen == 's') {
			System.out.println("You see nothing.");
			Tenth();
			}
		else if (mTen == 'W') {
			Ninth();
		}
		else if (mTen == 'w') {
			Ninth();
		}
		else {
			System.out.println("Please enter North, South, Or West.");
			Tenth();
		}
	}
	public static void Eleventh() {
		Scanner eleven = new Scanner(System.in);
		System.out.println("You come to a closet door on the side of the hallway.");
		System.out.println("Do you open door or continue on?");
		System.out.println("South (through the door), West, or East:");
		char mEleven = eleven.next().charAt(0);
		
		if (mEleven == 'S') {
			System.out.println("Nothing inside.");
			Eleventh();
		}
		else if (mEleven == 's') {
			System.out.println("Nothing inside.");
			Eleventh();
		}
		else if (mEleven == 'W') {
			System.out.println("You turn a corner (South).");
			Ninth();
		}
		else if (mEleven == 'w') {
			System.out.println("You Turn a corner (South).");
			Ninth();
		}
		else if (mEleven == 'E') {
			System.out.println("You turn a corner(South).");
			Twelth();
		}else if (mEleven == 'e') {
			System.out.println("You turn a corner(South).");
			Twelth();
		}
			else {
				System.out.println("Please enter East, West, or South");
				Eleventh();
			}

	}
	public static void Twelth() {
		System.out.println("You come to a locked door.");
		System.out.println("Looks like you need a passcode to unlock it.");
		System.out.println("Do you want to attempt to open it? Yes or No(go back down the hallway):");
		Scanner twelve = new Scanner(System.in);
		char mTwelve = twelve.next().charAt(0);
			if (mTwelve == 'y') {
				System.out.println("What is the sum of the numbers on the walls?");
				Scanner answer = new Scanner(System.in);
				int passcode = answer.nextInt();
					if (passcode == 20) {
						System.out.println("Congrats! You Win! Exit through the door.");
						System.out.println("Enjoy your 'freedom'.");
						First();
					}
					else {
						System.out.println("That was incorrect, please try again.");
						Twelth();
					}
			}
			if (mTwelve == 'Y') {
				System.out.println("What is the sum of the numbers on the walls?");
				Scanner answer = new Scanner(System.in);
				int passcode = answer.nextInt();
					if (passcode == 20) {
						System.out.println("Congrats! You Win! Exit through the door.");
						System.out.println("Enjoy your 'freedom'.");
						First();
					}
					else {
						System.out.println("That was incorrect, please try again.");
						Twelth();
					}
			}
			else if (mTwelve =='n') {
				System.out.println("Goodluck Finding the numbers!");
				Eleventh();
			}
			else if (mTwelve =='N') {
				System.out.println("Goodluck Finding the numbers!");
				Eleventh();
			}
			else {
				System.out.println("Please enter Yes or No");
				Twelth();
			}
	}
}