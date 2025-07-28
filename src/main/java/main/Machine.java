package main;

public class Machine {
    private String type;
    private String model;
    private Worker worker;

    public Machine(String type, String model, Worker worker) {
        this.type = type;
        this.model = model;
        this.worker = worker;
    }

    @Override
    public String toString() {
        return "Koneen tiedot: " + type + ", " + model + "\n" + worker;
    }
    
}