import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for item.
 */
class Item {
    /**
     * Name of the Product.
     */
    private String name;
    /**
     * Qunatity of a product.
     */
    private int quantity;
    /**
     * Price of the Product.
     */
    private float price;
    /**
     * var to check an item in a catalog.
     */
    private boolean inCatlog = false;
    /**
     * Constructs the object.
     *
     * @param      name      The name
     * @param      quantity  The quantity
     * @param      price     The price
     */
    Item(final String name, final int quantity, final float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.inCatlog = true;
    }
    /**
     * Constructs the object.
     *
     * @param      name      The name
     * @param      quantity  The quantity
     */
    Item(final String name, final int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    /**
     *
     * @return     The name.
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name.
     *
     * @param      name  The name
     */
    public void setName(final String name) {
        this.name = name;
    }
    /**
     * Gets the quantity.
     *
     * @return     The quantity.
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Sets the quantity.
     *
     * @param      quantity  The quantity
     */
    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }
    /**
     * Gets the price.
     *
     * @return     The price.
     */
    public float getPrice() {
        return price;
    }
    /**
     * Sets the price.
     *
     * @param      price  The price
     */
    public void setPrice(final float price) {
        this.price = price;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (inCatlog) return name + " " + quantity +" "+ price;
        return name + " " + quantity;
    }
}
/**
 * Class for shopping cart.
 */
class ShoppingCart {
    private ArrayList<Item> catlog;
    private ArrayList<Item> cart;
    String[] arr = {"IND10", "IND20", "IND30", "IND50"};
    private ArrayList<String> couponCodes = new ArrayList<>(Arrays.asList(arr));
    private float coupon = 0.0f;
    private boolean cflag = false;
    /**
     * Constructs the object.
     */
    ShoppingCart () {
        cart = new ArrayList<>();
        catlog = new ArrayList<>();
    }
    /**
     * Adds to catlog.
     *
     * @param      item  The item
     */
    public void addToCatlog(final Item item) {
        catlog.add(item);
    }
    /**
     * Adds to cart.
     *
     * @param      item  The item
     */
    public void addToCart(final Item item) {
        for (Item e : catlog) {
            if (e.getName().equals(item.getName())) {
                for (Item f : cart) {
                    if (f.getName().equals(item.getName())) {
                        f.setQuantity(f.getQuantity() + item.getQuantity());
                        return;
                    }
                }
                cart.add(item);
                return;
            }
        }
    }
    /**
     * Removes  from cart.
     *
     * @param      item  The item
     */
    public void removeFromCart(final Item item) {
        for (Item f : cart) {
            if (f.getName().equals(item.getName())) {
                if (f.getQuantity() == item.getQuantity()) {
                    cart.remove(f);
                    return;
                }
                f.setQuantity(f.getQuantity() - item.getQuantity());
                return;
            }
        }
    }
    /**
     * Shows the cart.
     */
    public void showCart() {
        for (Item e: cart)
            System.out.println(e);
    }
    /**
     * Shows the catlog.
     */
    public void showCatlog() {
        for (Item e: catlog)
            System.out.println(e);
    }
    /**
     * Gets the price.
     *
     * @param      name  The name
     *
     * @return     The price.
     */
    public float getPrice(final String name) {
        for (Item e : catlog) {
            if (e.getName().equals(name)) {
                return e.getPrice();
            }
        }
        return 0.0f;
    }
    /**
     * Gets the total amount.
     *
     * @return     The total amount.
     */
    public float getTotalAmount() {
        float amt = 0.0f;
        for (Item e: cart)
            amt += e.getQuantity() * getPrice(e.getName());
        return amt;
    }
    /**
     * Gets the payable amount.
     *
     * @return     The payable amount.
     */
    public float getPayableAmount() {

        float dscnt = 0.01f * coupon;
        return (getTotalAmount() * (1f-dscnt)) * 1.15f;
    }
    /**
     * apply the cupon.
     *
     * @param      couponCode  The coupon code
     */
    public void applyCoupon(final String couponCode) {
        if (couponCodes.contains(couponCode)){
            if (!cflag) {
                coupon = Integer.parseInt(couponCode.substring(3));
                cflag = true;
            }
            return;
        }
        System.out.println("Invalid coupon");
    }
    /**
     * print the invoice.
     */
    public void printInvoice() {
        System.out.println("Name   quantity   Price");
        for (Item item : cart)
            System.out.println(item.getName() + " " + item.getQuantity() + " " + getPrice(item.getName()));
        float total = getTotalAmount();
        System.out.println("Total:" + total);
        System.out.println("Disc%:" + 0.01 * coupon * total);
        System.out.println("Tax:" + ((int) ( (total * (1f- (0.01f * coupon)) * 0.15f) * 10)) / 10.0);
        System.out.println("Payable amount: " + ((int) ( getPayableAmount() * 10)) / 10.0 );
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            String[] tokens = sc.nextLine().split(" ");
            // System.out.println(Arrays.toString(tokens));
            switch (tokens[0]) {
                case "Item" :
                if (tokens.length > 1) {
                    String[] details = tokens[1].split(",");
                    shoppingCart.addToCatlog(new Item(details[0], Integer.parseInt(details[1]), Integer.parseInt(details[2])));
                    break;
                }
                break;
                case "catalog":
                shoppingCart.showCatlog();
                break;
                case "add":
                if (tokens.length > 1) {
                    String[] details = tokens[1].split(",");
                    shoppingCart.addToCart(new Item(details[0], Integer.parseInt(details[1])));
                    break;
                }
                break;
                case "show":
                shoppingCart.showCart();
                break;
                case "totalAmount":
                System.out.println("totalAmount: " + shoppingCart.getTotalAmount());
                break;
                case "payableAmount":
                System.out.println("Payable amount: " + ((int) ( shoppingCart.getPayableAmount() * 10)) / 10.0);
                break;
                case "remove":
                if (tokens.length > 1) {
                    String[] details = tokens[1].split(",");
                    shoppingCart.removeFromCart(new Item(details[0], Integer.parseInt(details[1])));
                    break;
                }
                break;
                case "coupon":
                // System.out.println("called");
                if (tokens.length > 1) {
                    String coupon = tokens[1];
                    shoppingCart.applyCoupon(coupon);
                    break;
                }
                case "print":
                // System.out.println("called");
                shoppingCart.printInvoice();
                break;
                default:
            }
        }
    }
}
