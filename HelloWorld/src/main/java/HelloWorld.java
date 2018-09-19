
public class HelloWorld {

    public enum Language { FR, EN }

    public static String greeting(Language language) {
        switch (language) {
            case FR: return "Bonjour le monde !";
            case EN: return "Hello World!";
            default: return null;
        }
    }

    public static void greet(Language language) {
        System.out.println (greeting(language));
    }
    public static void main (String[] args) {
        greet(Language.FR);
    }
}
