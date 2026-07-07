import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
                "eat",
                "tea",
                "ate",
                "tan",
                "nat",
                "bat",
                "tab",
                "listen",
                "silent",
                "enlist",
                "google",
                "gogole",
                "abc",
                "cab",
                "bca",
                "xyz",
                "zyx",
                "hello",
                "olleh",
                "java",
                "avaj",
                "spring",
                "grinsp",
                "code",
                "deco",
                "dog",
                "god",
                "cat"
        ));

        System.out.println(Group.groupOfAnagrams(palabras));
    }
}