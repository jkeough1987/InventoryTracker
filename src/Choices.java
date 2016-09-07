import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by joshuakeough on 9/6/16.
 */
public class Choices {
    private ArrayList<Item> items = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private String newItem;
    private int quantity;

    public void createNew() {
        System.out.println("Please enter item name.");
        newItem = scanner.nextLine();
        System.out.println("Please enter a quantity.");
        quantity = Integer.valueOf(scanner.nextLine());
        Item item = new Item(newItem, quantity);
        items.add(item);
    }





    public void menu() {
       while(true) {
           int i = 1;
           for(Item item : items) {
               System.out.println("Item " + i++ + " " +item.getName() + " Quantity " +item.getAmount() );

           }
           System.out.println("Please choose one of the following!\n1. Create new item.\n2. Remove an item.\n3. Update quantity. ");
           String answer = scanner.nextLine();
           switch(answer){
               case "1":
                   createNew();
                   break;
               case "2":

                   System.out.println("Please choose the number of the item you wish to remove from the list.");
                   int listNumber = Integer.valueOf(scanner.nextLine());
                   items.remove(listNumber - 1);
                   break;
               case "3":

                   System.out.println("Please indicate the number of the item you want to modify.");
                   int listNumber2 = Integer.valueOf(scanner.nextLine());
                   items.get(listNumber2 - 1);
                   System.out.println("Please enter the new amount.");
                   quantity = Integer.valueOf(scanner.nextLine());
                   newItem = items.get(listNumber2 -1).getName();
                   Item item1 =  new Item(newItem, quantity);
                   items.set(listNumber2 -1, item1);
                   break;
               default:
                   System.out.println("Invalid choice please try again!1");



           }

       }

    }

}
