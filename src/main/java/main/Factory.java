package main;
import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines;

    public Factory(String name) {
        this.name = name;
        this.machines = new ArrayList<>();
    }

    public void addMachine(Machine m) {
        machines.add(m);
    }

    public ArrayList<Machine> getMachines() {
        return machines;
    }

    public void printMachines() {
        System.out.println("Tehtaasta " + name + " löytyy seuraavat koneet:");
        for (Machine m : machines) {
            System.out.println(m);
            System.out.println();
        }
    }
    
}