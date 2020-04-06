import java.util.ArrayList;
import java.util.ListIterator;
public class MyArrayList
{
    public static void main(String[] args) {
        ArrayList<String> minecraftEquip = new ArrayList<String>();


        minecraftEquip.add("sword");
        minecraftEquip.add("pickax");
        minecraftEquip.add("shovel");
        minecraftEquip.add("diamond hoe");
        minecraftEquip.add("crafting table");
        ListIterator it = minecraftEquip.listIterator();


        System.out.println(minecraftEquip);

        while(it.hasNext())
        {
            System.out.println(it.next());
        }//end while

        minecraftEquip.remove("pickax");
        it = minecraftEquip.listIterator();
        System.out.println("________Next Output_______");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }//end while

        minecraftEquip.remove(3);

        it = minecraftEquip.listIterator();
        System.out.println("**************** Next Output ********");
        while(it.hasNext())
        {
            System.out.println("Now I have a" + it.next());
        }//end 3rd while

        System.out.println("\nI have " + minecraftEquip.size() + "items.");
        for (int i = 0; i < minecraftEquip.size(); i++)
        {
            System.out.println("The" + i + "the item is " + minecraftEquip.get(i));
        }//end loop
        minecraftEquip.set(0,"shirt");
    }//end main method
}//end class
