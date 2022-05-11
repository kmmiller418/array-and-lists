import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integers, and a 0 to stop:");

        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int listItem = s.nextInt();
            if (listItem == 0){
                break;
            } else {
                list.add(listItem);
            }
        }

        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");

        int num = s.nextInt();

        if (list.contains(num)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(num)){
                    System.out.println(num + " is at index " + i);
                }
            }
        } else {
            System.out.println("Couldn't find that number; are you sure you added it to the list?");
        }
    }
}
