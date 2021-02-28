package gt.edu.umg.priciple.solid.model.entity;


public class PersonEntity {

    public PersonEntity(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    private String name;
    private String surName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String toPay() {
        // TODO implement here
        return "Se ha realizado correctamente el pago";
    }
}