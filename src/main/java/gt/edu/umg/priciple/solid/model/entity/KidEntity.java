package gt.edu.umg.priciple.solid.model.entity;


public class KidEntity extends PersonEntity {

    /**
     * Default constructor
     */
    public KidEntity(String name, String surName) {
        super(null,name,surName,null);
    }

    @Override
    public String toPay() {
        return "Un niño no puede realizar un pago";
    }
}