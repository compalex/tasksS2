package tasksS2_02;

import java.util.ArrayList;
import java.util.List;

public class AssemblyLine implements IAssemblyLine {
    List<ILineStep> steps = new ArrayList<ILineStep>();
    List<IProductPart> parts = new ArrayList<IProductPart>();

    AssemblyLine(ILineStep... step) {
        for (ILineStep s : step) {
            steps.add(s);
        }
        System.out.println(Vocabulary.ASSEMBLY_LINE_CONSTRUCTOR_MSG + steps);        
    }

    public IProduct assembleProduct(IProduct product) {
        for(int i = 0; i < steps.size(); i++) {
            parts.add(steps.get(i).buildProductPart());
        }
        product.installParts(parts);
        System.out.println(Vocabulary.ASSEMBLE_PRODUCT_MSG);
        return product;
    }
}
