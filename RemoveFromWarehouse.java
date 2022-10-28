import java.lang.Thread;

public class RemoveFromWarehouse extends Thread {
    InventoryTracking IT;

    RemoveFromWarehouse(InventoryTracking IT){
        this.IT = IT;
    }

    //overriding Thread::run
    public void run(){
        synchronized(IT){
            IT.decrement();
        }
    }
}
