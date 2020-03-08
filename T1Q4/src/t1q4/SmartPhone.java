
package t1q4;

public class SmartPhone implements Comparable<SmartPhone> {
    protected String name;
    protected Integer price;

    public SmartPhone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (RM " + price + ") ";
    }
    
    @Override
    public int compareTo(SmartPhone sp){
        return this.price.compareTo(sp.price);
    }


    
    
}
