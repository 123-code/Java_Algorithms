public class PartialValidation{
    public static boolean HasRequiredCharacters(String phrase){
        return phrase.chars().anyMatch(Character::isUpperCase) && 
        phrase.chars().anyMatch(Character::isLowerCase) &&
        phrase.chars().anyMatch(Character::isDigit);
    }
 public static void main(String[] args){
        System.out.println("HasRequiredCharacters: " + HasRequiredCharacters("Hello1!"));
 }
}