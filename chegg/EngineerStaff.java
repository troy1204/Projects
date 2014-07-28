public class EngineerStaff extends Employee {
    private double bonus;

    public EngineerStaff(String i, double s, double b){
        super(i, s);
        bonus = b;
    }
    
    public double calcSalary(){
        return salary + bonus;
    }

    public static void main(String args[]){
        EngineerStaff e1 = new EngineerStaff("Employee1", 80000.0, 500.0);
        System.out.println(e1.id + "'s salary is " + e1.calcSalary());
        EngineerStaff e2 = new EngineerStaff("Employee2", 120000.0, 3000.0);
        System.out.println(e2.id + "'s salary is " + e2.calcSalary());
    }
}
 