
package l1q3;

//Predefined constant /ENUM is a special data type defined by myself

import java.util.Arrays;

enum Status{
    UP,
    DOWN
}
        
public class SimpleNetwork {
    private String name;
    private String ip;
    private String subnet;
    private Status status;

    public SimpleNetwork(String name, String ip, String subnet, Status status) {
        this.name = name;
        this.ip = ip;
        this.subnet = subnet;
        this.status = status;
        System.out.println("Host Name: "+name+" IP: "+ip+" Subnet Mask: "+subnet+" Status: "+status);
    }
    
    public int[] AND(){
        String [] octetArray = this.ip.split("\\.");
        String [] maskArray = this.subnet.split("\\.");
        int [] results = new int[4];
        for(int i=0; i<4; i++){
            int ipOctet = Integer.parseInt(octetArray[i]);
            int maskOctet = Integer.parseInt(maskArray[i]);
            int result = ipOctet & maskOctet;
            results[i]=result;
        }
        return results;
    }
    
    public boolean isSameNetwork(SimpleNetwork n){
        //Arrays.toString -- print array as a String
        return Arrays.toString(n.AND()).equals(Arrays.toString(this.AND()));
    }
    
    public void ping(SimpleNetwork n){
        if(n.status == Status.DOWN)
            System.out.println(this.name + " cannot ping " + n.name + " because the destination "+n.name +" is down");
        else if(!isSameNetwork(n))
            System.out.println(this.name + " cannot ping " + n.name + " because the destination "+n.name +" is located in different network");
        else
            System.out.println(this.name + " can ping " + n.name);
    }
    
    
    
}
