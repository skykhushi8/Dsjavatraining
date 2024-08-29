import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Muskan");
        arrayList.add("Ayushi");
        arrayList.add("Varun");
        arrayList.add("Ayush");
        System.out.println(arrayList);
        for (String name : arrayList){
            System.out.println(name);
        }
        System.out.println(arrayList.get(2));
    }
}
