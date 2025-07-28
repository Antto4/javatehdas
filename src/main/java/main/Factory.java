package main;
import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines;

    public Factory(String name) {
        this.name = name;
        this.machines = new ArrayList<>();
    }

    public void addMachine(Machine machine) {
        machines.add(machine);
    }

    public void printMachines() {
        System.out.println("Tehtaasta " + name + " löytyy seuraavat koneet:");
        for (Machine machine : machines) {
            System.out.println(machine);
            System.out.println();
        }
    }

}