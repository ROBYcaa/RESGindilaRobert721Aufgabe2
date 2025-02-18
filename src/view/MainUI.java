package view;

import controller.CharacterController;
import controller.ProductController;
import model.Product;
import repository.CharacterRepository;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUI {
    private static ProductRepository productRepository = new ProductRepository();
    private static CharacterRepository characterRepository = new CharacterRepository();
    private static ProductController productController = new ProductController(productRepository);
    private static CharacterController characterController = new CharacterController(characterRepository);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wählen Sie eine Option:");
            System.out.println("1. Produkte verwalten");
            System.out.println("2. Charaktere verwalten");
            System.out.println("3. Beenden");
            int option = scanner.nextInt();
            scanner.nextLine(); // Puffer leeren

            if (option == 1) {
                manageProducts(scanner);
            } else if (option == 2) {
                manageCharacters(scanner);
            } else if (option == 3) {
                break;
            }
        }
    }

    private static void manageProducts(Scanner scanner) {
        while (true) {
            System.out.println("Produktverwaltung:");
            System.out.println("1. Produkt hinzufügen");
            System.out.println("2. Produkt anzeigen");
            System.out.println("3. Produkt bearbeiten");
            System.out.println("4. Produkt löschen");
            System.out.println("5. Zurück");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("Name des Produkts: ");
                String name = scanner.nextLine();
                System.out.print("Preis des Produkts: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Herkunftsregion des Produkts: ");
                String originRegion = scanner.nextLine();
                productController.addProduct(name, price, originRegion);
            } else if (option == 2) {
                productController.showAllProducts();
            } else if (option == 3) {
                System.out.print("Index des Produkts bearbeiten: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Neuer Name: ");
                String name = scanner.nextLine();
                System.out.print("Neuer Preis: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Neue Herkunftsregion: ");
                String originRegion = scanner.nextLine();
                productController.updateProduct(index, name, price, originRegion);
            } else if (option == 4) {
                System.out.print("Index des Produkts löschen: ");
                int index = scanner.nextInt();
                productController.removeProduct(index);
            } else if (option == 5) {
                break;
            }
        }
    }

    private static void manageCharacters(Scanner scanner) {
        while (true) {
            System.out.println("Charakterverwaltung:");
            System.out.println("1. Charakter hinzufügen");
            System.out.println("2. Charakter anzeigen");
            System.out.println("3. Charakter bearbeiten");
            System.out.println("4. Charakter löschen");
            System.out.println("5. Zurück");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("ID des Charakters: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Name des Charakters: ");
                String name = scanner.nextLine();
                System.out.print("Herkunftsland des Charakters: ");
                String originVillage = scanner.nextLine();
                List<Product> products = new ArrayList<>();
                System.out.print("Wie viele Produkte wurden gekauft? ");
                int productCount = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < productCount; i++) {
                    System.out.print("Produktname: ");
                    String productName = scanner.nextLine();
                    System.out.print("Preis: ");
                    double productPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Herkunftsregion: ");
                    String productOrigin = scanner.nextLine();
                    products.add(new Product(productName, productPrice, productOrigin));
                }
                characterController.addCharacter(id, name, originVillage, products);
            } else if (option == 2) {
                characterController.showAllCharacters();
            } else if (option == 3) {
                System.out.print("Index des Charakters bearbeiten: ");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Neue ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Neuer Name: ");
                String name = scanner.nextLine();
                System.out.print("Neues Herkunftsdorf: ");
                String originVillage = scanner.nextLine();
                characterController.updateCharacter(index, id, name, originVillage, new ArrayList<>());
            } else if (option == 4) {
                System.out.print("Index des Charakters löschen: ");
                int index = scanner.nextInt();
                characterController.removeCharacter(index);
            } else if (option == 5) {
                break;
            }
        }
    }
}
