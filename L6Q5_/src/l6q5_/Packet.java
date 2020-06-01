/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q5_;

import java.util.Random;

/**
 *
 * @author User
 */
public class Packet {   
    
    private String packetType;
    private int order;
    private int priority;
    private String[] packet = {"Data", "Video", "Voice"};
    private Random random = new Random();

    public Packet(int order){
        packetType = packet[random.nextInt(packet.length)];
        this.order = order;
        setPriority();
    }

    public String getPacketType() {
        return packetType;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }

    private void setPriority() {
        switch(packetType){
            case "Data":
                priority = 0;
                break;
            case "Video":
                priority = 1;
                break;
            case "Voice":
                priority = 2;
                break;
            default:
        }
    }
    
    
}
