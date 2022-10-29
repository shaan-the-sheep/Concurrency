import java.util.ArrayList;

public class Warehouse {
    InventoryTracking IT;
    int bugFlag;
    ArrayList<AddToWarehouse> listOfAdds = new ArrayList<AddToWarehouse>();
    ArrayList<RemoveFromWarehouse> listOfRemoves = new ArrayList<RemoveFromWarehouse>();

    Warehouse(InventoryTracking IT, int bugFlag){
        this.IT = IT;
        this.bugFlag = bugFlag;
    }

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

