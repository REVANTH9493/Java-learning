public class Employee_details {
    public static void main(String[] args){
        String[][] details = {
            {"Emp No", "Emp Name", "Join Date", "Designation Code", "Department", "Basic", "HRA", "IT"},
            {"1001","Ashish","01/04/2009","e","R&D", "20000", "8000", "3000" },
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Dest", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };
        String[][] da = {
            {"e", "Engineer     ", "20000"},
            {"c", "Consultant   ", "32000"}, 
            {"k", "Clerk        ", "12000"},
            {"r", "Recceptionist", "15000"},
            {"m", "Manager      ", "40000"}
        };
        int row = 0;
        int rowda = 0;
        int salary = 0;
        boolean cond = false;
        for(int i=0; i<details.length; i++){
            if(args[0].equals(details[i][0])){
                row = i;
                cond = true;
                break;
            }
            else cond = false;
        }
        for(int i=0; i<da.length; i++){
            if(details[row][3].equals(da[i][0])){
                rowda = i;
                break;
            }
        }
        if(cond){
            salary = Integer.parseInt(details[row][5]) + Integer.parseInt(details[row][6]) +  Integer.parseInt(da[rowda][2]) - Integer.parseInt(details[row][7]);
            System.out.println("EmpNo  EmpName  Department Acct  Designation Clerk  Salary");
            System.out.println(details[row][0]+ "\t" + details[row][1] + "\t" + details[row][4] + "\t\t  " + da[rowda][1] + "\t    " + salary);
        }
        else{
            System.out.println("There is no EmpId with: "+ args[0]);
        }
    }       
}
