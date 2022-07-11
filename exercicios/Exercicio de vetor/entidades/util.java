package entidades;

public class util{
    private String name;
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public util(String name, String email) {
        this.name = name;
        this.email = email;

    }
    
    public String toString(){
        return name + ", " + email;
    }
}