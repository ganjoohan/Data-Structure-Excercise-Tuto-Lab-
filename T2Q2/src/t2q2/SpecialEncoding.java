
package t2q2;


public class SpecialEncoding <A> {

    private A[] input;

    public SpecialEncoding(A[] input) {
        this.input = input;
    }

    public A[] getInput() {
        return input;
    }

    public void setInput(A[] input) {
        this.input = input;
    }

    @Override
    public String toString() {
        System.out.print("The Code is ");
        String output = "";
        for (A input1 : input) {
            System.out.print(input1 + " ");
        }
        
        System.out.print("\nThe Command is ");
        if(input instanceof Integer[]){
            for (A input1 : input) {
                int value = Integer.parseInt(input1.toString());
                switch(value){
                    case 0: output+= "Copy ";break;
                    case 1: output+= "Delete ";break;
                    case 2: output+= "Insert ";break;
                    case 3: output+= "Print ";break;
                    case 4: output+= "Rename ";break;
                    case 5: output+= "Paste ";break;
                    
                }
            }

        }else if(input instanceof Character[]){
             for(int i=0;i<input.length;i++){
                char value = input[i].toString().charAt(0);
                switch(value){
                    case 'C': output+= "Copy ";break;
                    case 'D': output+= "Delete ";break;
                    case 'I': output+= "Insert ";break;
                    case 'P': output+= "Print ";break;
                    case 'R': output+= "Rename ";break;
                    case 'V': output+= "Paste ";break;
                    
                }
            }

        }
        return output;
    }
    
    

    
    
    


    

    
    
    
}
