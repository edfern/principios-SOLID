package gt.edu.umg.priciple.solid.model.entity;

public class AdultEntity extends PersonEntity {


    public AdultEntity(String name, String surName, String card, String dni) {
        super(name, surName);
        this.card = card;
        this.dni = dni;
    }

    private String dni;
    private String card;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toPay() {
        return "Se ha realizado correctamente el pago con la tarjeta: "+getCard();
    }
}
