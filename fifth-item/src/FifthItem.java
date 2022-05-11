import java.util.ArrayList;
import java.util.Scanner;


public class FifthItem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter at least five items, and an empty line to stop:");

        ArrayList list = new ArrayList<String>();
        while (true){
            String listItem = s.nextLine();
            if (listItem.equals("")){
                break;
            } else {
                list.add(listItem);
            }
        }

        if (list.size() < 5) {
            System.out.println("You only entered " + list.size() + " item(s). There's no fifth item.");
        } else {
            System.out.println("The fifth item is " + list.get(4));
        }
    }
}
