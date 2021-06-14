package Practice;

import java.util.Scanner;

public class PracticeMethods {



    public static void countVowels() {
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+count);
    }



    public static void main(String args[]){
        countVowels();
    }
}
