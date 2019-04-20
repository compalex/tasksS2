package tasksS2_02;

public class ProductPart implements IProductPart {
    private final String partName;
    
    ProductPart(String stepName) {
        partName = stepName;
    }
    
    @Override
    public String toString() {
        return partName;
    }
}
