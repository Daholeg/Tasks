package codewars;

public class FirstLetterUpperCase {
    public static void main(String[] args) {
//        Task is to convert first letter of strings to upper case.
//
//        Example:
//
//        "How can mirrors be real if our eyes aren't real"
//        "How Can Mirrors Be Real If Our Eyes Aren't Real"
//        Note that the Java version expects a return value of null for an empty string or null.

        String textNull = null;
        String textEmpty = "";
        String text = "How can mirrors be real if our eyes aren't real";

        System.out.println(toUpperCase(textNull));
        System.out.println(toUpperCase(textEmpty));
        System.out.println(toUpperCase(text));
    }

    public static String toUpperCase(String phrase) {
        try{
            if(phrase.isEmpty()){
                return null;
            }

            String[] array = phrase.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String s : array) {
                sb.append(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
            }

            return sb.toString().trim();
        }catch (NullPointerException e){
            return null;
        }
    }
}
