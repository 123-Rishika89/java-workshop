import java.util.Scanner;
public class NameGenerated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name:");
        String Name=input.next();
        System.out.println("enter the gender:");
        String gender=input.next();
        System.out.println("enter the qualification");
        String qualification=input.next();
        StringBuilder sb=new StringBuilder();
        if ("female".equalsIgnoreCase(gender)) {
            sb.append("Miss.").append (gender);
            String result=sb.toString();
            System.out.println(result);
        } else {
            sb.append("Mr.").append(gender);
            String result=sb.toString();
            System.out.println(result);   
        }  
    }

}
