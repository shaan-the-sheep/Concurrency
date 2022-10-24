import java.lang.Thread;

public class RemoveFromWarehouse extends Thread {
    int inventorySize;
    public RemoveFromWarehouse(int inventorySize){
        this.inventorySize = inventorySize;
    }
    public void run(){
        inventorySize--;
        System.out.println("Removed. Inventory size = " + inventorySize);
    }
}
