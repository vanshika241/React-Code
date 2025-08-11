import java.util.*;

public class Basics{
    public static void main(String[] args) {
        String a = "Code";
        String b = "Code";
        String s1 = new String("Vibes");
        String s2 = new String("Vibes");

        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2)); //true

        //pretty printing 
        System.out.println(34);
        System.out.println("CodeVibes");
        System.out.println(new int[]{2,34,5});
        System.out.println(Arrays.toString(new int[]{5,6,7,8,9}));
        String name = null;
        System.out.println(name);

        //Formatted printing 
        float num = 345.6789f;
        System.out.printf("Formattted upto 2 decimal places  %.2f",num);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s","CodeVibes","Cool");

        //+ Operator 
        System.out.println();
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println("a"+3);
        System.out.println("CodeVibes" + new ArrayList<>());
        System.out.println("CodeVibes"+new Integer(56));

        String s = "";
        for(int i=0;i<26;i++){
            s += (char)('a'+i);
        }
        //It takes O(n^2) time complexity 

        //StringBuilder
        StringBuilder sb = new StringBuilder("");
         for(int i=0;i<26;i++){
            sb.append( (char)('a'+i));
        }
        //It takes O(n) time complexity 


        //Methods 
        String str = "Code Vibes";
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.trim());
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.indexOf('V'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.length());
        // 1. substring(beginIndex) & substring(beginIndex, endIndex)
        System.out.println("Substring from index 5: " + str.substring(5));      // "Vibes"
        System.out.println("Substring 0 to 4: " + str.substring(0, 4));         // "Code"

        // 2. startsWith() & endsWith()
        System.out.println("Starts with 'Code': " + str.startsWith("Code"));    // true
        System.out.println("Ends with 'Vibes': " + str.endsWith("Vibes"));      // true

        // 3. replace()
        System.out.println("Replace spaces with '-': " + str.replace(" ", "-")); // "Code-Vibes"

        // 4. join()
        String joined = String.join(" | ", "Java", "Python", "C++");
        System.out.println("Joined string: " + joined); // "Java | Python | C++"

        // 5. Character.isLetter(), Character.isDigit(), Character.isWhitespace()
        char ch1 = 'A';
        char ch2 = '1';
        char ch3 = ' ';

        System.out.println(ch1 + " isLetter? " + Character.isLetter(ch1));   // true
        System.out.println(ch2 + " isDigit? " + Character.isDigit(ch2));     // true
        System.out.println("'" + ch3 + "' isWhitespace? " + Character.isWhitespace(ch3)); // true


    }
}
