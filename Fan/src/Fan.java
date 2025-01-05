public class Fan {
    public static void main(String[] args){

        fans fann = new fans();
        fann.setSpeed(fans.FAST);
        fann.setRadius(10);
        fann.setColor("yellow");
        fann.setOn(true);

        System.out.println(fann.toString());

        fans fan2 = new fans();
        fan2.setSpeed(fans.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println(fan2.toString());

    }
}
