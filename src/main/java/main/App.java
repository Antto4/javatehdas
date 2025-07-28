package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna tehtaalle nimi:");
        String factoryName = scanner.nextLine();
        Factory factory = new Factory(factoryName);

        int valinta;
        do {
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");
            valinta = Integer.parseInt(scanner.nextLine());

            if (valinta == 1) {
                System.out.println("Anna koneen tyyppi:");
                String type = scanner.nextLine();

                System.out.println("Anna koneen malli:");
                String model = scanner.nextLine();

                System.out.println("Anna työntekijän nimi:");
                String name = scanner.nextLine();

                System.out.println("Anna työntekijän ammattinimike:");
                String role = scanner.nextLine();

                Worker worker = new Worker(name, role);
                Machine machine = new Machine(type, model, worker);
                factory.addMachine(machine);

                System.out.println("Kone lisätty!");
            } else if (valinta == 2) {
                factory.printMachines();
            }

        } while (valinta != 0);

        System.out.println("Kiitos ohjelman käytöstä.");
        scanner.close();
    }
}