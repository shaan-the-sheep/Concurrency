import java.lang.Thread;

public class AddToWarehouse extends Thread {
    int inventorySize;
    public AddToWarehouse(int inventorySize){
        this.inventorySize = inventorySize;
    }
    public void run(){
        inventorySize++;
        System.out.println("Added. Inventory size = " + inventorySize);
    }
}

