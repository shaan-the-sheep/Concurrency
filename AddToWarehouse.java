import java.lang.Thread;

public class AddToWarehouse extends Thread {
    InventoryTracking IT;
    int bugFlag;

    AddToWarehouse(InventoryTracking IT, int bugFlag){
        this.IT = IT;
        this.bugFlag = bugFlag;
    }

    public void run(){
        if (bugFlag == 0){
            synchronized(IT){
                IT.increment();
            }
        }
        else{ 
            IT.increment();
        }
    }
}


