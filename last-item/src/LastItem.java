import java.util.ArrayList;
import java.util.Scanner;


public class LastItem {
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

        if (list.isEmpty()) {
            System.out.println("Hmm. There doesn't seem to be anything here.");
        } else {
            System.out.println("The last item in the list is " + list.get(list.size() - 1));
        }
    }
}
