package gt.edu.umg.priciple.solid.model;

public class SeatingStandard implements ISeating{
    private final String name = "Seating Standard";

    @Override
    public String getName() {
        return name;
    }
}
