package com.util;

import java.util.Random;

public class RandamString {
	
	private static final String CHAR_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String Num_LIST = "1234567890";
	private static final int RANDOM_STRING_LENGTH = 3;
	
	public String generateRandomNo() {
		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
			int number = getRandomNumber1();
			char ch = Num_LIST.charAt(number);
			randStr.append(ch);
		}
		return randStr.toString();

	}

	public String generateRandomString() {
		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
			int number = getRandomNumber();
			char ch = CHAR_LIST.charAt(number);
			randStr.append(ch);
		}
		return randStr.toString();

	}

	private int getRandomNumber() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(CHAR_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

	private int getRandomNumber1() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(Num_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

}
