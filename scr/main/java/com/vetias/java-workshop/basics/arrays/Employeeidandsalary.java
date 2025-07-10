import java.util.Arrays;
public class Employeeidandsalary {
    public static void main(String[] args) {
        String[][] employee =new String[5][2];
        employee[0][0]="10000";
        employee[0][1]="Rishika";
        employee[1][0]="10000";
        employee[1][1]="Pramisha";
        employee[2][0]="5000";
        employee[2][1]="Dhanushya";
        for(String[] employees : employee){
            System.out.println(Arrays.toString(employees));
        }
    }
    
}


