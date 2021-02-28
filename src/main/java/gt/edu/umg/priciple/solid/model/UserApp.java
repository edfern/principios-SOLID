package gt.edu.umg.priciple.solid.model;

public class UserApp extends Person implements IUserPermission{


    public UserApp(String name, String surName, String phone) {
        super(name, surName,phone);

    }

    @Override
    public String readPermission() {
        return "READ";
    }

}
