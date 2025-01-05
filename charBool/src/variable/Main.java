package variable;


public class Main {
    public static void main(String[] args) {




        boolean equation = booleanPractice();
        System.out.println(equation);
        if (!equation){
            System.out.println("'got some remainder'");
        }
    }
    public static






    public static boolean booleanPractice() {
        double variable = 20.00;
        double variable2 = 80.00;
        double total = 0;
        total = (variable + variable2) * 100.00;
        double total2 = total % 40.00;
        double truee = 0.0;
        boolean equation = (total2 == truee) ? true : false;
        return equation;
    }
}