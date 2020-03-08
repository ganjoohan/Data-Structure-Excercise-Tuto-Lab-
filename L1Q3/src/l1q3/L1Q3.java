
package l1q3;

public class L1Q3 {

    public static void main(String[] args) {
        SimpleNetwork a = new SimpleNetwork("Host 1", "10.1.1.1", "225.225.225.224", Status.UP);
        SimpleNetwork b = new SimpleNetwork("Host 2", "10.1.1.2", "225.225.225.224", Status.DOWN);
        SimpleNetwork c = new SimpleNetwork("Host 3", "10.1.1.70", "225.225.225.224", Status.UP);
        SimpleNetwork d = new SimpleNetwork("Host 4", "10.1.1.15", "225.225.225.224", Status.UP);
        
        a.ping(b);
        a.ping(c);
        a.ping(d);
    }
    
}
