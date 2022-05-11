import java.util.ArrayList;
import java.util.Scanner;


public class HowLarge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter list items, and an empty line to stop:");

        ArrayList list = new ArrayList<String>();
        while (true){
            String listItem = s.nextLine();
            if (listItem.equals("")){
                break;
            } else {
                list.add(listItem);
            }
        }

        System.out.println("The total number of items in the list was: " + list.size());

    }
}
