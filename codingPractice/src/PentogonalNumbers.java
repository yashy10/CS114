//(10 points) A pentagonal number is defined as 𝑛 ∗ (3 ∗ 𝑛 − 1)/2 for n = 1, 2, ....and so on.
// Therefore the first few numbers are 1, 5, 12, 22,.....
// Write a method with the following header that returns a pentagonal number:
//public static int getPentagonalNumber(int n)
//For example, getPentagonalNumber(1) returns 1 and getPentagonalNumber(2) returns 5.
// Write a test program that uses this method to display first 20 pentagonal numbers.

public class PentogonalNumbers {
    public static void main(String[] args){
        for (int i = 1; i <=20; i++){
            System.out.println(getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n){
        return n*(3*n-1)/2;
    }
}
