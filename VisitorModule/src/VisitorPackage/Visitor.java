package VisitorPackage;

public class Visitor {
    String Name;
    String Email;

    public Visitor(String name, String email) {
        Name = name;
        Email = email;
    }

    public String getName() {
        return Name;
    }
    public String getEmail() {
        return Email;
    }
}
