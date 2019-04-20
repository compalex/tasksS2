package tasksS2_02;

/**
 * The program assembles 3 ProductPart objects into Product object
 * 
 * @version 1.0
 * @author compalex
 */
public class TaskDemo {

    public static void main(String args[]) {
        IAssemblyLine tankFactory = new AssemblyLine(new LineStep(Vocabulary.TRACKS_NAME),
                new LineStep(Vocabulary.ENGINE_NAME), new LineStep(Vocabulary.TURRET_NAME));
        IProduct tank = new Product();
        tank.printStatus();
        tank = tankFactory.assembleProduct(tank);
        tank.printStatus();
    }

}
