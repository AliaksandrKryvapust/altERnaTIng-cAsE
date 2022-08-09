public class Source {
    public static void main(String[] args) {
    String str = "hello world";
        System.out.println(toAlternativeString(str).equals("HELLO WORLD"));
    }
    public static String toAlternativeString(String string) {
        StringBuilder temp = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            char sym = temp.charAt(i);
            if (Character.isLowerCase(sym)){
                temp.replace( i, i+1, String.valueOf(Character.toUpperCase(sym)));
            } else if (Character.isUpperCase(sym)) {
                temp.replace( i, i+1, String.valueOf(Character.toLowerCase(sym)));
            }
        }
        return temp.toString();
    }
    /*return string.chars()
            .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();*/
}
