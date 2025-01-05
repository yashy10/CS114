
public class MyString {
    private char[] chars;

    public MyString(char[] chars) {
        this.chars = chars;
    }
    public char charAt(int index) {
        return chars[index];
    }
    public int length() {
        return chars.length;
    }
    public MyString substring(int begin, int end) {
        int theLength = end - begin;
        char[] newChars = new char[theLength];
        for (int i = 0; i < theLength; i++) {
            newChars[i] = chars[begin + i];
        } return new MyString(newChars);
    }
    public MyString toLowerCase() {
        char[] smallChar = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                smallChar[i] = (char) (chars[i] + ('a' - 'A'));
            } else {
                smallChar[i] = chars[i];
            }
        } return new MyString(smallChar);
    }
    public boolean equals(MyString s) {
        if (this.chars.length != s.chars.length) {
            return false;
        }
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] != s.chars[i]) {
                return false;
            }
        } return true;
    }
    public static MyString valueOf(int i) {
        char[] convertedChar = Integer.toString(i).toCharArray();
        return new MyString(convertedChar);
    }
    public MyString[] split(String s) {
        String str = new String(this.chars);
        String[] splitStr = str.split(s);
        MyString[] newSplitArray = new MyString[splitStr.length];
        for (int i = 0; i < splitStr.length; i++) {
            newSplitArray[i] = new MyString(splitStr[i].toCharArray());
        } return newSplitArray;
    }
    public static void main(String[] args){
        MyString myString = new MyString(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println("charAt(0): " + myString.charAt(0));
        System.out.println("Length: " + myString.length());

        MyString subStr = myString.substring(1, 4);
        System.out.println("Substring (1, 4): " + new String(subStr.chars));

        MyString upperString = new MyString(new char[] {'H', 'E', 'L', 'L', 'O'});
        MyString lowerString = upperString.toLowerCase();
        System.out.println("toLowerCase: " + new String(lowerString.chars));

        MyString string1 = new MyString(new char[] {'T', 'e', 's', 't'});
        MyString string2 = new MyString(new char[] {'T', 'e', 's', 't'});
        MyString string3 = new MyString(new char[] {'T', 'e', 's', 't', 's'});
        System.out.println("string1 equals string2: " + string1.equals(string2));
        System.out.println("string1 equals string3: " + string1.equals(string3));

        MyString intString = MyString.valueOf(12345);
        System.out.println("valueOf(12345): " + new String(intString.chars));

        MyString mySplitString = new MyString(new char[] {'A', ',', 'B', ',', 'C'});
        MyString[] splitResult = mySplitString.split(",");
        System.out.println("split on ',': ");
        for (MyString part : splitResult) {
            System.out.println(new String(part.chars));
        }
    }
}
