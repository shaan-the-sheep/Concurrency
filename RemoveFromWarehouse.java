import java.lang.Thread;

public class RemoveFromWarehouse extends Thread {
    InventoryTracking IT;
    int bugFlag;

    RemoveFromWarehouse(InventoryTracking IT, int bugFlag){
        this.IT = IT;
        this.bugFlag = bugFlag;
    }

    //overriding Thread::run
    public void run(){
        if (bugFlag == 0){
            synchronized(IT){
                IT.decrement();
            }
        }
        else{
            IT.decrement();
        }
    }
}
