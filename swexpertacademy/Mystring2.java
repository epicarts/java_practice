package swexpertacademy;

import java.util.Objects;

public class Mystring2 {
    String str;

    public Mystring2(String str) {
        this.str = str;
    }
    public String leftPad(int size, char fillChar) {
        int length = size - str.length();
        if (length < 0) {
            return "변환될수 없습니다.";
        }
        for (int i = 0; i < length; i++) {
            str = fillChar + str;
        }
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mystring2 mystring2 = (Mystring2) o;
        return Objects.equals(str, mystring2.str);
    }

    public String leftTrim(char trimChar) {
        int trimIndex = str.lastIndexOf(trimChar);
        return str.substring((trimIndex + 1));
    }
}