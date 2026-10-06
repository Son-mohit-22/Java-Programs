public class str {
    public static void main(String[] args) {

        String str = "Hello Java";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. substring()
        System.out.println("Substring: " + str.substring(6));

        // 6. replace()
        System.out.println("Replace: " + str.replace("Java", "World"));

        // 7. equals()
        String str2 = "Hello Java";
        System.out.println("Equals: " + str.equals(str2));

        // 8. contains()
        System.out.println("Contains Java: " + str.contains("Java"));

        // 9. concat()
        System.out.println("Concat: " + str.concat(" Programming"));

        // 10. trim()
        String str3 = "   Hello Java   ";
        System.out.println("Trim: " + str3.trim());
    }
}