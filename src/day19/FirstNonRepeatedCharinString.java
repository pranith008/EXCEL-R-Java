package day19;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharinString {

	public static void main(String[] args) {
		String str = "Virat Kohli";
		//String str = "Virat";

		char ch = findFirstRepeatedCharInAString(str);

		System.out.println(ch=='0'? "No Char Found": ch);
	}

	private static char findFirstRepeatedCharInAString(String str) {
		str = str.replaceAll("\\s+", "").toLowerCase(); // viratkohli

		Map<Character, Integer> map = new LinkedHashMap();

		for (char ch : str.toCharArray()) // ch='p'
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		
		for(char ch:str.toCharArray())			//ch='i'
		{
			if(map.get(ch)==1)
				return ch;
		}
		
		return '0';
	}
		



}
