package tasksS2_02;

import java.util.List;

public class Product implements IProduct {
    List<IProductPart> parts;

    @Override
    public void installParts(List<IProductPart> parts) {
        this.parts = parts;
    }
    
    @Override
    public void printStatus() {
        System.out.println(Constants.PRODUCT_STATUS_MSG + parts);
    }
}
