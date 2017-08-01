package com.geeks.string;

//Write a function to find the longest common prefix string amongst an array of strings.

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String prefix = "";
		int count=0;
		if (strs != null && strs.length > 0) {
			for (int i = 0; i < strs.length; i++) {
				if (i == 0) {
					prefix = strs[i];
				} else {
					for(char c:strs[i].toCharArray()) {
						if(prefix.length()>count && c==prefix.charAt(count)) {
							count++;
						}else {
							if(prefix.length() > count)
								prefix=prefix.substring(0, count);
							else if(count==0)
								prefix="";
						}
					}
					if(prefix.length() > count)
						prefix=prefix.substring(0, count);
					count=0;
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] arr = { "aa","a" };
		System.out.println(" --> " + prefix.longestCommonPrefix(arr));
	}
}
