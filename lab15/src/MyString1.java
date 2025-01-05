public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, end - begin);
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerChars);
    }

    public boolean equals(MyString1 s) {
        if (this.length() != s.length()) return false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        String str = Integer.toString(i);
        char[] intChars = str.toCharArray();
        return new MyString1(intChars);
    }

    public MyString1[] split(String s) {
        char delimiter = s.charAt(0);
        java.util.ArrayList<MyString1> parts = new java.util.ArrayList<>();

        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == delimiter) {
                parts.add(substring(start, i));
                start = i + 1;
            }
        }
        parts.add(substring(start, chars.length));

        return parts.toArray(new MyString1[0]);
    }
}
