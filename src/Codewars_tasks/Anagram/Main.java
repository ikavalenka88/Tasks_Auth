package Codewars_tasks.Anagram;

public class Main {
    public static void main(String[] args) {
        char stringOne[]={'f','u','n','e','r','a','l'};
        char streingTwo[]={'r','e','a','l','f','u','n'};
        if (sortAnagram.sort(stringOne,streingTwo))
            System.out.println("Congratulation! It's anagram");
        else
            System.out.println("False! This is not anagram");
    }
}
