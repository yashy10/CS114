//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    double realPart;
    private String imaginaryPart;
    public String toString(){
        String st = "";
        st = st + "Real part: " + realPart + "imaginary part: " + imaginaryPart;
        return st;
    }

    public static void main(String[] args) {

        Main m = new Main();
        System.out.println(m);


    }
}