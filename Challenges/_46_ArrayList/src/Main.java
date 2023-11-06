import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       boolean flag = true;
       ArrayList<String> groceries = new ArrayList<>();
       while(flag) {
          printActions();
          switch (Integer.parseInt(scanner.nextLine())){
              case 1 -> addItem(groceries);
              case 2 -> remoreItem(groceries);
              default -> flag = false;
          }
          groceries.sort(Comparator.naturalOrder());
           System.out.println(groceries);
       }
    }

    private static void addItem(ArrayList<String> groceries){
        System.out.println("Add item(s), separate itme by comma : ");
        String[] itmes = scanner.nextLine().split(",");
        for (String i : itmes) {
            String trimmedItem = i.trim();
            if(!groceries.contains(trimmedItem)){
                groceries.add(trimmedItem);
            }
        }
    }

    private static void remoreItem(ArrayList<String> groceries){
        System.out.println("Remove item(s), separate itme by comma : ");
        String[] itmes = scanner.nextLine().split(",");

        for (String i : itmes) {
            String trimmedItem = i.trim();
            groceries.remove(trimmedItem);
        }
    }


    private static void printActions(){
        String textBlock = """
                Available actions:
                0 - exit
                1 - add item
                2 - remove item
                Enter a number for what you want to do:""";
        System.out.println(textBlock + " ");
    }
}