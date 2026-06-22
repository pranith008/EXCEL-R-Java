package day19;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOcuuranceofWordsinString {

	public static void main(String[] args) {
		
		//String str="virat";
		String str="I am studying java java is a prog lang good prog lang i am also good";
		String words[]=str.split(" ");
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		for(String word:words)		//ch='p'
		{
			String key=word.toLowerCase();
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		System.out.println(map);

	}

}
