import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the magnitude of the angle in degrees: ");
        int angle=sc.nextInt();
        
        if(angle==0)
        
            System.out.println("Zero angle");  
        
        else if(angle%360<90 && angle%360>0)
            
            System.out.println("Acute angle");
        
        else if(angle%360==90)
            
            System.out.println("Right angle");
        
        else if(angle%360<180 && angle%360>90)
            
            System.out.println("Obtuse angle");
        
        else if(angle%360==180)
            
            System.out.println("Straight angle");
        
        else if(angle%360<360 && angle%360>180)
            
            System.out.println("Reflex angle");
        
        else if(angle%360==0)
            
            System.out.println("Full angle");
        
     
       
    }
    
}
