package CEASHomework4;

public class InterleaveArrays {

    public static void main(String[] args) {

        int []newArr1 = interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6});
        System.out.print("[");
        for(int i:newArr1){
            System.out.print(i);
            if(i<newArr1.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();

        int []newArr2 = interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8});
        System.out.print("[");
        for(int i = 0;i<newArr2.length;i++){
            System.out.print(newArr2[i]);
            if(i<newArr2.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();

        int []newArr3 = interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10});
        System.out.print("[");
        for(int i = 0;i<newArr3.length;i++){
            System.out.print(newArr3[i]);
            if(i<newArr3.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();

        int []newArr4 = interleaveArrays(new int[]{100,32,64,23,567}, new int[]{2,10});
        System.out.print("[");
        for(int i = 0;i<newArr4.length;i++){
            System.out.print(newArr4[i]);
            if(i<newArr4.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");


        System.out.println();

        int []newArr5 = interleaveArrays(new int[]{1,45,25,25,95,234,70,42}, new int[]{1,45,25,25,95,234,70,42});
        System.out.print("[");
        for(int i = 0;i<newArr5.length;i++){
            System.out.print(newArr5[i]);
            if(i<newArr5.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int []newArr = new int[array1.length + array2.length];
        int i=0,k=0,j=0;

        while(i<array1.length && k<array2.length) {
            newArr[j++] = array1[i++];
            newArr[j++] = array2[k++];
        }
        while(i<array1.length) {
            newArr[j++] = array1[i++];
        }
        while(k<array2.length) {
            newArr[j++] = array2[k++];
        }

        return newArr;
    }
}