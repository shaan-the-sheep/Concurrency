public class InventoryMain {
    public static void main(String[] args) {
        int numOfAdd;
        int numOfRemove;
        int bugFlag;
        //int inventorySize = 0;
        if (args.length > 0) {
            try {
                //converting arguments to integers
                numOfAdd = Integer.parseInt(args[0]); 
                numOfRemove = Integer.parseInt(args[1]); 
                bugFlag = Integer.parseInt(args[2]); 
                Warehouse w = new Warehouse();
                w.add(numOfAdd); // completing all add operations
                w.remove(numOfRemove);// completing all remove operations
                
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
}