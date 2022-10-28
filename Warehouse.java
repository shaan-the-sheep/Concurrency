public class Warehouse {
    InventoryTracking IT;

    Warehouse(InventoryTracking IT){
        this.IT = IT;
    }

    public void doAllAdds(int numOfAdd){
        for(int i = 0; i<numOfAdd; i++){
            AddToWarehouse a = new AddToWarehouse(IT);
            a.start();
        }
    }

    public void doAllRemoves(int numOfRemove){
        for(int i = 0; i<numOfRemove; i++){
            RemoveFromWarehouse r = new RemoveFromWarehouse(IT);
            r.start();
        }
    }
}

