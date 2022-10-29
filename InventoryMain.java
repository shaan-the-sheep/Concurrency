public class InventoryMain {
    public static void main(String[] args) {
        int numOfAdd;
        int numOfRemove;
        int bugFlag;
        if (args.length > 0) {
            try {
                //converting arguments to integers
                numOfAdd = Integer.parseInt(args[0]); 
                numOfRemove = Integer.parseInt(args[1]); 
                bugFlag = Integer.parseInt(args[2]); 
                if((bugFlag != 0) && (bugFlag != 1)){
                    System.out.println("Bug flag is incorrect");
                    System.exit(0);
                }
                InventoryTracking IT = new InventoryTracking();
                Warehouse w = new Warehouse(IT, bugFlag);
                int temp = 0;
                if (numOfAdd >= numOfRemove){
                    for(int i=0; i<numOfAdd; i++){
                        w.addItem();
                        if (temp < numOfRemove){
                            w.removeItem();
                            temp++;
                        }
                    }
                }
                else{
                    for(int i=0; i<numOfRemove; i++){
                        w.removeItem();
                        if (temp < numOfAdd){
                            w.addItem();
                            temp++;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
}