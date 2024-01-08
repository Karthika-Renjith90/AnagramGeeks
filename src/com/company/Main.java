package com.company;

import java.util.Arrays;

public class Main {
    public static boolean isAnagram(String a,String b)
    {
    char[] c=a.toCharArray();
    char[] d=b.toCharArray();

        Arrays.sort(c);
        a=new String(c);
        Arrays.sort(d);
        b=new String(d);
        if(c.length==d.length)
        {

                       if(a.equals(b)){
                return true;
            }}

        return false;

}

    public static void main(String[] args) {
	// write your code here
        String a= "bd"; // abcdeabsd
        String b= "db"; // sfasdfasf
        System.out.println(isAnagram(a,b));
    }
}
