package root;

public class Main {
    public static void main(String[] args){
        sbi obj = new sbi();
        System.out.print("Sbi:");
        obj.interestRate(obj.x);
        hdfc obj1 = new hdfc();
        System.out.print("HDFC:");
        obj1.interestRate(obj1.x);
        axis obj2 = new axis();
        System.out.print("Axis:");
        obj2.interestRate(obj2.x);
    }
}
