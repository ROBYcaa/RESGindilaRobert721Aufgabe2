package model;
import java.util.List;

public class Character {
    private int id;
    private String name;
    private String originVillage;
    private List<Product> purchasedProducts;

    public Character(int id, String name, String originVillage, List<Product> purchasedProducts) {
        this.id = id;
        this.name = name;
        this.originVillage = originVillage;
        this.purchasedProducts = purchasedProducts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginVillage() {
        return originVillage;
    }

    public void setOriginVillage(String originVillage) {
        this.originVillage = originVillage;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    @Override
    public String toString() {
        return "Character{id=" + id + ", name='" + name + "', originVillage='" + originVillage + "', purchasedProducts=" + purchasedProducts + "}";
    }
}
