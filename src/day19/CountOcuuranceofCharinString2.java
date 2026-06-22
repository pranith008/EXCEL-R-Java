package day19;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOcuuranceofCharinString2 {

	public static void main(String[] args) {
		//String str="virat";
		//String str="apple";
		//String str="virat kohli";
		String str="Virat Kohli";
		
		str=str.replaceAll("\\s+", "").toLowerCase();  //viratkohli
		Map<Character,Integer> map=new LinkedHashMap();
		
		for(char ch:str.toCharArray())		//ch='p'
		map.put(ch, map.getOrDefault(ch, 0)+1);
		
		
		System.out.println(map);

	}

}
