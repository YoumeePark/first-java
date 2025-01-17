package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWhiteSpaces = "     Java Programming    ";

        System.out.println("소문자로 변환: " + strWhiteSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWhiteSpaces.toUpperCase());

        System.out.println("공백 제거(trim): '" + strWhiteSpaces.trim() + "'");
        System.out.println("공백 제거(strip): '" + strWhiteSpaces.strip() + "'");
        System.out.println("앞 공백 제거(strip): '" + strWhiteSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWhiteSpaces.stripTrailing() + "'");
    }
}