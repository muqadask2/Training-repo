
package com.training;

public class Class2 {  

    public static void main(java.lang.String[] args) 
    {
    	
        String str = "Muqadas Khan";
        System.out.println(str);
        
        //Print string UPPERCASE----------------------------
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
        
        //Print string LOWERCASE----------------------------
        String lowercase = str.toLowerCase();
        System.out.println("Uppercase: " + lowercase);
        
        //Print the entire length of String------------------------------
        int length = str.length();
        System.out.println("length:" + length);
        
        //Print the Character at Given Index----------------------------
        char charAt = str.charAt(9);
        System.out.println("Character at index 0: " + charAt);

        //Substring gives the value from the given index range--------------
        String Substring = str.substring(0,8);
        System.out.println("Substring from index 7: " + Substring);
        
        //String Concatenation-------------------------------------
        String Add = str + " In Java";
        System.out.println("String Conca:" + Add);
        
        String Add1 = str.concat(" In Java");
        System.out.println("String Conca2:" + Add1);
        
        //Replace the char or string with given one------------------------------
        String replace = str.replace('n', 'N');    
        System.out.println("replace:" + replace );
        
        String replace2 = str.replace("Strings", "Java");
        System.out.println("replace2:" + replace2);
        
        //Split the words-------------------------------------------------
        String[] splitVersion = str.split(" ");
        System.out.println("splitVersion:" + splitVersion[0]);
        
        // Removes leading and trailing whitespace-------------------------
        String strTrimmed = str.trim();       
        System.out.println("trimVersion:" + strTrimmed);
        
        //gives bool value by comparing start and end of strings------------
        boolean Start = str.startsWith("Learning");
        System.out.println("compare the starts: " + Start);
        
        boolean End = str.endsWith("Learning");
        System.out.println("compare the Ends: " + End);
        
       //gives bool value if the given string CONTAINS in it ----------
        boolean contain = str.contains("Strings");
        System.out.println("Contains class?: " + contain);
        
        //gives bool value if the given string EQUALS to it-----------
        boolean equals = str.equals("Learning StringS");
        System.out.println("Equals 'learning strings': " + equals);
        
        
    }
}
