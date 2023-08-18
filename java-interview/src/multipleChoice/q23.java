package multipleChoice;

import java.util.ArrayList;
import java.util.List;

public class q23 {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();

        text.add("a");
        text.add("b");
        text.add("c");

        while(!text.isEmpty()) {
            System.out.print(text.remove(0));
        }
    }
}

/*
* What is the output?
* a) cba
*   ->  b) abc
* c) an infinite loop is caused and program will always print bcbcbc
* e) compilation err
*
* Program prints in line each letter that was removed from index 0 until the array is empty*/
