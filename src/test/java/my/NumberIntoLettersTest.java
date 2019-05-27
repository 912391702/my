package my;

import com.code.my.NumberIntoLetters;

public class NumberIntoLettersTest {
    public static void oneElement0() {
        int[] temp=new int[]{0};
        NumberIntoLetters.numberIntoLettersWithArray(temp);
    }
    public static void oneElement1() {
        int[] temp=new int[]{1};
        NumberIntoLetters.numberIntoLettersWithArray(temp);
    }
    public static void oneElement9() {
        int[] temp=new int[]{9};
        NumberIntoLetters.numberIntoLettersWithArray(temp);
    }

    public static void twoElement01() {
        int[] temp=new int[]{0,1};
        NumberIntoLetters.numberIntoLettersWithArray(temp);
    }

    public static void twoElement23() {
        int[] temp=new int[]{2,3};
        NumberIntoLetters.numberIntoLettersWithArray(temp);
    }
    public static void twoElement46() {
        int[] temp=new int[]{4,5,6};
        NumberIntoLetters.numberIntoLettersWithArray(temp);
    }
    public static void twoElement09() {
        int[] temp=new int[]{0,1,2,3,4,5,6,7,8,9};
        NumberIntoLetters.numberIntoLettersWithArray(temp);
    }
    public static void main(String[] args) {
        oneElement0();
        oneElement1();
        oneElement9();
        twoElement01();
        twoElement23();
        twoElement46();
        twoElement09();
    }
}
