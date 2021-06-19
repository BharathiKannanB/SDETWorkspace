package week19.problems;

import java.util.Arrays;

import org.junit.Test;

public class HourHand {

	
	
	// Positive Test - 90 degree right side
	@Test
	public void unitTest1() {
		int hour = 03;
		int minute = 00;
		System.out.println("Angle of an Analogue clock :");
		System.out.println(GetAngle(hour, minute));
	}
	
	// Positive Test - 90 degree left side
		@Test
		public void unitTest2() {
			int hour = 9;
			int minute = 00;
			System.out.println("Angle of an Analogue clock :");
			System.out.println(GetAngle(hour, minute));
		}

	// Positive Test - 0 degree   - Edge case
	@Test
	public void unitTest3() {
		int hour = 06;
		int minute = 30;
		System.out.println("Angle of an Analogue clock :");
		System.out.println(GetAngle(hour, minute));
	}

	// Positive Test - 180 degree  - Edge case
	@Test
	public void unitTest4() {
		int hour = 06;
		int minute = 00;
		System.out.println("Angle of an Analogue clock :");
		System.out.println(GetAngle(hour, minute));
	}
	
	// Negative Test - Hour out of range
	@Test
	public void unitTest5() {
		int hour = 30;
		int minute = 15;
		System.out.println("Angle of an Analogue clock :");
		System.out.println(GetAngle(hour, minute));
	}

	// Negative Test - Minute out of range
	@Test
	public void unitTest6() {
		int hour = 03;
		int minute = 75;
		System.out.println("Angle of an Analogue clock :");
		System.out.println(GetAngle(hour, minute));
	}
	
	// Negative Test - negative value
		@Test
		public void unitTest7() {
			int hour = -03;
			int minute = -15;
			System.out.println("Angle of an Analogue clock :");
			System.out.println(GetAngle(hour, minute));
		}
	
	// Additional Test - Automatic conversion of 24 hr format
		@Test
		public void unitTest8() {
			int hour = 22;
			int minute = 45;
			System.out.println("Angle of an Analogue clock :");
			System.out.println(GetAngle(hour, minute));
		}
		
		
	
	
	private char[] GetAngle(int hour, int minute) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
