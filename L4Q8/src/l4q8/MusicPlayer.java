/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q8;


import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Path;

public class MusicPlayer {
    
    public static void main(String[] args) {
        Music[]m=new Music[4];
        CircularLinkedList list=new CircularLinkedList<>();
        int select=0,index=0;
        Scanner sc=new Scanner(System.in);
        String indicator = "1 Play Music | 2 Foward | 3 Back | 4 Stop | -1 Exit : ";
        m[0] = new Music("Music : one", "src/l4q8/Anne-Marie.mp3");
        m[1] = new Music("Music : two", "src/l4q8/Ariana.mp3");
        m[2] = new Music("Music : three", "src/l4q8/Lewis.mp3");
        m[3] = new Music("Music : four", "src/l4q8/9420.mp3");
        for(int i=0;i<m.length;i++){
            list.addCircularNode(m[i]);
        }
        System.out.println("My Music Play List");
        while(select!=-1){
            list.showCircularNode();
            System.out.print(indicator);
            select=sc.nextInt();
            switch(select){
                case 1:
                    index=0;
                    System.out.println("Play Music : "+list.getTitle(index));
                    playMusic((String)list.getFileName(index));
                    break;
                case 2:
                    index++;
                    System.out.println("Forward One Position - Play Music : "+list.getTitle(index));
                    playMusic((String)list.getFileName(index));
                    break;
                case 3:
                    if(index-1<0)
                        index=0;
                    else
                        index--;
                    System.out.println("Backward One Position - Play Music : "+list.getTitle(index));
                    playMusic((String)list.getFileName(index));
                    break;
                case 4:
                    index=0;
                    System.out.println("Stop Playing");
                    break;
                case -1:
                    System.out.println("Exit Music Player");
                    break;
                default:
                    break;
            }
        }
        System.exit(0);
    }
    
    public static void playMusic(String title){
        // code to play mp3 file for 10 seconds         
        JFXPanel panel = new JFXPanel();         
        String song = title;         
        Media hit = new Media(Paths.get(song).toUri().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit); 
        mediaPlayer.play();         
        try {             
            Thread.sleep(10000);         
        } catch (InterruptedException e) {}         
        mediaPlayer.stop();         
//        System.exit(0);
    }
}
