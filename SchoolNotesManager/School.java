package SchoolNotesManager;

import java.util.Random;
import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		
		
		
		//create data
		int[] stNoteList = new int[3];
		String[] stNameList = new String[3];

		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		for (int i = 0; i < stNoteList.length; i++) {
			System.out.println("Enter students name:");
			String name = scan.nextLine();
			stNameList[i] = name;

			int randomNote = 1 + r.nextInt(12);
			stNoteList[i] = randomNote;

			System.out.println("Saved: " + name + " with note " + randomNote);
		}

		scan.close();
		
		
		
		
		//formula
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < stNoteList.length; i++) {
			sum = sum + stNoteList[i];
			if(stNoteList[i]<min) {
				min = stNoteList[i];
			}
			if(stNoteList[i]>max) {
				max = stNoteList[i];
			}
		}
		double avg = (double)sum / (double)stNoteList.length;
		
		
		System.out.println();
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		System.out.println("avg:"+avg);
	}
}
