public class Warehouse {
    InventoryTracking IT;
    int bugFlag;

    Warehouse(InventoryTracking IT, int bugFlag){
        this.IT = IT;
        this.bugFlag = bugFlag;
    }

    public void addItem(){
        AddToWarehouse a = new AddToWarehouse(IT, bugFlag);
        a.start();
    }
    

    public void removeItem(){
        RemoveFromWarehouse r = new RemoveFromWarehouse(IT, bugFlag);
        r.start();
    }
}

