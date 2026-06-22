package day19;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOcuuranceofCharinString {

	public static void main(String[] args) {
		//String str="virat";
		String str="apple";
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(char ch:str.toCharArray())		//ch='p'
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);

	}

}
