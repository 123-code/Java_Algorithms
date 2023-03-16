public class Normalize{
    public static String Normalize(String s){
        String lowercased = s.toLowerCase();
        String trimmed = lowercased.trim();
        String Normalized = trimmed.replace(" ", "_");
        return Normalized;
    }

    public static void main(String[] args){
        System.out.println("Normalized: " + Normalize(" Hello World! "));
    }
}