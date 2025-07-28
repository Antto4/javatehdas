package main;

public class Worker {
    private String name;
    private String role;

    public Worker(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Työntekijän tiedot: " + name + ", " + role;
    }

}