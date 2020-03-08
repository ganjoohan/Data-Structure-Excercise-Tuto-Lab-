
package t1q2;

public class Sentence {
    
    private String str;
    public Sentence(String a){
        str=a;
    }
    
    //get length
    public int getLength(){
        return str.length();
    }
    
    //get VowelCount
    public int VowelCount(){
        int count=0;
        str = str.toLowerCase();
        for (int i =0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    
    //get WordCount
    public int WordCount(){
        String [] s = str.split(" ");
        return s.length;
        
    }
    
    public String toString(){
        return str;
    }
    
    public static void main(String[] args) {
        String str = "How are you?";
        Sentence s = new Sentence(str);
        System.out.println("The sentence is "+s.toString());
        System.out.println("The length of the sentence is : "+s.getLength());
        System.out.println("The number of vowels : "+s.VowelCount());
        System.out.println("The number of words : "+s.WordCount());
    }
    


}
