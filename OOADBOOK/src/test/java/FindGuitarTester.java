import org.example.Guitar;
import org.example.Inventory;

public class FindGuitarTester {
    public static void main(String[] args) {
        //Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("",
                0,
                "fender",
                "Stratocastor",
                "eletric",
                "Alder",
                "Alder");

        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("Erin, you might like this "
                    + guitar.getBuilder() + " " + guitar.getModel()
                            + " " + guitar.getType() + "guitar:\n "
                            + guitar.getBackWood() + "back and sides, \n "
                            + guitar.getTopWood() + " top. \nYou can have it for only $"
                            + guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {

    }
}
