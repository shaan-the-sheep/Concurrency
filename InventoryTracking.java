public class InventoryTracking {
    int inventorySize = 0;

    public void increment(){
        inventorySize++;
        System.out.println("Added. Inventory size = " + inventorySize);
    }

    public void decrement(){
        inventorySize--;
        System.out.println("Removed. Inventory size = " + inventorySize);
    }

    public int getInventorySize(){
        return inventorySize;
    }
}
