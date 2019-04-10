

public class AssemblyLine implements IAssemblyLine{
    private ILineStep firstStep;
    private ILineStep secondStep;
    private ILineStep thirdStep;

    AssemblyLine() {
        firstStep = new LineStep();
        secondStep = new LineStep();
        thirdStep = new LineStep();
    }
    
    public IProduct assembleProduct(IProduct product) {        
        product.installFirstPart(firstStep.buildProductPart());
        product.installSecondPart(secondStep.buildProductPart());
        product.installThirdPart(thirdStep.buildProductPart());
        return product;
    }
}
