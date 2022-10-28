import java.lang.Thread;

public class AddToWarehouse extends Thread {
    InventoryTracking IT;

    AddToWarehouse(InventoryTracking IT){
        this.IT = IT;
    }

    public void run(){
        synchronized(IT){
            IT.increment();
        }
    }
}

