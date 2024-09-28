import java.util.ArrayList;

public class Warehouse {
    InventoryTracking IT;
    int bugFlag;
    //lists that hold the handle of each thread created
    ArrayList<AddToWarehouse> listOfAdds = new ArrayList<AddToWarehouse>();
    ArrayList<RemoveFromWarehouse> listOfRemoves = new ArrayList<RemoveFromWarehouse>();

    Warehouse(InventoryTracking IT, int bugFlag){
        this.IT = IT;
        this.bugFlag = bugFlag;
    }

    //creates and starts an AddToWarehouse thread
    public void addItem(){
        AddToWarehouse a = new AddToWarehouse(IT, bugFlag);
        a.start();
        listOfAdds.add(a);
    }
    
    public void joinAllAdds() throws InterruptedException{
        for (int i=0; i<listOfAdds.size(); i++){
            listOfAdds.get(i).join();
        }
    }

    //creates and starts a RemoveFromWarehouse thread
    public void removeItem(){
        RemoveFromWarehouse r = new RemoveFromWarehouse(IT, bugFlag);
        r.start();
        listOfRemoves.add(r);
    }

    public void joinAllRemoves() throws InterruptedException{
        for (int i=0; i<listOfRemoves.size(); i++){
            listOfRemoves.get(i).join();
        }
    }

    
}

