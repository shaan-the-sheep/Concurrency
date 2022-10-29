public class Warehouse {
    InventoryTracking IT;
    int bugFlag;

    Warehouse(InventoryTracking IT, int bugFlag){
        this.IT = IT;
        this.bugFlag = bugFlag;
    }

    public void doAllAdds(int numOfAdd){
        for(int i = 0; i<numOfAdd; i++){
            AddToWarehouse a = new AddToWarehouse(IT, bugFlag);
            a.start();
        }
    }

    public void doAllRemoves(int numOfRemove){
        for(int i = 0; i<numOfRemove; i++){
            RemoveFromWarehouse r = new RemoveFromWarehouse(IT, bugFlag);
            r.start();
        }
    }
}

