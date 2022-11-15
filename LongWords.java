import java.util.Arrays;

public class LongWords {

    public static void main(String[] args) {
        String[] stringArray = {"One","Ten","Twenty","Hundred","Thousand","Million"};

        // 🔴 Create a new array. 
        // 🔴 Of the words in stringArray add the long words (length > 6) from stringArray to the new array
        // 🔴 If the word is short, add the String "SHORTWORD" instead
        // 🔴 Print the new array. 
        // 🔴 Test the new array by calling testArray() and passing the new array as an argument (eg: testArray(newArray);)
        // ⬇️------------Write your code below (approx. 8 lines of code)-----------⬇️









        // ⬆️--------------------------------END HERE------------------------------⬆️


    }

    public static void testArray(String[] arr) {
        String[] answer = {"SHORTWORD","SHORTWORD","SHORTWORD","Hundred","Thousand","Million"};
        int num = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == answer[i]) {
                num ++;
            };
        }

        if (num == answer.length) {
            System.out.println("Correct Answer");
        } else {
            System.out.println("Incorrect Answer");
        }
    }
}