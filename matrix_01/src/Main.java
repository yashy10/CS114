
public class Main {
    public static void main(String[] args) {

        int [][] matrix = new int[4][4];
        double rand;
        for(int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                rand = Math.random();
                if(rand >= 0.5){
                    matrix[i][j] = 1;
                }
            }
        }


    }
}