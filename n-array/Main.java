import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        // TIP press <shortcut actionId="ShowIntentionActions"/>
        // Declare the array
        String [] nameArray;
        // Initialise the values inside array
        nameArray = new String[] { "Pawan Sharma", "Muskan", "Ayushi", "Manish", "Khushi"};

        System.out.println(nameArray);
        for (String name : nameArray){
            System.out.println(name);
        }

        // Operation on array
        //System.out.println(nameArray[5]);
        System.out.println(nameArray.length);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Khushboo");
        arrayList.add("Anu");
        arrayList.add("Ayush");
        System.out.println(arrayList);

        System.out.println(arrayList.size());
        System.out.println("Before");
        for (String name : nameArray){
            System.out.println(name);
        }

        Arrays.stream(nameArray).sorted();
        System.out.println("After");
        for (String name : nameArray){
            System.out.println(name);
        }

        // To print reverse order of array
        for (int i = nameArray.length-1; i>=0; i--){
            System.out.println("Reverse order" +nameArray[i]);
        }
    }
}
