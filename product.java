public class product { // superclass or parent

    protected String name;
    protected int number;
    protected int quantity;
    protected double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public product() {

        number = 0;
        name = "Product Name";
        quantity = 0;
        price = 0.0;
    }

    public product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void print() {
        System.out.println("Number  :" + number);
        System.out.println("nama    :" + name);
        System.out.println("jumlah  :" + quantity);
        System.out.println("harga   :" + price);
    }
}