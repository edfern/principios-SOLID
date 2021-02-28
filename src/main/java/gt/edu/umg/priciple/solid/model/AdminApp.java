package gt.edu.umg.priciple.solid.model;


public class AdminApp extends Person implements IAdminPermission{

    /**
     * Default constructor
     */
    private String gmail;
    public AdminApp(String name, String surName, String phone, String gmail) {
        super(name,surName,phone);
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

    @Override
    public String deletionPermission() {
        return "DELETION";
    }
}