import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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
        printList(list);
    }

    public static void printList(ArrayList<Integer> list){
        if (list.isEmpty()){
            System.out.println("There were no items in the list.");
        } else if (list.size() == 1) {
            System.out.println("The only item was " + list.get(0) +
                    ". The sum of the list is " + list.get(0));
        } else {
            System.out.println("The list items were: ");
            for (Integer num: list) {
                System.out.print(num + ", ");
            }
            System.out.println("the sum was: " + sum(list));
        }
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;

        for (Integer num: list){
            sum += num;
        }
        return sum;
    }
}
