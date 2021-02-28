package gt.edu.umg.priciple.solid.model;


public abstract class Person {

    public Person(String name, String surName, String phone) {
        this.name = name;
        this.surName = surName;
        this.phone = phone;
    }

    private String name;
    private String surName;
    private String phone;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}