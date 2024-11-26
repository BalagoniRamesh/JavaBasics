package stringImutable;

public class ForLoop{ 
    public static void main(String args[]) {        
        for (int j = 0; j < 5; j++) {
            if (j == 4) 
                break;  
            System.out.println(j); 
        } 
        System.out.println("After loop"); 
    } 
}