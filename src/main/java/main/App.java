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

            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                 System.out.println("Kiitos ohjelman käytöstä.");
                 break;
            }

            switch (choice) {

                case 1:
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
                    break;
                case 2:
                    factory.printMachines();
                    break;

                default:
                    System.out.println("Virheellinen valinta.");
            }
        }

        scanner.close();
    }

}