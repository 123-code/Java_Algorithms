public class Validation{

    public static boolean IsUpperCase(String phrase){
        return phrase.chars().allMatch(Character::isUpperCase);
    }
    public static boolean IsLowerCase(String phrase){
        return phrase.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args){
        System.out.println("IsUpperCase: " + IsUpperCase("HELLO"));
        System.out.println("IsLowerCase: " + IsLowerCase("hello"));
        System.out.println("IsUpperCase: " + IsUpperCase("HelLo"));
    }
}
