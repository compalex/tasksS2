package tasksS2_02;

public class LineStep implements ILineStep{
    
    public IProductPart buildProductPart() {     
        return new ProductPart();
    }       
}
