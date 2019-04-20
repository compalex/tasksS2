package tasksS2_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssemblyLine implements IAssemblyLine {
    private List<ILineStep> steps; 

    public AssemblyLine(ILineStep... steps) {
        this.steps = new ArrayList<ILineStep>(Arrays.asList(steps));
        System.out.println(Constants.ASSEMBLY_LINE_CONSTRUCTOR_MSG + this.steps);        
    }

    @Override
    public IProduct assembleProduct(IProduct product) {        
        product.installParts(buildParts());
        System.out.println(Constants.ASSEMBLE_PRODUCT_MSG);
        return product;
    }
    
    private List<IProductPart> buildParts() {
        List<IProductPart> parts = new ArrayList<IProductPart>();        
        
        for(ILineStep step : steps) {
            parts.add(step.buildProductPart());
        }
        return parts;
    }
}
