
package l6q5_;

import java.util.Random;

public class L6Q5_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int amountOfPacket = 10;
        Packet[] packet = new Packet[amountOfPacket];
        Random random = new Random();

        System.out.println(amountOfPacket + " packet(s) arrived");
        for(int i = 0; i < packet.length; i++) {
            packet[i] = new Packet(i+1);
            System.out.println(packet[i].getPacketType() + " " + packet[i].getOrder() + " (Priority=" + packet[i].getPriority() + ')');
        }

        PriorityQueue<Packet> que = new PriorityQueue<>();
        for(int i = 0; i < amountOfPacket; i++){
            que.enqueuePriority(packet[i]);
        }

        System.out.printf("\nProcessing %d network packets\n", amountOfPacket);
        que.showQueue();
        
    }
}
