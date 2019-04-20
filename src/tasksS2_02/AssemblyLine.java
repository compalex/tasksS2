package tasksS2_02;

import java.util.ArrayList;
import java.util.List;

public class AssemblyLine implements IAssemblyLine {
    private List<ILineStep> steps; 

    public AssemblyLine(ILineStep... step) {
        steps = new ArrayList<ILineStep>();
        
        for (ILineStep s : step) {
            steps.add(s);
        }
        System.out.println(Constants.ASSEMBLY_LINE_CONSTRUCTOR_MSG + steps);        
    }

    @Override
    public IProduct assembleProduct(IProduct product) {        
        product.installParts(buildParts());
        System.out.println(Constants.ASSEMBLE_PRODUCT_MSG);
        return product;
    }
    
    private List<IProductPart> buildParts() {
        List<IProductPart> parts = new ArrayList<IProductPart>();        
        
        for(ILineStep s : steps) {
            parts.add(s.buildProductPart());
        }
        return parts;
    }
}
