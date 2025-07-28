package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna tehtaalle nimi:");
        String name = scanner.nextLine();
        Factory factory = new Factory(name);

        while (true) {
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Anna koneen tyyppi:");
                String type = scanner.nextLine();
                System.out.println("Anna koneen malli:");
                String model = scanner.nextLine();
                System.out.println("Anna työntekijän nimi:");
                String workerName = scanner.nextLine();
                System.out.println("Anna työntekijän ammattinimike:");
                String role = scanner.nextLine();

                Worker worker = new Worker(workerName, role);
                Machine machine = new Machine(type, model, worker);
                factory.addMachine(machine);
                System.out.println("Kone lisätty!");

            } else if (input.equals("2")) {
                factory.printMachines();
            } else if (input.equals("0")) {
                System.out.println("Kiitos ohjelman käytöstä.");
                break;
            }
        }

        scanner.close();
    }

}