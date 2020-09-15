package edu.arapahoe;

public class Main {

    public static void main(String[] args) {

//  The Math class
    // class constants PI, E
    // Math.PI

// Class methods
    // Trigonometric Methods
        // Methods take double parameters in radians (not degrees)
        // If you have degrees but not radians, use
            // toRadians method which takes a double
        // sin, cos, tan, acos, asin, atan

        // Math.sin(2*Math.PI)
        // Math.cos(0*Math.PI)

    // Exponent methods
        // Methods take double parameters
        // exp      Returns e raised to the power of a.
        // log      Returns the natural logarithm of a.
        // log10    Returns the 10-based logarithm of a.
        // pow      Returns a raised to the power of b.
        // sqrt     Returns the square root of a.

        // Math.exp(1)
        // Math.pow(2,3)
        // Math.sqrt(4)

    // Rounding methods
        // double ceil(double x)
        // x rounded up to its nearest integer. This integer is  returned as a double value.

        // double floor(double x)
        // x is rounded down to its nearest integer. This integer is  returned as a double value.

        // double rint(double x)
        // x is rounded to its nearest integer. If x is equally close to two integers, the even one is returned as a double.

        // int round(float x)
        // Return (int)Math.floor(x+0.5).

        // long round(double x)
        // Return (long)Math.floor(x+0.5).

        /* Math.ceil(2.1) returns 3.0
            Math.ceil(2.0) returns 2.0
            Math.ceil(-2.0) returns –2.0
            Math.ceil(-2.1) returns -2.0
            Math.floor(2.1) returns 2.0
            Math.floor(2.0) returns 2.0
            Math.floor(-2.0) returns –2.0
            Math.floor(-2.1) returns -3.0
            Math.rint(2.1) returns 2.0
            Math.rint(2.0) returns 2.0
            Math.rint(-2.0) returns –2.0
            Math.rint(-2.1) returns -2.0
            Math.rint(2.5) returns 2.0
            Math.rint(-2.5) returns -2.0
            Math.round(2.6f) returns 3
            Math.round(2.0) returns 2
            Math.round(-2.0f) returns -2
            Math.round(-2.6) returns -3
            */

        // min, max, abs and random methods
            // max(a, b)and min(a, b) Returns the maximum or minimum of two parameters.
            // abs(a) Returns the absolute value of the parameter.
            // random() Returns a random double value in the range [0.0, 1.0).

            // Math.max(2, 3) returns 3
            // Math.max(2.5, 3) returns 3.0
            // Math.min(2.5, 3.6) returns 2.5
            // Math.abs(-2) returns 2
            // Math.abs(-2.1) returns 2.1

            // Generates a random double value greater than or equal to 0.0
            // and less than 1.0 (0 <= Math.random() < 1.0).

            // (int)(Math.random() * 10
            // 50 + (int)(Math.random()*50)

            // a + Math.random() * b        a <= x < a+b

        // Case Study: Computing Angles of a Triangle
        // Write a program that prompts the user to enter the x- and y-coordinates of the three corner points
        // in a triangle and then displays the triangle’s angles
/*
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three points
        System.out.print("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3)
                + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3)
                + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2)
                + (y1 - y2) * (y1 - y2));

        // Compute three angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));

        // Display results
        System.out.println("The three angles are " +
                Math.round(A * 100) / 100.0 + " " +
                Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100.0);

        // Enter three points: 1 1 6.5 1 6.5 2.5
        // The three angles are 15.26 90.0 74.74
*/

// Character Data Type
    // char letter = 'A'; (ASCII)
    // char numChar = '4'; (ASCII)
    // char letter = '\u0041'; (Unicode)
    // char numChar = '\u0034'; (Unicode)

    // Increment and decrement works on char but the Unicode character set is used
        // char ch = 'a';
        // System.out.println(++ch);

    // Java characters use Unicode, a 16-bit encoding scheme established by the Unicode Consortium
        // Range is '\u0000' to '\uFFFF'
        // https://unicode.org/charts/PDF/U0000.pdf

        // Lookup characters '0' to '9', 'A' to 'Z' and 'a' to 'z'
        // Lookup backspace, tab

        // ASCII character set is a subset of Unicode from \u0000 to \u007f

    // Casting between char and numeric types
        // int i = 'a'; // Same as int i = (int)'a';
        // char c = 97; // Same as char c = (char)97;

    // Comparing and testing Characters
        // if (ch >= 'A' && ch <= 'Z')
        //     System.out.println(ch + " is an uppercase letter");
        // else if (ch >= 'a' && ch <= 'z')
        //     System.out.println(ch + " is a lowercase letter");
        // else if (ch >= '0' && ch <= '9')
        //     System.out.println(ch + " is a numeric character");

    // Methods in the Character Class
        // isDigit(ch)          Returns true if the specified character is a digit.
        // isLetter(ch)         Returns true if the specified character is a letter.
        // isLetterOfDigit(ch)  Returns true if the specified character is a letter or digit.
        // isLowerCase(ch)      Returns true if the specified character is a lowercase letter.
        // isUpperCase(ch)      Returns true if the specified character is an uppercase letter.
        // toLowerCase(ch)      Returns the lowercase of the specified character.
        // toUpperCase(ch)      Returns the uppercase of the specified character.

    // The String Type
        // Char is one character, String can represent multiple characters
        // String message = "Hello World!"

        // Predefined class in the Java library - think System and Scanner classes
        // Not primitive - it's a reference type

        // Methods for String Objects
        // length()             Returns the number of characters in this string.
        // charAt(index)        Returns the character at the specified index from this string.
        // concat(s1)           Returns a new string that concatenates this string with string s1.
        // toUpperCase()        Returns a new string with all letters in uppercase.
        // toLowerCase()        Returns a new string with all letters in lowercase.
        // trim()               Returns a new string with whitespace characters trimmed on both sides.
        // These are all instance methods - require an existing string

        // All methods in the Math class are static methods
        // referenceVariable.methodName(arguments)

        // String message = "Welcome to Java";
        // System.out.println("The length of " + message + " is "
        //  + message.length());

        // String message = "Welcome to Java";
        // System.out.println("The first character in message is "
        //   + message.charAt(0));

        // .toLowerCase(), .toUpperCase(), .trim()
        // String message = "Welcome to Java";
        // System.out.println(message.toLowerCase());

        // String concatenation
        // String s3 = s1.concat(s2); or String s3 = s1 + s2;
        // String message = "Welcome " + "to " + "Java";
        // String s = "Chapter" + 2; // s becomes Chapter2

        // Read String from console
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter three words separated by spaces: ");
        // String s1 = input.next();
        // String s2 = input.next();
        // String s3 = input.next();
        // System.out.println("s1 is " + s1);
        // System.out.println("s2 is " + s2);
        // System.out.println("s3 is " + s3);

        // Read Character from console
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a character: ");
        // String s = input.nextLine();
        // char ch = s.charAt(0);
        // System.out.println("The character entered is " + ch);

        // Comparing Strings
        // equals(s1)               // Returns true if this string is equal to string s1.
        // equalsIgnoreCase(s1)     // Returns true if this string is equal to string s1; it is case insensitive.
        // compareTo(s1)            // Returns an integer greater than 0, equal to 0, or less than 0 to indicate
                                    // whether this string is greater than, equal to, or less than s1.

        // compareToIgnoreCase(s1)  // Same as compareTo except that the comparison is case insensitive.
        // startsWith(prefix)       // Returns true if this string starts with the specified prefix.
        // endsWith(suffix)         // Returns true if this string ends with the specified suffix.

        // Substring
        // substring(beginIndex)    // Returns this string’s substring that begins with the character at the specified beginIndex and extends to the end of the string, as shown in Figure 4.2.
        // substring(begin,end)     // Returns this string’s substring that begins at the specified beginIndex and extends to the character at index endIndex – 1, as shown in Figure 9.6.
                                    // Note that the character at endIndex is not part of the substring.

        // String message = "Welcome to Java";
//        message.substring(0,11)

        // Finding a Character or a Substring in a String
        // indexOf(ch)                  // Returns the index of the first occurrence of ch in the string. Returns -1 if not matched.
        // indexOf(ch, fromIndex)       // Returns the index of the first occurrence of ch after fromIndex in the string. Returns -1 if not matched.
        // indexOf(s)                   // Returns the index of the first occurrence of string s in this string. Returns -1 if not matched.
        // indexOf(s, fromIndex)        // Returns the index of the first occurrence of string s in this string after fromIndex. Returns -1 if not matched.
        // lastIndexOf(ch)              // Returns the index of the last occurrence of ch in the string. Returns -1 if not matched.
        // lastIndexOf(ch, fromIndex)   // Returns the index of the last occurrence of ch before fromIndex in this string. Returns -1 if not matched.
        // lastIndexOf(s)               // Returns the index of the last occurrence of string s. Returns -1 if not matched.
        // lastIndexOf(s, fromIndex)    // Returns the index of the last occurrence of string s before fromIndex. Returns -1 if not matched.

        // Example
        /*
        String s = "Doug Lundin";
        int k = s.indexOf(' ');
        String firstName = s.substring(0,k);
        String lastName = s.substring(k+1);
        System.out.println(firstName);
        System.out.println(lastName);
        */

        // Convert between Strings and Numbers
        /*
        int intValue = Integer.parseInt(intString);
        double doubleValue = Double.parseDouble(doubleString);

        String s = number + "";
        */

        // Run Guessing Birthday
        // See text for mathematical basis for game


        // Formatting output
        // System.out.printf(format, items);

        // Specifier    Output					Example
        // %b 	        a boolean value  				            true or false
        // %c           a character  				                'a'
        // %d  	        a decimal integer 			                200
        // %f           a floating-point number 		            45.460000
        // %e           a number in standard scientific notation    4.556000e+01
        // %s  	        a string  					                "Java is cool"

        /*
        int count = 5;
        double amount = 45.56;
        System.out.printf("count is %d and amount is %f", count, amount);
        */
        // displays            count is 5 and amount is 45.560000







    }

}
