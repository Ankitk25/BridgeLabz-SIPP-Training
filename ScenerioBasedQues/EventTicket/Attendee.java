class Attendee {
    private String name;
    private int age;
    private String email;

    public Attendee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return name + " (Age: "+age+", Email: "+email+")";
    }
}