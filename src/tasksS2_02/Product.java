package tasksS2_02;

public class Product implements IProduct {
    private IProductPart firstPart;
    private IProductPart secondPart;
    private IProductPart thirdPart;

    public void installFirstPart(IProductPart firstPart) {
        this.firstPart = firstPart;
    }

    public void installSecondPart(IProductPart secondPart) {
        this.secondPart = secondPart;
    }

    public void installThirdPart(IProductPart thirdPart) {
        this.thirdPart = thirdPart;
    }
}
