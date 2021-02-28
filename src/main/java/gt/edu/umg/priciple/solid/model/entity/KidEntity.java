package gt.edu.umg.priciple.solid.model.entity;


public class KidEntity extends PersonEntity {

    /**
     * Default constructor
     */
    public KidEntity(String name, String surName, AdultEntity tutor) {
        super(name,surName);
        this.tutor = tutor;
    }
    private AdultEntity tutor;

    public AdultEntity getTutor() {
        return tutor;
    }

    public void setTutor(AdultEntity tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toPay() {
        return tutor.toPay();
    }

}