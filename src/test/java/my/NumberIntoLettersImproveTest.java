package my;

import com.code.my.NumberIntoLettersImprove;

/**
 * stage 2
 *  support converting the digits from 0 to 99 into letters
 */
public class NumberIntoLettersImproveTest {
    public static void oneElement0() {
        int[] temp=new int[]{0,1,3,10,11,12};
        NumberIntoLettersImprove.numberIntoLettersWithArray(temp);
    }
    public static void moreElement() {
        int[] temp=new int[]{0,1,2,3,4,5,7,8,9,10,11,12,13,14,15,16};
        NumberIntoLettersImprove.numberIntoLettersWithArray(temp);
    }
    public static void moreElement099() {
        int[] temp=new int[100];
        for (int i=0;i<=99;i++) {
            temp[i]=i;
        }
        NumberIntoLettersImprove.numberIntoLettersWithArray(temp);
    }
    public static void main(String[] args) {
        oneElement0();
        moreElement();
        moreElement099();
    }
}
