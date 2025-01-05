import java.util.Arrays;
import java.util.ArrayList;

public class BubbleSort{
    public static void main(String[] args){

        Integer[] arr = {10, 2, 15, -10, 21, 55, 0, 12};
        ArrayList<Integer> lst;
        lst = new ArrayList<Integer>(Arrays.asList(arr));
        sortList(lst);
        System.out.println(lst);
    }
    public static void sortList(ArrayList<Integer> lst){
        int temp;
        for(int i = 0; i < lst.size(); i++) {
            for(int j=0;j<lst.size()-i-1;j++){
                if(lst.get(j + 1) < lst.get(j)) {
                    temp = lst.get(j);
                    lst.set(j, lst.get(j + 1));
                    lst.set(j + 1, temp);
                }
            }

            }
    }
}