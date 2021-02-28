package gt.edu.umg.priciple.solid.model;

public class UserApp extends Person implements ISecurityPermission{


    public UserApp(String name, String surName, String phone) {
        super(name, surName,phone);

    }


    @Override
    public String writePermission() {
        return "WRITE";
    }

    @Override
    public String readPermission() {
        return null;
    }

    @Override
    public String deletionPermission() {
        return null;
    }
}
