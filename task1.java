package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class EventSimulator {

// Class responsible for simulating the event and generating outcomes

	HashMap<Integer, Integer> outcomes;
	private Random random;

	public EventSimulator(HashMap<Integer, Integer> outcomes) {
		
		this.outcomes = outcomes;
		this.random = new Random();
		
	}

	public int generateOutcome(int[] occurrenceCount, int numberOfOccurrences) {
		// set sample size for outcome range
		int size = outcomes.size() - 1;
		int randomNumber = 0;
		boolean flag = true;
		while (flag) {
			// Generate a random number between 1 to total size
			randomNumber = random.nextInt(size) + 1;
			
			if (occurrenceCount[randomNumber - 1] < (numberOfOccurrences * outcomes.get(randomNumber) / 100)) {
				occurrenceCount[randomNumber - 1]++;
				flag = false;
			}
		}
		return randomNumber;
	}

	public static void main(String[] args) {

		HashMap<Integer, Integer> outcomes = new HashMap();
		outcomes.put(1, 10); // Outcome 1 with 10% probability
		outcomes.put(2, 30); // Outcome 2 with 30% probability
		outcomes.put(3, 15); // Outcome 3 with 15% probability
		outcomes.put(4, 15); // Outcome 4 with 15% probability
		outcomes.put(5, 30); // Outcome 5 with 30% probability
		outcomes.put(6, 0); // Outcome 6 with 0% probability

		// Create an instance of EventSimulator with the defined outcomes
		EventSimulator eventSimulator = new EventSimulator(outcomes);
		int numberOfOccurrences = 100;

		// Array to keep track of the occurrence count for each outcome
		int[] occurrenceCount = new int[outcomes.size()];

		// Simulate the event for the specified number of occurrences
		for (int i = 0; i < numberOfOccurrences; i++) {
			// Generate an outcome
			int outcome = eventSimulator.generateOutcome(occurrenceCount, numberOfOccurrences);
			System.out.println("no : " + (i + 1) + " outcome " + outcome);
		}

		// Print the number of times each outcome appeared during the simulation
		for (int i = 1; i <= outcomes.size(); i++) {
			System.out.println("Outcome " + i + " appeared " + occurrenceCount[i - 1] + " times.");
		}

		// ---------------------------------------------------
		// -:some assumption:-
		// ----------------------------
//			1)i have not put validation during input like:-total of probability should be
		// equal to hundred
//			2)taking a hardcode input so this code is about output considering all input
		// is error free and pass all validation.
//			3)like above mention here i am taking sample outcome in the form of int
//		 	4)**for this example i am taking 1,2 3,4,5,6 as sample outcome but if user
		// gave a different input that is not int type
		// i would use mapping technique;
		// hashmap<int,string> mapping=new hashmap();
		// mapping.put(1,"head");
		// mapping.put(2,"tail");
		// output:-
		// for (int i = 1; i <= outcomes.size(); i++) {
		// System.out.println("Outcome " + mapping.get(i) + " appeared " +
		// occurrenceCount[i] + " times.");
		// }
		//
	}
}
