package gt.edu.umg.priciple.solid.model.entity;


public class PersonEntity {

    public PersonEntity(String dni, String name, String surName, String card) {
        this.dni = dni;
        this.name = name;
        this.surName = surName;
        this.card = card;
    }
    private String dni;
    private String name;
    private String surName;
    private String card;

    public String toPay() {
        // TODO implement here
        return "Se ha realizado correctamente el pago";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}