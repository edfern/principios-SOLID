package gt.edu.umg.priciple.solid.model;

public class TechnicalApp extends Person implements ITechnicalPermission{


    private String gmail;

    public TechnicalApp(String name, String surName, String phone, String gmail) {
        super(name, surName, phone);
        this.gmail = gmail;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String writePermission() {
        return "WRITE";
    }

    @Override
    public String readPermission() {
        return "READ";
    }

}
