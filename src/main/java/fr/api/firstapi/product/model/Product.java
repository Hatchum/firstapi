package fr.api.firstapi.product.model;

@SuppressWarnings("unused")
public class Product {
    private int id;
    private String name;
    private String description;
    private int price;

    /*
            Constructeurs
     */
    /**
     * Constructeur par défaut de la classe {@link Product}
     */
    public Product() {}

    /**
     * Constructeur de la classe {@link Product}
     *
     * @param id id du produit
     * @param name nom du produit
     * @param description description du produit
     */
    public Product(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Constructeur de la classe {@link Product}
     * @param id id du produit
     * @param name nom du produit
     * @param price prix du produit
     */
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /*
            GETTERS & SETTERS
     */
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String desc = "Product {"+
                "id : " + this.getId() + "\n" +
                "name : " + this.getName() + "\n";

        if (this.getDescription() != null && "".equals(this.getDescription())) {
            desc = desc.concat("description : " + this.getDescription() + "\n");
        }

        desc = desc.concat("price : " + this.getPrice() + "}");

        return desc;
    }
}
