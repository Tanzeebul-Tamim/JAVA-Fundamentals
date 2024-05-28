package class_tasks.chapter_3_strings.lessons;

public class Part_14_string_methods_in_java {
    public static void main(String[] args) {
        String name = "TaNzEEbuL TaMim";

        // * .length() Returns the length of the string
        int value = name.length();
        System.out.println(value);

        // * .toLowerCase() Converts the string to lowercase
        String lString = name.toLowerCase();
        System.out.println(lString);

        // * .toUpperCase() Converts the string to uppercase
        String uString = name.toUpperCase();
        System.out.println(uString);

        // * .trim() Removes the leading and trailing spaces
        String nonTrimmedString = "   Tamim   ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        // * .substring() Returns the string from the specified index to the end index
        // of the string if only one number is passed as an argument. Takes 1 or 2
        // arguments.
        String subString = name.substring(3);
        System.out.println(subString);

        // * .substring() Returns the string from the specified index to the end index
        // if only two number is passed as an argument. Note that start index is
        // included and end index is excluded.
        String subString2 = name.substring(2, 5);
        System.out.println(subString2);

        // * .replace() Returns a new string after replacing the specified character
        // with specified replacement character. Takes 2 arguments. While passing the
        // arguments, single quotation for replacing single characters and double
        // quotation for replacing substrings
        String modifiedName = name.replace('T', 'H');
        System.out.println("Modified Name: " + modifiedName);

        // * .replace() can also work with substrings
        String modifiedName2 = name.replace("zEE", "ji");
        System.out.println(modifiedName2);

        // * .startsWith() takes a character or substring and returns true if the string
        // starts with the specified character or substring, otherwise it will return
        // false. Takes 1 argument. Use double quotation
        boolean checkStartsWith = name.startsWith("TaN");
        System.out.println(checkStartsWith);

        // * .endsWith() takes a character or substring and returns true if the string
        // ends with the specified character or substring, otherwise it will return
        // false. Takes 1 argument. Use double quotation
        boolean checkEndsWith = name.endsWith("Mim");
        System.out.println(checkEndsWith);

        // * .charAt() takes an index (integer) as an argument and returns the character
        // at the given index position.
        char findTheChar = name.charAt(4);
        System.out.println(findTheChar);

        // * .indexOf() takes a string or char and returns the index of the first
        // occurrence of the given char/string or -1 if the given char/substring doesn't
        // exist on the string
        int findTheIndex = name.indexOf("NzE");
        System.out.println(findTheIndex);

        // * .indexOf() also takes an int along with a string or char and returns the
        // index of the first occurrence of the given char/string starting from the
        // specified index or -1 if the given char/substring doesn't exist on the string
        // or in the index range.
        int findTheIndex2 = name.indexOf("E", 2);
        System.out.println(findTheIndex2);

        // * .lastIndexOf() takes a string or char and returns the index of the last
        // occurrence of the given char/string or -1 if the given char/substring doesn't
        // exist on the string
        int findTheLastIndex = name.lastIndexOf("T");
        System.out.println(findTheLastIndex);

        // * .lastIndexOf() also takes an int along with a string or char and returns
        // the index of the last occurrence of the given char/string before the
        // specified index or -1 if the given char/substring doesn't exist on the string
        // or in the index range. Note that, .lastIndexOf() searches the string from the
        // end char to the start char.
        int findTheLastIndex2 = name.lastIndexOf("E", 8);
        System.out.println(findTheLastIndex2);

        // * .equals() takes a string or char and returns true if the given string is
        // equal to the specified string, otherwise it will return false. Takes 1
        // argument. Use double quotation.
        boolean checkIfEquals = name.equals("Tanzee");
        System.out.println(checkIfEquals);

        // * .equalsIgnoreCase() is same as .equals() but it is case insensitive, that
        // means if the given string is equal to the specified string in any cases (case
        // sensitive or not), then this method will return true. Takes 1 argument. Use
        // double quotation.
        boolean checkIfEqualsCaseInsensitive = name.equalsIgnoreCase("Tanzeebul Tamim");
        System.out.println(checkIfEqualsCaseInsensitive);

        // * Escape sequence characters
        System.out.println("I am escape sequence \" double quote character");
    }
}
