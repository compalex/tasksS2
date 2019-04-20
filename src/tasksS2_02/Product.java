package tasksS2_02;

import java.util.List;

public class Product implements IProduct {
    List<IProductPart> parts;

    public void installParts(List<IProductPart> parts) {
        this.parts = parts;
    }

    public void printStatus() {
        System.out.println(Vocabulary.PRODUCT_STATUS_MSG + parts);
    }
}
