package com.solution.phrase.reverse;

public class InvertPhrase {


	/*
	 * 	Good afternoon afternoon Good
		Hello, how are you? ?you are how, Hello
		Are you twenty-one years old? ?old years twenty-one you Are
	 */
	public static void main(String[] args) 
	{
		System.out.println(invertPhrase("Good afternoon"));
		System.out.println(invertPhrase("Hello, how are you?"));
		System.out.println(invertPhrase("Are you twenty-one years old?"));
	}

	public static String invertPhrase(String word) 
	{
		String[] parts = word.split("(?<=\\w)(?=\\W)|(?<=\\W)(?=\\w)");

		StringBuilder builder = new StringBuilder();

		for(int i=parts.length-1;i>=0;i--) 
		{
			builder.append(parts[i]);
		}

		return builder.toString();
	}
}
