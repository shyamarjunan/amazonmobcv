package vo.in;

import java.util.Scanner;

public class VoterEligiblity {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age:");
	int age = sc.nextInt();
	if (age>=18) {
		System.out.println("Eligble to vote");
		System.out.println("valid");
	}
	else {
		System.out.println("Not eligible");
	}
	System.out.println("code bt jeeva");
	}
}
