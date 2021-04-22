package com.mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {

	public static void printAnagrams(String[] arr) {
		
		Map<String, List<String>> allItems= new HashMap<String, List<String> >();
		
		for (String item : arr) {
			
			char[] newSortItem= item.toCharArray();
			Arrays.sort(newSortItem);
			String strnewSortItem=new String(newSortItem);
			
			if (allItems.containsKey(strnewSortItem)) {
				allItems.get(strnewSortItem).add(item);
			}else {
				List<String> first=new ArrayList<String>();
				first.add(item);
				allItems.put(strnewSortItem, first);
			}			
		}
		for (String key : allItems.keySet()) {
			List<String> anagramlist=allItems.get(key);					
			System.out.print(anagramlist);	
		}	
	}
	
    public static void main(String[] args)
    {
        // Driver program
        String arr[] = { "cat", "dog", "tac", "god", "act" };
        printAnagrams(arr);
    }

}
