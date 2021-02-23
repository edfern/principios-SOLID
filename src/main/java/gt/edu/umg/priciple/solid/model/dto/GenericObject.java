package gt.edu.umg.priciple.solid.model.dto;

/**
 * 
 */
public class GenericObject {

    public GenericObject(Object object) {
        this.object = object;
    }
    public Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}