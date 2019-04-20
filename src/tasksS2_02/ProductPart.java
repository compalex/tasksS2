package tasksS2_02;

public class ProductPart implements IProductPart {
    private final String partName;
    
    public ProductPart(String stepName) {
        partName = stepName;
    }
    
    @Override
    public String toString() {
        return partName;
    }
}
