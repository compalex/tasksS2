package tasksS2_02;

import java.util.List;

public interface IProduct {
    void installParts(List<IProductPart>part);
    void printStatus();
}
