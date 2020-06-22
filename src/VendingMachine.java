public class VendingMachine {
    /** This class describes a Vending Machine.
     *  When created it have all the feature below.
     *  The user can modify name, price, quantity, unusedCredit,...
     *  @author Phan, Truong Son
     *  */
    private String productName = "Product Name";
    private double price = 0.0;
    private int quantity = 0;
    private double unusedCredit = 0.0;
    private double totalAmount = 0.0;

    /**
     * Get and set method to modify and get private value
     * @return
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public double getUnusedCredit() {
        return unusedCredit;
    }

    public void setUnusedCredit(double unusedCredit) {
        this.unusedCredit = unusedCredit;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Add money to the machine
     * @param amount Coin to insert
     */
    void addMoney(double amount)
    {
        unusedCredit = unusedCredit + amount;
        totalAmount = totalAmount + amount;
    }

    /**
     * Check if user could vend an item
     * @return boolean value
     */
    boolean vendProduct()
    {
        return unusedCredit >= price;
    }

    /**
     * @return coin unused
     */
    double coinReturn()
    {
        return unusedCredit;
    }

    /**
     * Caculate quantity, unused amount after vended product
     */
    void vendedProduct(){
        quantity = quantity - 1;
        unusedCredit = unusedCredit -price;
    }

    @Override
    public String toString() {
        return "Vending Machine contains: " + quantity + " " + productName + ", price: " + price +
                "\n\tUnused Credit: " + unusedCredit +
                "\n\tTotal Amount of Money Vended: " + totalAmount;
    }

}
