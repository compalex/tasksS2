package tasksS2_02;

public class LineStep implements ILineStep{
    private final String stepName;
    
    public LineStep(String stepName) {
        this.stepName = stepName;
    }
    
    @Override
    public String toString() {
        return stepName;
    }
    
    public IProductPart buildProductPart() {     
        return new ProductPart(stepName);
    }       
}
