package nelioAlves.course.aula1;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProductStock(int quantity) {
        this.quantity -= quantity;
    }


    public String toString() {
        return  "Temos o produto " + name +
                "no valor: R$"+ String.format("%.2f",price)+
                " em " + quantity + " unidades" +
                " totalizando um total de: R$ "+String.format("%.2f",totalValueInStock());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
