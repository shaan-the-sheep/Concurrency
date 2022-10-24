public class Warehouse {
    int inventorySize = 0;

    public void add(int numOfAdd){
        for(int i = 0; i<numOfAdd; i++){
            AddToWarehouse a = new AddToWarehouse(inventorySize);
            a.start();
        }
    }

    public void remove(int numOfRemove){
        for(int i = 0; i<numOfRemove; i++){
            RemoveFromWarehouse r = new RemoveFromWarehouse(inventorySize);
            r.start();
        }
    }
}

