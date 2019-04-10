package tasksS2_02;

public class AssemblyLine implements IAssemblyLine{
    private IProductPart firstPart;
    private IProductPart secondPart;
    private IProductPart thirdPart;

    AssemblyLine() {
        ILineStep lineStep = new LineStep();
        firstPart = lineStep.buildProductPart();        
        secondPart = lineStep.buildProductPart();
        thirdPart = lineStep.buildProductPart();
    }
    
    public IProduct assembleProduct(IProduct product) {        
        product.installFirstPart(firstPart);
        product.installSecondPart(secondPart);
        product.installThirdPart(thirdPart);
        return product;
    }
}
