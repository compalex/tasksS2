package tasksS2_02;

/**
 * The program assembles 3 ProductPart objects into Product object
 * @version 1.0
 * @author compalex
 */
public class TaskDemo {

    public static void main(String args[]) {
        IAssemblyLine assemblyShop = new AssemblyLine();
        IProduct tank = new Product();
        tank = assemblyShop.assembleProduct(tank);
    }
    
}
