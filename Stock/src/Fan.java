public class Fan {
    public static void Main(String[] args){

        fans fann = new fans();
        fann.setSpeed(fans.FAST);
        fann.setRadius(10);
        fann.setColor("yellow");
        fann.setOn(true);

        System.out.println(fann.toString());


    }
}
